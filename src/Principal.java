import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        boolean continuar = true;
        var estudante = new Estudante();
        var turmane = new Turma();

        while (continuar){
            System.out.println("--------------------------------------");
            System.out.println("--------Cadastro De Estudantes--------");
            System.out.println("--------------------------------------");
            System.out.println("Digite o nome do estudante: ");
            estudante.nome = entrada.nextLine();

            System.out.println("Digite o telefone do estudante: ");
            estudante.telefone = entrada.nextLine();

            System.out.println("Digite o nome do responsavel pelo estudante: ");
            estudante.responsavelpeloaluno = entrada.nextLine();

            System.out.println("Digite o endereço do estudante: ");
            estudante.Endereco = entrada.nextLine();




        }
    }
}
