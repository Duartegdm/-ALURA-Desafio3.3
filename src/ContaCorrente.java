public class ContaCorrente extends ContaBancaria{
    public void cobrarTarifaMensal() {
        saldo -= (saldo * 0.025);
    }
}
