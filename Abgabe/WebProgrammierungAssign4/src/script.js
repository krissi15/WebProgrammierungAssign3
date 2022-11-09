let blogeintreage;

window.onload = function () {
    refreshBlogList();
}

function refreshBlogList() {

    var httpRequest = new XMLHttpRequest()
    httpRequest.open("GET", "http://localhost:10000/alleblogs")
    httpRequest.onload = function () {

        if (httpRequest.status >= 200 && httpRequest.status < 300) {
            var user_table = document.getElementById("user_table_body")

            blogeintreage = JSON.parse(httpRequest.responseText);
            ausgabe();
        };
    }
    httpRequest.send()
}

function ausgabe() {
    const tab = document.getElementById("main_tab");

    tab.querySelectorAll("div").forEach(function (item){
        item.remove();
    });

    for (let i = 0; i < blogeintreage.length; i++) {


        let sp_title = document.createElement("td");
        sp_title.appendChild(document.createTextNode(blogeintreage[i]["title"]))

        let sp_author = document.createElement("td");
        sp_author.appendChild(document.createTextNode(blogeintreage[i]["author"]))

        let sp_date = document.createElement("td");
        sp_date.appendChild(document.createTextNode(ArrayToDate(blogeintreage[i]["createDate"])));

        let z1 = document.createElement("tr");
        z1.appendChild(sp_title);
        z1.appendChild(sp_author);
        z1.appendChild(sp_date);

        let sp_text = document.createElement("td");
        sp_text.setAttribute("colspan", "3");
        sp_text.appendChild(document.createTextNode(blogeintreage[i]["text"]));


        let z2 = document.createElement("tr");
        z2.appendChild(sp_text);


        let div = document.createElement("div");
        div.setAttribute("class", "eintrag");
        div.appendChild(z1);
        div.appendChild(z2);
        tab.appendChild(div);
    }
}

function ArrayToDate(arr) {
    for (let i = 1; i<=2; i++) {
        if (arr[i].toString().length == 1) {
            arr[i] = "0" + arr[i];
        }
    }
    return arr[2] + "." + arr[1] + "." + arr[0];
}

function createBlogpost(){
    var titelText = document.getElementById("title");
    var autorName = document.getElementById("author");
    var datumErstellung = document.getElementById("date");
    var blogEintrag = document.getElementById("text");

    var requestedBlog = new Object()
    requestedBlog.title = titelText.value
    requestedBlog.author = autorName.value
    requestedBlog.createDate = datumErstellung.value
    requestedBlog.text = blogEintrag.value
    var userString = JSON.stringify(requestedBlog)

    var userCreationHTTPRequest = new XMLHttpRequest()
    userCreationHTTPRequest.open("POST", "http://localhost:10000/blog")
    userCreationHTTPRequest.setRequestHeader("Content-type", "application/json")
    userCreationHTTPRequest.send(userString)
    userCreationHTTPRequest.onload = function() {
        if(userCreationHTTPRequest.status >=200 && userCreationHTTPRequest.status < 300){
            refreshBlogList();
        }
    }
}