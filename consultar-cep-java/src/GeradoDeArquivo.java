import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
public class GeradoDeArquivo {
    public void geraArquivo(Endereco endereco) throws IOException {
        // esse método recebe o record Endereco pois eu gravei o cep como um endereco em Endereco
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter(endereco.cep() + ".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();

    }
}
