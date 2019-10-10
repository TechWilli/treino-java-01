import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salario:"));
        double limite = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o limite:"));

        Conta conta = new Conta(numero, salario, limite);

        conta.depositarValor(1000);
        conta.sacarValor(500);
        conta.exibirSaldo();

    }
}
