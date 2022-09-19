/* Ian da Silva Correia
 * ADS
 * Exercício 2
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class Contagem {
    int i = 1;
    String linha = "Contador.:\n";
    
    //getters
    
    //Até 10
    public String contar(){
        linha = "Contador.:\n";
        linha = linha + i;
        for(i=2;i<=10;i++){
            linha = linha + ", " + i;
        }
        return linha;
    }
    
    //Até o numero definido pelo usuario
    public String contar(int fim){
        linha = "Contador.:\n";
        i = 1;
        linha = linha + i;
        for(i=2;i<=fim;i++){
            linha = linha + ", " + i;
        }
        return linha;
    }
    
    // Começo e fim definidos pelo usuario
    public String contar(int i, int fim){
        linha = "Contador.:\n";
        linha = linha + i;
        for(i=i+1;i<=fim;i++){
            linha = linha + ", " + i;
        }
        return linha;
    }
    
    //Começo, fim e pausa definidos pelo usuario
    //Resposta no terminal
    public void contar(int i, int fim, int pausa){
        linha = "Contador.:\n";
        System.out.println(i);
        for(i=i+1;i<=fim;i++){
            System.out.println(i);
            try {
                Thread.sleep(pausa);
            } catch (InterruptedException ex) {
                Logger.getLogger(Contagem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
