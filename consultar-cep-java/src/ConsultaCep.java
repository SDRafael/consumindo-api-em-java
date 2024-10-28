
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class ConsultaCep {
    public Endereco buscarEnde(String cep){
        URI endereco = URI.create("https://viacep.com.br/ws/"+cep+"/json");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco)
            .build();

        
        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        
        } catch (Exception e) {
            throw new RuntimeException("Finalizando o programa por IO ou Interrupted");
        }
        

    }
}
