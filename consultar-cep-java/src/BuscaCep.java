import java.util.Scanner;

public class BuscaCep {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu cep: ");
        String cep = scanner.nextLine();
        
        System.out.println("Hello, World!");
        ConsultaCep consulta = new ConsultaCep();
        try {
            
            Endereco novoEndereco = consulta.buscarEnde(cep);
            System.out.println(novoEndereco);
            GeradoDeArquivo gerador = new GeradoDeArquivo();
            gerador.geraArquivo(novoEndereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
            
        }
    }
}
