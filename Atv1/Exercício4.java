/* Ian da Silva Correia
 * ADS
 * Exercício 4
 */
import javax.swing.JOptionPane;

public class ProgDesktop {

    public static void main(String[] args){
        Float prova1, prova2, trabalho, resultado;
        String linha;
       
        try{
           linha = JOptionPane.showInputDialog("Nota da Prova 1.: ");
           prova1 = Float.parseFloat(linha);
           
           linha = JOptionPane.showInputDialog("Nota da Prova 2.: ");
           prova2 = Float.parseFloat(linha);
           
           linha = JOptionPane.showInputDialog("Nota do trabalho.: ");
           trabalho = Float.parseFloat(linha);
           
           resultado = (prova1+prova2+trabalho)/3;
           
           if(resultado > 6){
               JOptionPane.showMessageDialog(null, "APROVADO - NOTA FINAL.: "+resultado);
           }else{
               JOptionPane.showMessageDialog(null, "REPROVADO - NOTA FINAL.: "+resultado);
           }
           
        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão de dados, use somente numeros");
        }
    }
}