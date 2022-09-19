/* Ian da Silva Correia
 * ADS
 * Exercício 2
 */

import javax.swing.JOptionPane;


public class Exercicio2 {

    public void exe2(){
        Integer r1, r2, r3, r4, re, rmenor, rmaior, i;
        String linha;
       
        try{
            // Coleta de Dados
            linha = JOptionPane.showInputDialog("Informe o valor da primeira resistencia.: ");
            r1 = Integer.parseInt(linha);
            linha = JOptionPane.showInputDialog("Informe o valor da segunda resistencia.: ");
            r2 = Integer.parseInt(linha);
            linha = JOptionPane.showInputDialog("Informe o valor da terceira resistencia.: ");
            r3 = Integer.parseInt(linha);
            linha = JOptionPane.showInputDialog("Informe o valor da quarta resistencia.: ");
            r4 = Integer.parseInt(linha);
            
            
            //Calculo de Resistencias
            re = r1 + r2 + r3 + r4;
            rmenor = r1;
            if(rmenor > r2) rmenor = r2;
            if(rmenor > r3) rmenor = r3;
            if(rmenor > r4) rmenor = r4;
            rmaior = r1;
            if(rmaior < r2) rmaior = r2;
            if(rmaior < r3) rmaior = r3;
            if(rmaior < r4) rmaior = r4;
            
            //Detecção de Erro
            if(re < 0){
                JOptionPane.showMessageDialog(null, "AVISO! \nO Valor digitado não deve ser negativo!");
                System.exit(0);
            }
            
            //Saida de Dados
            JOptionPane.showMessageDialog(null, "Resistencias Fornecidas.: \n"+r1+", "+r2+", "+r3+", "+r4+".\nResistencia Equivalente.: "+re+"\nMaior Resistencia.: "+rmaior+"\nMenor Resistencia.: "+rmenor);
            

        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão de dados, use somente numeros");
        }
    }
}