import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("O seu PIN de usuário é 1234. Digite seu PIN de usuário:  ");
        int PIN = sc.nextInt();
        while (PIN != 1234) /* O loop é encerrado quando for verdadeiro */ {
            System.out.println("PIN incorreto, digite novamente:");
            PIN = sc.nextInt();
        }
        System.out.println("O PIN está correto, seja bem vindo á sua conta!");
    }
}
