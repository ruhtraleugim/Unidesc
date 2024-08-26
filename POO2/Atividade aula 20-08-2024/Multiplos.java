import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: a");
        int a = scanner.nextInt();
        System.out.println("Informe um número: b");
        int b = scanner.nextInt();
        
        System.out.println(PassarResultado(a, b));
    }
    public static String PassarResultado(int a , int b ){
        int r = Calculardivisores(a,b);

        if (r == 0) {
            return String.format("o número %d não é divisor de %d", a, b);
        } else return String.format("O número %d é divisor de %d", a, b);
        

    }
    public static int Calculardivisores(int a , int b){
        int v = VerificarImparPar(a, b);
        int x = b%a;
        int r = 10;

        if (v == 1 && x == 0 || v == 2 && x == 0) {
            r = 1;
        }
        else if (v == 0 || x != 0) {
            if (b%a == 0) {
                r= 1;
            }else r = 0;
        }
        return r;
    }
    public static int VerificarImparPar(int a ,int b){
        if(a%2 == 0 && b%2 == 0 ){
            return 1;
        }else if(a%2 == 1 && b%2 == 1){
            return 2; 
        }else return 0;
        
    }            
}
