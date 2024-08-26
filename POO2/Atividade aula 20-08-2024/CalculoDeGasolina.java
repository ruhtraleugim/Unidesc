import java.util.Scanner;

public class CalculoDeGasolina {
    public static void main(String[] args) {
        final int autonomia = 12;
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tempo dirigido (em horas): ");
        int tempo = scanner.nextInt();
        
        System.out.println("Digite a velocidade média do veículo (em km/h): ");
        int velocidadeMedia = scanner.nextInt();

        double distancia = calcularDistancia(tempo, velocidadeMedia);
        double gasolinaGasta = (distancia / autonomia);
        System.out.printf("A gasolina gasta nessa viagem foi: %.3f litros.%n", gasolinaGasta);
    }
    
    public static double calcularDistancia(int tempo,int velocidadeMedia) {
        return tempo * velocidadeMedia;
    }
}
