package AtividadePrincipioSubstituiçãodeLiskov;

class ContaInvestimento extends ContaBancaria {
    private int periodosBloqueio;

    public ContaInvestimento(double saldoInicial, int periodosBloqueio) {
        super(saldoInicial);
        this.periodosBloqueio = periodosBloqueio;
    }

    @Override
    public void sacar(double valor) {
        if (periodosBloqueio > 0) {
            System.out.println("Não é permitido sacar de uma conta de investimento antes do fim do período de bloqueio.");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado da conta de investimento. Saldo atual: " + saldo);
        }
    }

    public void reduzirPeriodoBloqueio() {
        if (periodosBloqueio > 0) {
            periodosBloqueio--;
        }
    }
}
