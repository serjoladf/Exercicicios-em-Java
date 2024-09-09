import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia; // Declaração Distancia
        double totaCombustivel; // Declaração do Total combustivel
        double consumoMedio = 14; // Declaração consumo medio do Automóvel

        System.out.println("Digite a distância a pecorrer:");
        distancia = sc.nextDouble(); // Recebendo a distância

        totaCombustivel = distancia/consumoMedio; // Cálculo do combustível a  ser gasto no percusso

        // Imprimindo o resultado final das operações
        System.out.printf("É necessário %.2f litros de combustível",totaCombustivel);
    }
}

//EX8
//Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a
// distância total percorrida pelo automóvel e o total de combustível gasto