import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int number, i;

    i = 1;
while(i <= 12){ 
    System.out.println("Digite um numero: ");
    number = sc.nextInt();
    if (number <= 12){

        switch(number){
            case(1):
            System.out.println("Mês de Janeiro");
            break;
            case(2):
             System.out.println("Mês de Fevereiro");
             break;
            case(3):
             System.out.println("Mês de Março");
             break;
            case(4):
             System.out.println("Mês de Abril");
             break;
            case(5):
             System.out.println("Mês de Maio");
             break;
            case(6):
             System.out.println("Mês de Junho");
             break;
            case(7):
             System.out.println("Mês de Julho");
             break;
            case(8):
             System.out.println("Mês de Agosto");
             break;
            case(9):
             System.out.println("Mês de Setembro");
             break;
            case(10):
             System.out.println("Mês de Outubro");
             break;
            case(11):
             System.out.println("Mês de Novembro");
             break;
            default:
            System.out.println("Mês Dezembro");
             break;
            }

    }else{
        System.out.println("Numero Inválido");
       i = i - 1;
}
i = i + 1;
    } // While
//___________________________________________
    }
}
