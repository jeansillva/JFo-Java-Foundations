import java.lang.Math;
import java.util.Random;

/*Escreva um arquivo java, ComputeMethods.java, e defina os três métodos a seguir:
public double fToC(double degreesF)
public double hypotenuse(int a, int b)
public int roll()*/

public class ComputeMethods {

    public double fToC(double degreesF) {
        degreesF = (degreesF - 32) / 1.8;
        return degreesF;
    }

    public double hypotenuse(int a, int b) {
        double hyp = Math.sqrt(a * a + b * b);
        return hyp;
    }

    public int roll() {
        Random dado1 = new Random();
        int numA = dado1.nextInt(6) + 1;

        Random dado2 = new Random();
        int numB = dado2.nextInt(6) + 1;

        int soma = numA + numB;
        return soma;
    }
}
