/* Ian da Silva Correia
 * ADS
 * Exercício 1
 */
import javax.swing.JOptionPane;

public class MainMes {
    public static void main(String[] args) {
        String linha;
        
        
        Mes mesextenso = new Mes();
        
        linha = mesextenso.getMesPorExtenso(Integer.parseInt(JOptionPane.showInputDialog("Numero do Mês.: ")), Integer.parseInt(JOptionPane.showInputDialog("Linguagem (1 para Portugues, 2 para Ingles).: ")));
        JOptionPane.showMessageDialog(null, linha);
    }
    
}
