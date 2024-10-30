public class Principal {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositar(3000);
        contaCorrente.sacar(50);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.sacar(100);
        contaCorrente.consultarSaldo();
    }
}
