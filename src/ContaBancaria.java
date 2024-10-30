public class ContaBancaria {
    protected double saldo;

    public void consultarSaldo() {
        System.out.println("Saldo: "+this.saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
        System.out.printf("Você sacou R$ %.2f %n", valor);
    }
}
