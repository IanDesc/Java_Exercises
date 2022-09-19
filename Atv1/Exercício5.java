/* Ian da Silva Correia
 * ADS
 * Exercício 5
 */
import javax.swing.JOptionPane;


public class ProgDesktop {

    public static void main(String[] args){
        Integer idade, contribuicao, sexo, resultado;
        String linha;
       
        try{
           linha = JOptionPane.showInputDialog("Digite 0 para sexo Masculino ou 1 para sexo Feminino.: ");
           sexo = Integer.parseInt(linha);
            
           linha = JOptionPane.showInputDialog("Digite sua idade.: ");
           idade = Integer.parseInt(linha);
           
           linha = JOptionPane.showInputDialog("Anos de Contribuição.: ");
           contribuicao = Integer.parseInt(linha);
           
           if(sexo <= 0){
               if(idade >= 60 || contribuicao >= 30){
                   JOptionPane.showMessageDialog(null, "Você ja tem o direito a aposentadoria");
               }else{
                   resultado = 30 - contribuicao;
                   JOptionPane.showMessageDialog(null, "Ainda faltam " + resultado + " anos de contribuição!");
               }
           }else{
               if(idade >= 65 || contribuicao >= 35){
                   JOptionPane.showMessageDialog(null, "Você ja tem o direito a aposentadoria");
               }else{
                   resultado = 35 - contribuicao;
                   JOptionPane.showMessageDialog(null, "Ainda faltam " + resultado + " anos de contribuição!");
               }
           }
           
        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão de dados, use somente numeros");
        }
    }
}