import java.util.Scanner;

public class AnotarPedido {
    public static void main(String[] args) {
        
        double[] preços = { 0 , 4.00, 4.50, 5.00, 2.00,1.50}; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("CODIGO |     PRODUTO     |  PREÇO ");
        System.out.println("   1   | Cachorro quente | R$ 4.00");
        System.out.println("   2   |     X Salada    | R$ 4.50");
        System.out.println("   3   |     x bacon     | R$ 5.00");
        System.out.println("   4   |  torada simples | R$ 2.00");
        System.out.println("   5   |   refrigerante  | R$ 1.50");
        System.out.println("--------------------------------");

        System.out.println("digite sua 1 opção");
        int codigo1 = scanner.nextInt();
        System.out.println("digite sua 2 opção");
        int codigo2 = scanner.nextInt();

        double resposta =somarcoisas(preços, codigo1, codigo2);
        System.out.printf("o seu pedido deu %.2f", resposta);
    }

    public static double somarcoisas(double[] preços ,int codigo1, int codigo2){
        double resultado1 = preços[codigo1];
        double resultado2 = preços[codigo2];
        return resultado1 + resultado2;
    }
    
    
    
}

