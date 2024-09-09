import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Decalaração de variáveis
        double precoCusto;
        double precoVenda;
        double margem;

        // Recebimento do preço de custo
        System.out.println("Digite o valor do Preco de Compra");
        precoCusto = sc.nextDouble(); // leitura e atribuição do valor
        // Recebimento da margem
        System.out.println("Digite o percentual de Acrescimo");
        margem = sc.nextDouble();
        margem  = (margem/100); // conversão da mergem para decimal
        precoVenda = (precoCusto*(1 + margem)); // calculo do preco de venda

        // Imporessão do resultado
        System.out.printf("O Valor de custo %.2f Reais, com a margem de  %.1f%% o Valor final do Produto é R$ %.2f Reais",precoCusto,(margem*100),precoVenda);

    }
}