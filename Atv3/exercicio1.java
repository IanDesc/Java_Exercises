/* Ian da Silva Correia
 * ADS
 * Exercício 1
 */

import javax.swing.JOptionPane;


public class Exercicio1 {

    public void exe1(){
        Float valor, valornovo = 0.0f;
        String linha, nome;
       
        try{
            // Coleta de Dados
            nome = JOptionPane.showInputDialog("Nome do Produto.: ");
            
            linha = JOptionPane.showInputDialog("Digite o Valor do produto.: ");
            valor = Float.parseFloat(linha);
           
            //Detecção de Erro
            if(valor < 0){
                JOptionPane.showMessageDialog(null, "AVISO! \nO Valor digitado não deve ser negativo!");
                System.exit(0);
            }
            
            //Calculo de desconto
            if(valor >= 50 && valor < 200) valornovo = ((valor/100) * 5) + valor;
            if(valor >= 200 && valor < 500) valornovo = ((valor/100) * 6) + valor;
            if(valor >= 500 && valor < 1000) valornovo = ((valor/100) * 7) + valor;
            if(valor >= 1000) valornovo = ((valor/100) * 8) + valor;
            
            //Saida de Dados
            JOptionPane.showMessageDialog(null, "Produto.: " + nome + "\nPreço Original.: " + valor + "\nPreço com Desconto.: " + valornovo);
            

        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão de dados, use somente numeros");
        }
    }
}