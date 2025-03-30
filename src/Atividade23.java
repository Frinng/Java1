import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args){
        var entrada = new Scanner(System.in);
        boolean continuar = true;
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

                if (capitalBrasil.equals("Brasilia") || capitalBrasil.equals("BRASILIA") || capitalBrasil.equals("Brasília") || capitalBrasil.equals("brasilia")){
                    System.out.println("Parabens,esta é a capítal do Brasil");
                    System.out.println("Tambem conhecida como Distrito Federal");
                    System.out.println(":)");
                    continuar = false;
                } else if (capitalBrasil.equals("Rio Branco") || capitalBrasil.equals("RIO BRANCO") || capitalBrasil.equals("rio branco")) {
                            System.out.println("Esta é a capital do Estado Federativo do Acre ");
                            System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Maceió") || capitalBrasil.equals("MACEIO") || capitalBrasil.equals("maceio")) {
                    System.out.println("Esta é a capital do Estado Federativo de Alagoas");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Macapá") || capitalBrasil.equals("Macapa") || capitalBrasil.equals("macapa") || capitalBrasil.equals("MACAPA")) {
                    System.out.println("ESta é a capital do Estado Federativo do Amapá");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Manaus") || capitalBrasil.equals("MANAUS") || capitalBrasil.equals("manaus")) {
                    System.out.println("Esta é a capital do Estado Federativo do Amazonas");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Salvador") || capitalBrasil.equals("SALVADOR") || capitalBrasil.equals("salvador")) {
                    System.out.println("Esta é a capital do Estado Federativo da Bahia");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Fortaleza") || capitalBrasil.equals("FORTALEZA") || capitalBrasil.equals("fortaleza")) {
                    System.out.println("Esta é a capital do Estado Federativo do Ceará");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Vitória") || capitalBrasil.equals("VITORIA") || capitalBrasil.equals("vitoria")) {
                    System.out.println("Esta é a capital do Estado Federativo Do Espirito Santo");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Goiânia") || capitalBrasil.equals("goiânia") || capitalBrasil.equals("goiania") || capitalBrasil.equals("GOIANIA")) {
                    System.out.println("Esta é a capital do Estado Federativo De Goiás");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("São Luís") || capitalBrasil.equals("SÂO LUÍS") || capitalBrasil.equals("são luís")) {
                    System.out.println("Esta é a capital do Estado Federativo do Maranhão");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Cuiabá") || capitalBrasil.equals("cuiabá") || capitalBrasil.equals("CUIABÁ")) {
                    System.out.println("Esta é a capital do Estado Federativo De Mato Grosso");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Campo Grande") || capitalBrasil.equals("CAMPO GRANDE") || capitalBrasil.equals("campo grande")) {
                    System.out.println("Esta é a capital do Estado Federativo Do Mato Grosso Do Sul");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Belo Horizonte") || capitalBrasil.equals("BELO HORIZONTE") || capitalBrasil.equals("belo horizonte")) {
                    System.out.println("Esta é a capital do Estado Federativo De Minas Gerais");
                    System.out.println("BH É NOIS ZE");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Belém") || capitalBrasil.equals("belém") || capitalBrasil.equals("BELÉM")) {
                    System.out.println("Esta é a capital do Estado Federativo do Pará");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("João Pessoa") || capitalBrasil.equals("joão pessoa") || capitalBrasil.equals("JOÃO PESSOA")) {
                    System.out.println("Esta é a capital do Estado Federativo da Paraíba");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Curitiba") || capitalBrasil.equals("curitiba") || capitalBrasil.equals("CURITIBA")) {
                    System.out.println("Esta é a capital do Estado Federativo do Paraná");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Recife") || capitalBrasil.equals("recife") || capitalBrasil.equals("RECIFE")) {
                    System.out.println("Esta é a capital do Estado Federativo De Pernambuco");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Teresina") || capitalBrasil.equals("teresina") || capitalBrasil.equals("TERESINA")) {
                    System.out.println("Esta é a capital do Estado Federativo De Piauí");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Rio de Janeiro") || capitalBrasil.equals("rio de janeiro") || capitalBrasil.equals("RIO DE JANEIRO")) {
                    System.out.println("Esta é a capital do Estado Federativo Do Rio De janeiro");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Natal") || capitalBrasil.equals("natal") || capitalBrasil.equals("NATAL")) {
                    System.out.println("Esta é a capital do Estado Federativo do Rio Grande do Norte");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Porto Alegre") || capitalBrasil.equals("porto alegre") || capitalBrasil.equals("PORTO ALEGRE")) {
                    System.out.println("Esta é capital do Estado Federativo Do Rio Grande do Sul");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Porto Velho") || capitalBrasil.equals("porto velho") || capitalBrasil.equals("PORTO VELHO")) {
                    System.out.println("Esta é a capital do Estado Federativo De Rondônia");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Boa Vista") || capitalBrasil.equals("boa vista") || capitalBrasil.equals("BOA VISTA")) {
                    System.out.println("Esta é a capital do Estado Federativo de Roraima");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Florianópolis") || capitalBrasil.equals("florianópolis") || capitalBrasil.equals("FLORIANÓPOLIS")) {
                    System.out.println("Esta é a capital do Estado Federativo de Santa Catarina");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("São Paulo") || capitalBrasil.equals("são paulo") || capitalBrasil.equals("SÃO PAULO")) {
                    System.out.println("Esta é a capital do Estado Federativo de São Paulo");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Aracaju") || capitalBrasil.equals("aracaju") || capitalBrasil.equals("ARACAJU")) {
                    System.out.println("Esta é a capital do Estado Federativo de Sergipe");
                    System.out.println("Tente novamente");
                } else if (capitalBrasil.equals("Palmas") || capitalBrasil.equals("PALMAS") || capitalBrasil.equals("palmas")) {
                    System.out.println("Esta é a capital do Estado Federativo de Tocantins");
                    System.out.println("Tente novamente");
                }else {
                    System.out.println("Que pena,voce errou,tente novamente");
                    System.out.println(":)");
                }


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
