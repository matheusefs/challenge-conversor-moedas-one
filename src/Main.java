import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String chaveApi = "SUA_CHAVE_AQUI";

        int opcao = 0;

        while (opcao != 7) {

            System.out.println("\n=== Conversor de Moedas ===");
            System.out.println("1 - USD → ARS");
            System.out.println("2 - ARS → USD");
            System.out.println("3 - USD → BRL");
            System.out.println("4 - BRL → USD");
            System.out.println("5 - USD → COP");
            System.out.println("6 - COP → USD");
            System.out.println("7 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = leitura.nextInt();

            if (opcao == 7) {
                System.out.println("Programa encerrado.");
                break;
            }

            String moedaBase = "";
            String moedaDestino = "";

            switch (opcao) {

                case 1:
                    moedaBase = "USD";
                    moedaDestino = "ARS";
                    break;

                case 2:
                    moedaBase = "ARS";
                    moedaDestino = "USD";
                    break;

                case 3:
                    moedaBase = "USD";
                    moedaDestino = "BRL";
                    break;

                case 4:
                    moedaBase = "BRL";
                    moedaDestino = "USD";
                    break;

                case 5:
                    moedaBase = "USD";
                    moedaDestino = "COP";
                    break;

                case 6:
                    moedaBase = "COP";
                    moedaDestino = "USD";
                    break;

                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.print("Digite o valor a converter: ");
            double valor = leitura.nextDouble();

            String url = "https://v6.exchangerate-api.com/v6/" + chaveApi +
                    "/pair/" + moedaBase + "/" + moedaDestino;

            HttpClient cliente = HttpClient.newHttpClient();

            HttpRequest requisicao = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            try {

                HttpResponse<String> resposta =
                        cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());

                String json = resposta.body();

                JsonElement elemento = JsonParser.parseString(json);
                JsonObject objeto = elemento.getAsJsonObject();

                double taxa = objeto.get("conversion_rate").getAsDouble();

                double resultado = valor * taxa;

                System.out.println(valor + " " + moedaBase + " = "
                        + resultado + " " + moedaDestino);

            } catch (IOException | InterruptedException e) {

                System.out.println("Erro ao consultar a API.");
                e.printStackTrace();
            }
        }

        leitura.close();
    }
}