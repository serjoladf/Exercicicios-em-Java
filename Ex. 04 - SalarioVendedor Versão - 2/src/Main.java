import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double salarioFixo = 1242.00; // Declaração do salário fixo
        double salarioFinal; // Declaração na ininicializada do Salario Final a receber parametros total
        double comissaoVendedor = 0; // Comissão do Vendedor
        // abaixo: Recebendo o nome do Vendedor
        String nomeVendedor = JOptionPane.showInputDialog("Informe o Nome do Vendedor:");
        // Recebendo a comissão do Vendedor
        double totalVendas =Double.parseDouble(JOptionPane.showInputDialog("Informe o total de vendas do Vendedor do mês:"));

        comissaoVendedor = (totalVendas * 0.15); // Cálculo da comissão do vendedor
        salarioFinal = (salarioFixo + comissaoVendedor); // Cálculo do salario final do vendedor

        // Impressão do salario final do vendedor com Printf
        System.out.printf("O Salário final do Vendedor %s é de %.2f Reais",nomeVendedor,salarioFinal);
    }
}