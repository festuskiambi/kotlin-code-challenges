package prep


import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {
    val client = HttpClient.newBuilder().build();
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://65152935dc3282a6a3cdefa1.mockapi.io/api/v1/posts"))
        .build();

    val response = client.send(request, HttpResponse.BodyHandlers.ofString());

    println(response.body())
}