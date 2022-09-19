/* Ian da Silva Correia
 * ADS
 * Exercício 2
 */
import javax.swing.JOptionPane;

public class MainContagem {
    public static void main(String[] args) {
        Contagem contador = new Contagem();
        
        
        JOptionPane.showMessageDialog(null, contador.contar());
        JOptionPane.showMessageDialog(null, contador.contar(25));
        JOptionPane.showMessageDialog(null, contador.contar(10, 25));
        contador.contar(10, 25, 300);
    }
    
}
