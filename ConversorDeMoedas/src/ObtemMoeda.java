import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ObtemMoeda {
    public Moeda buscaMoeda(String moeda){

        URI urlMoeda = URI.create("https://v6.exchangerate-api.com/v6/809a4f002929961c0e5dbda8/latest/"+moeda);
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(urlMoeda)
        .build();
        
        try {
            HttpResponse<String> response = client
                .send(request, BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("Finalizando por exception");
        }
    }
}
