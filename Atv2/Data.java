/* Ian da Silva Correia
 * ADS
 * Exercício 3
 */

public class Data {
    
    public Integer getDia(String data){
        int dia;
        if(data.charAt(2) != '/' || data.charAt(5) != '/'){
            return 0;
        }
        String[] resultado = data.split("/");
        dia = Integer.parseInt(resultado[0]);
        return dia;
    }
    
    public Integer getMes(String data){
        int mes;
        if(data.charAt(2) != '/' || data.charAt(5) != '/'){
            return 0;
        }
        String[] resultado = data.split("/");
        mes = Integer.parseInt(resultado[1]);
        return mes;
    }
    
    public Integer getAno(String data){
        int ano;
        if(data.charAt(2) != '/' || data.charAt(5) != '/'){
            return 0;
        }
        String[] resultado = data.split("/");
        ano = Integer.parseInt(resultado[2]);
        return ano;
    }
}