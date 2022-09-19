/* Ian da Silva Correia
 * ADS
 * Exercício 5
 */
import javax.swing.JOptionPane;


public class MainArrays {
    public static void main(String[] args) {
        
        MeusArrays Marrays = new MeusArrays();
        int i, n;
        
        //Preenche de numeros aleatorios
        Integer[] array1 = Marrays.retornaArray(10);
        Integer[] array2 = Marrays.retornaArray(24);
        
        //Imprime os Arrays para testar
        for(i=0;i<array1.length; i++)System.out.println(array1[i]);
        System.out.println("\n\n");
        for(i=0;i<array2.length; i++)System.out.println(array2[i]);
        
        //pesquisa o Numero
        n = Integer.parseInt(JOptionPane.showInputDialog("Numero para pesquisar(de 0 a 999).: "));
        i = Marrays.pesquisar(array1, array2, n);
        if(i==0) JOptionPane.showMessageDialog(null, "O Numero não esta presente em nenhum array");
        if(i==1) JOptionPane.showMessageDialog(null, "O Numero está presente em 1 Array");
        if(i==2) JOptionPane.showMessageDialog(null, "O Numero está presente em 2 Array's");
        
        
        
        

        
        
    }
    
}
