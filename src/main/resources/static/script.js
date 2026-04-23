function shortenUrl() {
    const input = document.getElementById("urlInput");
    const resultBox = document.getElementById("result");
    const shortLink = document.getElementById("shortLink");
    const errorBox = document.getElementById("error");

    const url = input.value.trim();

    resultBox.classList.add("hidden");
    errorBox.classList.add("hidden");

    if (url === "") {
        errorBox.innerText = "Please enter a URL";
        errorBox.classList.remove("hidden");
        return;
    }

    fetch("/shorten", {
        method: "POST",
        headers: {
            "Content-Type": "application/x-www-form-urlencoded"
        },
        body: "url=" + encodeURIComponent(url)
    })
        .then(response => {
            if (!response.ok) {
                return response.text().then(text => { throw new Error(text); });
            }
            return response.text();
        })
        .then(data => {
            shortLink.href = data;
            shortLink.innerText = data;
            resultBox.classList.remove("hidden");
        })
        .catch(err => {
            errorBox.innerText = err.message;
            errorBox.classList.remove("hidden");
        });
}

function copyUrl() {
    const link = document.getElementById("shortLink").innerText;
    navigator.clipboard.writeText(link);
}
