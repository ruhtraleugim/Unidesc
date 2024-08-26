package AtividadePrincipioSubstituiçãodeLiskov;

class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Não é permitido sacar mais do que o saldo em uma conta poupança.");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado da conta poupança. Saldo atual: " + saldo);
        }
    }
}
