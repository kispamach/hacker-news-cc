let topNewsBtn = document.querySelector("#top-news");
let newestBtn = document.querySelector("#newest");
let jobsBtn = document.querySelector("#jobs");
let prevBtn = document.querySelector("#prev-btn");
let nextBtn = document.querySelector("#next-btn");
let articleCard = document.querySelector("#page-body");


document.body.onload = () => {
    loadArticles("/api/top-news?page=1")
}

prevBtn.addEventListener("click", evt => {
    evt.preventDefault()
    loadArticles(evt.target.href)
})

nextBtn.addEventListener("click", evt => {
    evt.preventDefault()
    loadArticles(evt.target.href)
})

topNewsBtn.addEventListener("click", evt => {
    evt.preventDefault()
    loadArticles(evt.target.href)
})

newestBtn.addEventListener("click", evt => {
    evt.preventDefault()
    loadArticles(evt.target.href)
})

jobsBtn.addEventListener("click", evt => {
    evt.preventDefault()
    loadArticles(evt.target.href)
})



function loadArticles(url) {
    fetch(url)
        .then(result => result.text())
        .then(JsonData => {
            let parsedJSON = JSON.parse(JsonData)
            articleCard.innerHTML = parsedJSON.map(article => articleCards(article)).join("\n")
        })
        .catch(console.log)
    let urlParts = url.split("?page=")
    let page = parseInt(urlParts[1])

    prevBtn.href = urlParts[0] + "?page=" + ((page > 1) ? page - 1 : page)
    nextBtn.href = urlParts[0] + "?page=" + ((page < 10) ? page + 1 : page)

}

function articleCards(articles) {
    if (articles.user != null) {
        return `<div class="col-sm-4">
            <div class="card text-white bg-secondary mb-3" style="max-width: 18rem;">
                <div class="card-header">${articles.title}</div>
                <div class="card-body">
                    <h5 class="card-title">${articles.user}</h5>
                    <p class="card-text">${articles.time_ago}</p>
                </div>
            </div>
        </div>`
    } else {
        return `<div class="col-sm-4">
                <div class="card text-white bg-secondary mb-3" style="max-width: 18rem;">
                    <div class="card-header">${articles.title}</div>
                    <div class="card-body">            
                        <p class="card-text">${articles.time_ago}</p>
                    </div>
                </div>
            </div>`
    }
}
