import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o comprimento de onda em nanômetros: (min.: 380 e max.: 750): ");
        double comprimento = sc.nextDouble();

        if (comprimento >= 380 && comprimento <= 449) {
            System.out.println("A cor é VIOLETA");
        } else if (comprimento >= 450 && comprimento <= 494) {
            System.out.println("A cor é AZUL");
        } else if (comprimento >= 495 && comprimento <= 569) {
            System.out.println("A cor é VERDE");
        } else if (comprimento >= 570 && comprimento <= 589) {
            System.out.println("A cor é AMARELO");
        } else if (comprimento >= 590 && comprimento <= 619) {
            System.out.println("A cor é LARANJA");
        } else if (comprimento >= 620 && comprimento <= 750) {
            System.out.println("A cor é VERMELHO");
        } else {
            System.out.println("O comprimento de onda não está dentro do espectro visível.");
        }
    }
}