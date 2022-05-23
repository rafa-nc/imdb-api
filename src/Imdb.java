import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Imdb {

    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://imdb-api.com/en/API/Top250Movies/k_36ma798y"))
                .GET()
                .build();


         client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                 .thenApply(HttpResponse::body)
                 .thenAccept(System.out::println)
                 .join();

    }
}
