import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tempCel;
        double tempFah;

        System.out.println(" Digite a temperatura em Celsius:");
        tempCel = sc.nextDouble();

        tempFah = (((9*tempCel)+160)/5);

        System.out.printf(" A temperatura de %.2fº Graus Celsius equivale a %.2f ºF Fahrenheit",  tempCel, tempFah);

    }
}