/* Ian da Silva Correia
 * ADS
 * Exercício 4
 */

import java.util.Random;

public class Senha {
    Random random = new Random();
    
    public Integer gerar(){
        int senha;
        do{
            senha = random.nextInt(99999999);
        }while(senha <= 9999999);
        return senha;
    }
}