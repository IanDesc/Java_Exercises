/* Ian da Silva Correia
 * ADS
 * Exercício 4
 */

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Exercicio.: \nDigite\n1 para Exercicio1\n2 para Exercicio2\n3 para Exercicio3\n4 para Exercicio4"));
        
        Exercicio1 e1 = new Exercicio1();
        Exercicio2 e2 = new Exercicio2();
        Exercicio3 e3 = new Exercicio3();
        Exercicio4 e4 = new Exercicio4();
        
        switch(resposta){
            case 1: e1.exe1();break;
            case 2: e2.exe2();break;
            case 3: e3.exe3();break;
            case 4: e4.exe4();break;
        }
                
    }
    
}
