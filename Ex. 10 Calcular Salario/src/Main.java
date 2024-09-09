import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Declarações das variáveis
        String nomeVendedor;
        double salarioFixo;
        double bonificacao;
        double totalVendas;
        double salarioFinal;
        double horasExtras;
        double valorExtra;
        double totalExtra;
        double valorComissao;
        double valorPenalidade = 0; // Precisou ser inicializada que a IDE deu atender que ela so tera valor se entrar na condição
        String recebeu;

        valorExtra = 50.00; // Atribuição fixa valor da Hora Extra

        System.out.println("Digite o nome do Vendedor:");  // Entrada do Nome do Vendedor
        nomeVendedor = sc.nextLine();

        System.out.println("Digite o salario do vendedor:");// Entrada do salário fixo,
        salarioFixo = sc.nextDouble();

        System.out.println("Digite o total de vendas do vendedor:");// Entrada do Total de Vendas do Vendedor no mês
        totalVendas = sc.nextDouble();

        System.out.println("Digite as Horas extras:"); // Entrada do toata de Hora Extras
        horasExtras = sc.nextDouble();

        totalExtra = (horasExtras * valorExtra);
        valorComissao = (totalVendas * 15 / 100);

        if (totalVendas >= 5000.00) { // Verificar se o total vendsas é menor que 5 mil

            if (totalVendas > 10000.00) {
                // Verificar se o total vendsas é maior que 10 mil
                if (totalVendas <= 20000.00) {
                    // Caso se o total vendsas menor que 20 mil
                    salarioFinal = (salarioFixo + valorComissao + totalExtra); // recebe somente esses beneficios
                    recebeu = (">> Não Recebeu Bonificação");
                }else if(totalVendas <= 50000.00){ // se o total vendsas maior que 20 mil
                    // Verificar se o sálario é maior que 20 mil e menor que 50 mil
                    bonificacao = 1000;
                    recebeu = (">> Recebeu a Bonificação de R$ 1000.00 Reais");
                    salarioFinal =  (salarioFixo + bonificacao + valorComissao + totalExtra);
                }else{  // se maior que 50 mil ele entra
                    recebeu = (">> Recebeu a Bonificação de R$ 2000,00 Reais");
                    bonificacao = 2000;
                    salarioFinal = (salarioFixo + bonificacao + valorComissao + totalExtra);
                }

            }else{ // Caso vendas menor que 10 mil entra nesta condição
                salarioFinal = (salarioFixo + valorComissao);
                recebeu = (">> Não Recebeu Bonificação e nem Hora Extra");
            }
        }else{  // Caso vendas menor que 5 mil entra nesta condiçãoo

            valorPenalidade = (salarioFixo * 10 / 100);
            salarioFinal = (salarioFixo + (totalVendas * 15 / 100) - valorPenalidade);
            recebeu = (">> Não Recebeu a Bonificação e foi Punido");
        }

        System.out.println("********** Folha de Pagamento ***********");
        System.out.println();
        System.out.println(">> Vendedor: "+ nomeVendedor);
        System.out.printf(">> Salário Fixo R$ %.2f Reais \n", salarioFixo);
        System.out.printf(">> Valor da Comissão R$ %.2f Reais \n",valorComissao);
        System.out.println(recebeu);
        if (totalVendas > 10000) { // Condição pra somente imprimir caso receba
            System.out.printf(">> Horas Extras R$  %.2f Reais \n", totalExtra );
        }else {
            System.out.println();
        }
        // Condição para imprimir somente se necessário
        if(valorPenalidade > 0) {
            System.out.printf(">> Valor da Punição R$  %.2f Reais \n", valorPenalidade );
        }else{
            System.out.println();
        }
        System.out.printf(">> Salário final é de R$ %.2f Reais \n", salarioFinal);
    }
}