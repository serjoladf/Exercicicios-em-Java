import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double salarioFixo = 1242.00; // Declaração do salário fixo
        double salarioFinal; // Declaração na ininicializada do Salario Final a receber parametros total
        double comissaoVendedor = 0; // Comissão do Vendedor
        // abaixo: Recebendo o nome do Vendedor
        String nomeVendedor = JOptionPane.showInputDialog("Informe o Nome do Vendedor:");
        // Recebendo a comissão do Vendedor
        double totalVendas = Double
                .parseDouble(JOptionPane.showInputDialog("Informe o total de vendas do Vendedor do mês:"));

        comissaoVendedor = (totalVendas * 0.15); // Cálculo da comissão do vendedor
        salarioFinal = (salarioFixo + comissaoVendedor); // Cálculo do salario final do vendedor

        if (totalVendas > 20000.00) {
            salarioFinal = salarioFinal + 1000.00;
            System.out.println("Este vendedor recebeu um acrescimo de 1000,00 Reais");
        }

        // Impressão do salario final do vendedor com Printf
        System.out.printf("O Salário fixo do Vendedor %s é de %.2f Reais\n ", nomeVendedor, salarioFixo);
        System.out.printf("A Comissãoo do Vendedor %s é de %.2f Reais\n ", nomeVendedor, comissaoVendedor);
        System.out.printf("O Salário final do Vendedor %s é de %.2f Reais\n ", nomeVendedor, salarioFinal);
    }
}

// 5.- Desenvolver um algoritmo que leia o nome de um vendedor, seu salário fixo
// e o total de vendas efetuadas por ele no mês.
// O vendedor ganha uma comissão de 15% sobre as vendas realizadas.
// No entanto, se o total de vendas for superior a R$ 20.000,00, ele recebe uma
// bonificação adicional de R$ 1.000,00. O algoritmo deve informar o nome do
// vendedor,
// o salário fixo, valor da comissão, se ele recebeu ou não a bonificação e o
// salário final no mês.