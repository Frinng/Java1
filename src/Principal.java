import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        boolean continuar = true;
        boolean aidetico = true;
        var estudante = new Estudante();
        var turmane = new Turma();
        var estudantes = new Estudante[10];

        while (continuar){
            System.out.println("--------------------------------------");
            System.out.println("--------Cadastro De Estudantes--------");
            System.out.println("--------------------------------------");

            while (aidetico){
                System.out.println("Digite o nome do estudante: ");
                estudante.nome = entrada.nextLine();

                System.out.println("Digite o telefone do estudante: ");
                estudante.telefone = entrada.nextLine();

                System.out.println("Digite o nome do responsavel pelo estudante: ");
                estudante.responsavelpeloaluno = entrada.nextLine();

                System.out.println("Digite o endereço do estudante: ");
                estudante.Endereco = entrada.nextLine();

                System.out.println("Voce gostaria de cadastrar mais um aluno? ");
                System.out.println("1-sim");
                System.out.println("2-não");
                var escolha2pqpqueodio = entrada.nextLine();

                if (escolha2pqpqueodio.equals("1") || escolha2pqpqueodio.equals("SIM") || escolha2pqpqueodio.equals("sim") ){


                }else {
                    System.out.println("Saindo do sistema.");
                    System.out.println("Saindo do sistema..");
                    System.out.println("Saindo do sistema...");
                    System.out.println("Saindo do sistema....");
                    aidetico = false;
                }
            }


        }
    }
}
