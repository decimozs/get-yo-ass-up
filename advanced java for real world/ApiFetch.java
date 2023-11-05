import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

/**
 * ApiFetch
 */

public class ApiFetch {
    public static void main(String[] args) {
        // create an instance for http client
        HttpClient client = HttpClient.newHttpClient();

        // define the api endpoint url
        String apiUrl = "https://quotes.toscrape.com/author/Albert-Einstein/";

        // create an http request
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(apiUrl))
            .GET()
            .build();

        try {
            // send a http request and get a response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // checl the http status code
            int statusCode = response.statusCode();

            if (statusCode == 200) {
                // request was successfull
                String responseBody = response.body();
                System.out.println("STATUS CODE: " + statusCode);
                System.out.println("API FETCH:");
                System.out.println(responseBody);
            } else {
                System.out.println("STATUS CODE: " + statusCode);
                System.out.println("API FAILED:");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}