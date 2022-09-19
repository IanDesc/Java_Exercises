/* Ian da Silva Correia
 * ADS 2021-2
 */

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDExtra {
    private Extra foneext;
    private List<Extra> BDExt = new ArrayList<Extra>();
    
    //Get BD
    public List<Extra> getBDExt(){
        return BDExt;
    }
    
    //Inserir
    public Extra setBDExt(Extra foneext){
        if(consultaIDExtra(foneext)== null){
            BDExt.add(foneext);
            return foneext;
        }else{
            return null;
        }
    }
    
    //pesquisar
    public Extra consultaIDExtra(Extra foneext){
    	for(int i = 0; i < BDExt.size(); i++){
            if(foneext.getIdProduto() == BDExt.get(i).getIdProduto()){
                return BDExt.get(i);
            }
	}
	return null;
    }

    //alterar
    public Extra alterarBDExt(Extra foneext){
	for(int i = 0; i < BDExt.size(); i++){
            if(foneext.getIdProduto() == BDExt.get(i).getIdProduto()){
                String marca = JOptionPane.showInputDialog(null, "Informe a nova marca", "Atualizar os Dados", JOptionPane.QUESTION_MESSAGE);
                foneext.setMarca(marca);
                float preco = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o preço", "Atualizar os Dados", JOptionPane.QUESTION_MESSAGE));
                try {
                    foneext.setPreco(preco);
                }catch(PrecoException ex){
                    JOptionPane.showMessageDialog(null, "Preço não pode ser negativo!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
                int arco = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Novo tamanho do Arco", "Atualizar os Dados", JOptionPane.QUESTION_MESSAGE));
                foneext.setTamanhoArco(arco);
		BDExt.set(i, foneext);  
                return BDExt.get(i);
            }
	}
        return null;
     }
    
    //Apagar
    public Extra apagarBDExt(Extra foneext){
        foneext = consultaIDExtra(foneext);
        if(foneext != null){
            BDExt.remove(foneext);
            return null;
        }else{
            return foneext;
        }
    }

}
