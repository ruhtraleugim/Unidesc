package AtividadePrincipioSubstituiçãodeLiskov;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente(1000);
        ContaBancaria cp = new ContaPoupanca(1000);
        ContaBancaria ci = new ContaInvestimento(1000, 2);

        cc.sacar(200); // Funciona corretamente
        cp.sacar(200); // Funciona, mas comportamento diferente
        ci.sacar(200); // Lança mensagem de erro por bloqueio
    }
}