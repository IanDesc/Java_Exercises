/* Ian da Silva Correia
 * ADS
 * Exercício 4
 */

import javax.swing.JOptionPane;


public class Exercicio4 {

    public void exe4(){
        Integer num;
        String linha;
       
        try{
            // Coleta de Dados
            linha = JOptionPane.showInputDialog("Digite o numero para ver a tabuada.: ");
            num = Integer.parseInt(linha);
                
            // Saida de Dados
            JOptionPane.showMessageDialog(null, "Tabuada do "+num+"\n"+num+" x 1 = " +(num * 1)+"\n"+num+" x 2 = " +(num * 2)+"\n"+num+" x 3 = " +(num * 3)+"\n"+num+" x 4 = " +(num * 4)+"\n"+num+" x 5 = " +(num * 5)+"\n"+num+" x 6 = " +(num * 6)+"\n"+num+" x 7 = " +(num * 7)+"\n"+num+" x 8 = " +(num * 8)+"\n"+num+" x 9 = " +(num * 9)+"\n"+num+" x 10 = " +(num * 10));
            

        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão de dados, use somente numeros");
        }
    }
}