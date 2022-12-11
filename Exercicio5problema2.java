import java.util.Scanner;

public class Exercicio5problema2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cor do semáforo (1- Vermelho, 2- Verde, 3- Amarelo): ");
        int cor = sc.nextInt();
        if (cor == 1) {
            System.out.println("A próxima cor é verde");
        } else if (cor == 2) {
            System.out.println("A próxima cor é amarelo");
        } else if (cor == 3) {
            System.out.println("A próxima cor é vermelho");
        } else {
            System.out.println("Cor inválida!");
        }
    }
}
