import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Leitor Scanner
        Scanner sc = new Scanner(System.in);
        // Declarações das Variasveis
        double valorReal;
        double valorDolar;
        double result;

        // Recebendo  o valor da cotação do Dolar
        System.out.println(" Digite o valor da coytação do dolar em real: ");
        valorReal = sc.nextDouble();

        // Recebendo a quantidade de Dolares a ser convertido
        System.out.println(" Digite a quantidades de Dolares a ser convertido:  ");
        valorDolar = sc.nextDouble();

        result = (valorDolar*valorReal); //  Calculo da representação em real

        // Imprimindo o resultado
        System.out.printf("O valor de $ %.2f Dolares, Corresponde em Real R$ %.2f Reais", valorDolar, result);

    }
}

//8. Elaborar um algoritmo que efetue a  apresentação do valor da conversão em real (R$)
//de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do
// dólar e também a quantidade de dólares disponíveis com o usuário.