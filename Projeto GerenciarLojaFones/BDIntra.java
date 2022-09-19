/* Ian da Silva Correia
 * ADS 2021-2
 */

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDIntra {
    private Intra foneint;
    private List<Intra> BDInt = new ArrayList<Intra>();
    
    //Get BD
    public List<Intra> getBDInt(){
        return BDInt;
    }
    
    //Inserir
    public Intra setBDInt(Intra foneint){
        if(consultaIDIntra(foneint)== null){
            BDInt.add(foneint);
            return foneint;
        }else{
            return null;
        }
    }
    
    //pesquisar
    public Intra consultaIDIntra(Intra foneint){
    	for(int i = 0; i < BDInt.size(); i++){
            if(foneint.getIdProduto() == BDInt.get(i).getIdProduto()){
                return BDInt.get(i);
            }
	}
	return null;
    }

    //alterar
    public Intra alterarBDInt(Intra foneint){
	for(int i = 0; i < BDInt.size(); i++){
            if(foneint.getIdProduto() == BDInt.get(i).getIdProduto()){
                String marca = JOptionPane.showInputDialog(null, "Informe a nova marca", "Atualizar os Dados", JOptionPane.QUESTION_MESSAGE);
                foneint.setMarca(marca);
                float preco = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o preço", "Atualizar os Dados", JOptionPane.QUESTION_MESSAGE));
                try {
                    foneint.setPreco(preco);
                }catch(PrecoException ex){
                    JOptionPane.showMessageDialog(null, "Preço não pode ser negativo!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
                String conexao = JOptionPane.showInputDialog(null, "Informe a nova Conexão", "Atualizar os Dados", JOptionPane.QUESTION_MESSAGE);
                foneint.setConexao(conexao);
		BDInt.set(i, foneint);  
                return BDInt.get(i);
            }
	}
        return null;
     }
    
    //Apagar
    public Intra apagarBDInt(Intra foneint){
        foneint = consultaIDIntra(foneint);
        if(foneint != null){
            BDInt.remove(foneint);
            return null;
        }else{
            return foneint;
        }
    }

}
