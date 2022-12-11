import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Converter F em C:
        System.out.println("Digite a temperatura em ºF");
        double F = sc.nextDouble();
        ComputeMethods teste = new ComputeMethods();
        System.out.println("A temperatura em celsius é: " + teste.fToC(F));

        // Hipotenusa:
        System.out.println("Digite o primeiro lado da hipotenusa: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo lado da hipotenusa: ");
        int num2 = sc.nextInt();
        System.out.println("A hipotenusa é " + teste.hypotenuse(num1, num2));

        // Jogar dados:
        System.out.println("Jogando dado 1....");
        System.out.println("Jogando dado 2....");
        System.out.println("A soma dos dois dados é: " + teste.roll());
    }
}