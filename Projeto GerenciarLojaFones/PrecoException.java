/* Ian da Silva Correia
 * ADS 2021-2
 */

public class PrecoException extends Exception{
    
    public void PrecoNegativo(){
        System.out.println("\n O Preco deve ser positivo, maior que zero e não conter letras!");
    }
}
