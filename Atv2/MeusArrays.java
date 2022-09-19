/* Ian da Silva Correia
 * ADS
 * Exercício 5
 */

import java.util.Random;

public class MeusArrays {
    
    public Integer pesquisar(Integer[] array1, Integer[] array2, int pesquisado){
        int i, resultado=0;
        for(i=0;i<array1.length;i++){
            if(array1[i] == pesquisado){
            resultado++;
            break;
            }
        }
        for(i=0;i<array2.length;i++){
            if(array2[i] == pesquisado){
            resultado++;
            break;
            }
        }
        return resultado;
    }
    
    public Integer[] retornaArray(int n){
        Random random = new Random();
        Integer[] array = new Integer[n];
        int i;
        for(i=0;i<n;i++){
            array[i] = random.nextInt(999);
        }
        return array;
    }
    
    
}
