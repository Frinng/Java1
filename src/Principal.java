import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        boolean continuar = true;
        boolean aidetico = true;
        var turmane = new Turma();

        while (continuar){
            System.out.println("--------------------------------------");
            System.out.println("--------Cadastro De Estudantes--------");
            System.out.println("--------------------------------------");

            while (aidetico){

                System.out.println("Quantos Alunos voce gostaria de cadastrar? ");
                int penisnilsondasilva = Integer.parseInt(entrada.nextLine());
                var estudantes = new Estudante[penisnilsondasilva];

                int quatidadecadastradonepae = 0;
                while (quatidadecadastradonepae != penisnilsondasilva){
                    var estudante = new Estudante();

                    System.out.println("Digite o nome do aluno: ");
                    estudante.nome = entrada.nextLine();

                    System.out.println("Digite o telefone do aluno; ");
                    estudante.telefone = entrada.nextLine();

                    System.out.println("Digite o endereço do aluno: ");
                    estudante.Endereco = entrada.nextLine();

                    System.out.println("Digite a idade do aluno: ");
                    estudante.idade = Integer.parseInt(entrada.nextLine());

                    System.out.println("Digite o nome do responsavel pelo aluno: ");
                    estudante.responsavelpeloaluno = entrada.nextLine();

                    estudantes[quatidadecadastradonepae] = estudante;
                    quatidadecadastradonepae++;
                }
                System.out.println("Voltando para o inicio");

                aidetico = false;
            }
            System.out.println("Voce gostaria de sair?");
            System.out.println("Digite (SIM) para sair");
            String escolto = entrada.nextLine();
            if(escolto.equals("SIM") || escolto.equals("sim")){
                System.out.println("Saindo do sistema..");
                continuar = false;
            }else {
                System.out.println("Voltando ao inicio");
            }

        }
    }
}
