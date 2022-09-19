/* Ian da Silva Correia
 * ADS
 * Exercício 1
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProgDesktop {

    public static void main(String[] args){
        Float valor, produto;
        Integer desconto;
        BufferedReader linha;
       
        try{
           System.out.println("Valor do Produto.: ");
           linha = new BufferedReader(new InputStreamReader(System.in));
           valor = Float.parseFloat(linha.readLine());
           
           System.out.println("\nPorcentagem do Desconto.: ");
           linha = new BufferedReader(new InputStreamReader(System.in));
           desconto = Integer.parseInt(linha.readLine());
           
           produto = (valor * desconto) / 100;
           System.out.println("\nValor do desconto.: " + produto);
           System.out.println("\nValor do Produto com desconto.: " + (valor-produto));
           
        } catch(IOException erro){
            System.out.println("\nErro na Entrada de dados");
        } catch(NumberFormatException erro){
            System.out.println("\nErro na conversao de dados, somente use numeros");
        }
    }
}