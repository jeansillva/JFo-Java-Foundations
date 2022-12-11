import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número para obter seus múltiplos:  ");
        int num = sc.nextInt();
        int i;
        for (i = 1; i < 13; i++) {
            System.out.println(num + "x" + i + " = " + num * i);
        }
    }
}
