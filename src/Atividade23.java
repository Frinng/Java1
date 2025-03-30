import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args){
        var entrada = new Scanner(System.in);
        boolean continuar = true;
        String Brasilia = "Brasília";
        String CapitalMg = "Belo Horizonte";
        String CapitalSp = "São Paulo";
        String CapitalRj = "Rio De Janeiro";




        while (continuar){
            System.out.println("-------Desafio de Geografia-------");
            System.out.println("Você gostaria de participar?");
            System.out.println("1-Sim");
            System.out.println("2-Não");
            String escolha = entrada.nextLine();

            if (escolha.equals("1")){
                System.out.println("Então vamos la ;) ");
                System.out.println("Qual a capital do Brasil? ");
                String capitalBrasil = entrada.nextLine();

            } else if (escolha.equals("2")) {
                System.out.println("Você deseja sair do sistema?");
                String escolha2 = entrada.nextLine();

                if (escolha2.equals("Sim")  || escolha2.equals("sim") || escolha2.equals("SIM")){
                    continuar = false;
                    System.out.println("Saindo do Sistema...");
                }else {
                    System.out.println("Retornando ao inicio");
                }

            }
        }
    }
}
