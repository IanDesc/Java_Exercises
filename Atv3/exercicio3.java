/* Ian da Silva Correia
 * ADS
 * Exercício 3
 */

import javax.swing.JOptionPane;


public class Exercicio3 {

    public void exe3(){
        Integer i=0;
        String login, senha, original = "java8";
       
        try{
            // Coleta de Dados
            do{
                login = JOptionPane.showInputDialog("Login.: ");
                senha = JOptionPane.showInputDialog("Senha.: ");
                
            //Verifica senha e exibe resultado
                if(senha.equals(original) && login.equals(original)){
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                    i = 3;
                }else{
                    i++;
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretos!\nVocê ainda tem "+i+"/3 tentativas!");
                }
            }while (i < 3);
            

        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão de dados, use somente numeros");
        }
    }
}