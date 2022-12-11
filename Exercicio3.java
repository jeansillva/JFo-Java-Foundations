import java.util.Scanner;

public class Exercicio3 {
        public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);

                System.out.println("Em um certo dia de chuva um homem que atendia ao nome de...");
                System.out.println("Digite um nome fictício para prosseguir: "); // Aceitar pelo menos uma entrada, que
                                                                                 // deverá ser analisada como String
                String nome = sc.next(); // Entrada 1
                System.out.println(nome
                                + " estava aguardando um ônibus para ir até o aeroporto. Em sua mochila tinha uma nota de R$10, ele tem ciência de que a passagem custa...");
                System.out.println("Digite um valor para a passagem: ");
                double valorPassagem = sc.nextDouble(); // Entrada 2
                double troco = 10 - valorPassagem; // Cálculo com uma entrada double
                System.out.println("Custa R$" + valorPassagem + "!");
                System.out.println(
                                "Como ele precisava do troco correto para guardar em seu porquinho já havia calculado que teria que receber de volta R$"
                                                + troco);
                System.out.println(nome
                                + " coincidentemente teria que pegar o mesmo ônibus que você pois ambos estão indo ao aeroporto:");
                System.out.println("- Olá, tudo bem? - " + nome + " pergunta a você.");
                // Usar pelo menos uma entrada em uma pergunta para o usuário:
                System.out.println(
                                "- Sabe me dizer qual o número do ônibus que pode nos deixar próximo ao aeroporto, por gentileza?");
                System.out.println("Você informa: ");
                int linhaOnibus = sc.nextInt();// Entrada 3
                int subtração = linhaOnibus - 15;
                System.out.println("- Pode pegar o " + linhaOnibus + " eu também irei até o aeroporto.");
                System.out.println("- Ah, certo! - diz ele empolgado pela coincidência");
                // Fazer cálculos com pelo menos uma entrada int:
                System.out.println(
                                "- Esse número do ônibus me lembra muito quando eu era pequeno, foi com ele que minha falecida avó me ensinou fazer subtração.\n "
                                                + "Ela o usava de exemplo e dizia para que eu começasse subtraindo com 5, 10, 15 e assim eu ia desenvolvendo.\n"
                                                + "Lembro que meu primeiro cálculo foi " + linhaOnibus + " - 15. \n"
                                                + "Fiz nos dedos hahaha. Então o número " + subtração
                                                + " também ficou na minha cabeça desde então por ser o resultado. Nunca esqueço desses números.");
                System.out.println("Escutando atentamente você faz um breve comentário: ");
                String comenta = sc.next(); // Entrada 4
                System.out.println(comenta + "!");
                System.out.println("- Qual o seu nome? " + nome + " pergunta a você.");
                String nome2 = sc.next(); // Entrada 5
                System.out.println("- Interessante! Você aparenta ser bem jovem, qual sua idade?");
                System.out.println("Digite sua idade: ");
                int idade = sc.nextInt(); // Entrada 6
                System.out.println("- Muito bacana! Eu tenho 28.");
                System.out.println(
                                "- O ônibus está demorando um pouco, não é? Qual o horário que ele costuma passar aqui?");
                System.out.println("Digite a hora (00 a 23) que o ônibus costuma a passar:");
                int horaPassagem = sc.nextInt(); // Entrada 7
                System.out.println("- Ele costuma passar ás " + horaPassagem + ". - Você diz a " + nome);
                System.out.println(
                                "- Entendi, já é quase hora. Faltam apenas 7 minutos! Você tem o dinheiro da passagem com você? Digo: para facilitar o troco para o motorista.");
                System.out.println("Insira sua resposta: ");
                String resposta1 = sc.next(); // Entrada 8
                System.out.println(
                                "- Eu até tenho, mas se em algum momento for necessário a você pode me avisar, tudo bem? - Diz "
                                                + nome);
                System.out.println("- O ônibus surge e então você e" + nome
                                + " entram e fazem companhia até o aeroporto. Chegando lá ele faz uma nova pergunta ");
                System.out.println("- Para onde está indo seu vôo? O meu vai para Barcelona. ");
                System.out.println("Você então diz: ");
                String a = sc.next(); // Entrada 9
                System.out.println("- Que bacana! Bom, foi um prazer enorme te conhecer " + nome2
                                + " espero te ver de novo nessa jornada da vida. Pego meu vôo em poucos minutos.");
                System.out.println("Você se despendido diz: ");
                String despedida = sc.next(); // Entrada 10
                sc.close();
                System.out.println("Após alguns minutos de companheirismo os dois se despedem e seguem seus rumos.");
                System.out.println(
                                "No futuro algum deles pode se lembrar desse momento e perguntar onde aquela pessoa se encontra hoje?");
        }

}
