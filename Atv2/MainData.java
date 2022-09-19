/* Ian da Silva Correia
 * ADS
 * Exercício 3
 */
import javax.swing.JOptionPane;

public class MainData {
    public static void main(String[] args) {
        Data pdata = new Data();
        String linha = "10/08/2003";
        String linha2 = "10-08-2003";
        
        
        System.out.println(pdata.getDia(linha));
        System.out.println(pdata.getMes(linha));
        System.out.println(pdata.getAno(linha));
        
        System.out.println(pdata.getDia(linha2));
    }
    
}
