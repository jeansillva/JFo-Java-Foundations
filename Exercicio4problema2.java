import java.util.Scanner;

public class Exercicio4problema2 {
    public static void main(String[] args) throws Exception {
        /*
         * Você deve implementar o seguinte:
         * 1. Faça com que o usuário insira um nome. ok
         * 2. Extraia o primeiro e o último nomes do nome inserido pelo usuário.
         * 3. Use os métodos de classe String para manipular name, conforme
         * especificado:
         * 4. Exiba o nome do console.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome e pressione ENTER: ");
        String n1 = sc.next();
        System.out.println("Insira seu sobrenome e pressione ENTER: ");
        String n2 = sc.next();
        sc.close();
        teste(n1, n2);
    }

    public static void teste(String nome, String sobrenome) {
        String l1 = Character.toString(nome.charAt(0));
        System.out.println("Nome: " + sobrenome + ", " + l1);
    }
}
