import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Recebendo o primeiro numero double em caso de receber numero decimal
        double number1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero:"));
        // Recebendo o segundo numero
        double number2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero:"));

        double soma = (number1+number2); // Calculo da soma
        // Imprimindo a soma dos dois numeros
        JOptionPane.showMessageDialog(null, "A soma dos dois números é:  " + soma);
    }
}
// 1.- Faça um algoritmo que receba dois números e exiba o resultado da sua soma.