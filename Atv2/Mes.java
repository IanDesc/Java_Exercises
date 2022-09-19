/* Ian da Silva Correia
 * ADS
 * Exercício 1
 */


public class Mes {
    
    //Geters
    public String getMesPorExtenso(int numMes, int idioma){
        String mes;
        
        if(idioma == 1){
            if(numMes == 1) return mes = "Janeiro";
            if(numMes == 2) return mes = "Fevereiro";
            if(numMes == 3) return mes = "Março";
            if(numMes == 4) return mes = "Abril";
            if(numMes == 5) return mes = "Maio";
            if(numMes == 6) return mes = "Junho";
            if(numMes == 7) return mes = "Julho";
            if(numMes == 8) return mes = "Agosto";
            if(numMes == 9) return mes = "Setembro";
            if(numMes == 10) return mes = "Outubro";
            if(numMes == 11) return mes = "Novembro";
            if(numMes == 12) return mes = "Dezembro";
        }else{
            if(numMes == 1) return mes = "January";
            if(numMes == 2) return mes = "February";
            if(numMes == 3) return mes = "March";
            if(numMes == 4) return mes = "April";
            if(numMes == 5) return mes = "May";
            if(numMes == 6) return mes = "June";
            if(numMes == 7) return mes = "July";
            if(numMes == 8) return mes = "August";
            if(numMes == 9) return mes = "September";
            if(numMes == 10) return mes = "October";
            if(numMes == 11) return mes = "November";
            if(numMes == 12) return mes = "December";
        }
        
        //Mensagem de erro
        return mes = "Linguagem nao especificada!";
    } 
    
}
