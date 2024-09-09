public class Main {
    public static void main(String[] args) {
        int a = 10; // Declaração de a
        int b = 20; // Declaração de b
        int c = 0;  // Declaração de c

        // Imprimindo o valor atual
        System.out.printf("O valor Atual de A = %d, B = %d\n", a, b);

        c = a; // C recebe A
        a = b; // A recebe B
        b = c; // B Recebe C, que C esta com o valor de A

        // Imprimindo o valor depois das trocas
        System.out.printf("O valor Trocado de A = %d, B = %d\n", a, b);
    }
}