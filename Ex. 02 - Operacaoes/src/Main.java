import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Recebendo o primeiro numero double em caso de receber numero decimal
        double number1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero:"));
        // Recebendo o segundo numero
        double number2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero:"));

        double soma = (number1+number2); // Calculo da soma
        double subtracao = (number1 - number2); // Calculo da Subtração
        double multiplicacao = (number1 * number2); // Calculo da Multiplicação
        double divisao = (number1 / number2); // Calculo da Divisão
        // Imprimindo a soma dos dois numeros
        JOptionPane.showMessageDialog(null, "A soma dos dois números é:  " + soma);
        JOptionPane.showMessageDialog(null, "A subtração dos dois números é:  " + subtracao);
        JOptionPane.showMessageDialog(null, "A multiplicação dos dois números é:  " + multiplicacao);
        JOptionPane.showMessageDialog(null, "A divisão dos dois números é:  " + divisao);

    }
}