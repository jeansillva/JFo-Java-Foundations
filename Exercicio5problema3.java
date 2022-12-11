import java.util.Scanner;

public class Exercicio5problema3 {
    public static void main(String[] args) throws Exception {
        /*
         * Implemente o exercício 5-2 usando a instrução switch e certifique-se de que o
         * programa alerte os usuários caso eles insiram um valor inválido.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cor do semáforo (1- Vermelho, 2- Verde, 3- Amarelo): ");
        int cor = sc.nextInt();
        switch (cor) {
            case 1:
                System.out.println("A próxima cor é verde");
                break;
            case 2:
                System.out.println("A próxima cor é amarelo");
                break;
            case 3:
                System.out.println("A próxima cor é vermelho");
                break;
            default:
                System.out.println("Cor inválida!");
        }
    }
}
