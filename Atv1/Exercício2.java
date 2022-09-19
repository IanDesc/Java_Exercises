/* Ian da Silva Correia
 * ADS
 * Exercício 2
 */

import java.util.Scanner;

public class ProgDesktop {

    public static void main(String[] args){
        Integer ptsLider, ptsLanterna, resultado;
        Scanner linha;
       
        try{
           System.out.println("Pontos do Campeao.: ");
           linha = new Scanner(System.in);
           ptsLider = linha.nextInt();
           
           System.out.println("Pontos do Lanterna.: ");
           linha = new Scanner(System.in);
           ptsLanterna = linha.nextInt();
           
           resultado = (ptsLider - ptsLanterna) / 3;
           System.out.println("\nVitorias Necessarias para ultrapassar o lider.: " + resultado);
           
        } catch(NumberFormatException erro){
            System.out.println("\nErro na conversao de dados, somente use numeros");
        }
    }
}