/* Ian da Silva Correia
 * ADS
 * Exercício 3
 */
import javax.swing.JOptionPane;


public class ProgDesktop {

    public static void main(String[] args){
        Float vlTransacao, vlVenal, resultado;
        Integer imposto;
        String linha;
       
        try{
           linha = JOptionPane.showInputDialog("Valor de Transação.: ");
           vlTransacao = Float.parseFloat(linha);
           
           linha = JOptionPane.showInputDialog("Valor Venal.: ");
           vlVenal = Float.parseFloat(linha);
           
           linha = JOptionPane.showInputDialog("Valor de Imposto.: ");
           imposto = Integer.parseInt(linha);
           
           if(vlTransacao > vlVenal){
               resultado = (vlTransacao * imposto) / 100;
           }else{
               resultado = (vlVenal * imposto) / 100;
           }
           JOptionPane.showMessageDialog(null, "Imposto a ser pago.: "+resultado);
           
        } catch(NumberFormatException erro){
            System.out.println("\nErro na conversao de dados, somente use numeros");
        }
    }
}