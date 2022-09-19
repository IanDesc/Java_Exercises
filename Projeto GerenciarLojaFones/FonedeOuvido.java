/* Ian da Silva Correia
 * ADS 2021-2
 */


public class FonedeOuvido {
    
    //Atributos
    private float preco;
    private int idProduto;
    private String marca;

    //Métodos
    
    //Get
    public float getPreco(){
        return preco;
    }
    
    public int getIdProduto(){
        return idProduto;
    }
    
    public String getMarca(){
        return marca;
    }
    
    
    //Set
    public void setPreco(float preco) throws PrecoException{
        if(preco > 0){
            this.preco = preco;
        }else{
            throw new PrecoException();
        }
    }
    
    public void setIdProduto(int idProduto){
        if(idProduto < 0){
            System.out.println("\n O Id do Produto precisa ser positivo");
            this.idProduto = 0000;
        }else{
            this.idProduto = idProduto;
        }
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    
}
