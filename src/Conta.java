import javax.swing.JOptionPane;

public class Conta {

    private int numero;
    private double limite;
    private double saldo;

    public Conta(int numero, double limite, double saldo) {
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldo;
    }

    public int getNumero() { return this.numero; }

    public void setNumero(int numero) { this.numero = numero; }

    public double getLimite() { return this.limite; }

    public void setLimite(double limite) { this.limite = limite; }

    public double getSaldo() { return this.saldo; }

    public void setSaldo(double saldo) { this.saldo = saldo; }

    public void depositarValor(double deposito) {
        if (limite <= this.saldo + deposito) {
            this.saldo += deposito;
        } else {
            JOptionPane.showMessageDialog(null, "Limite excedido, por favor movimente sua conta para regular o " +
                    "saldo e voltar a depositar normalmente");
        }
    }

    public void sacarValor(double saque) {

        if (this.saldo >= saque) {
            this.saldo -= saque;
        } else {
            JOptionPane.showMessageDialog(null,"Saque indisponível, sua conta não tem o saldo suficiente.\nValor autual: " + this.saldo);
        }
    }

    public void exibirSaldo() {
        JOptionPane.showMessageDialog(null, "Seu saldo é de: " + this.saldo);
    }
}
