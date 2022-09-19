/* Ian da Silva Correia
 * ADS 2021-2
 */

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDSupra {
    private Supra fonesup;
    private List<Supra> BDSup = new ArrayList<Supra>();
    
    //Get BD
    public List<Supra> getBDSup(){
        return BDSup;
    }
    
    //Inserir
    public Supra setBDSup(Supra fonesup){
        if(consultaIDSupra(fonesup)== null){
            BDSup.add(fonesup);
            return fonesup;
        }else{
            return null;
        }
    }
    
    //pesquisar
    public Supra consultaIDSupra(Supra fonesup){
    	for(int i = 0; i < BDSup.size(); i++){
            if(fonesup.getIdProduto() == BDSup.get(i).getIdProduto()){
                return BDSup.get(i);
            }
	}
	return null;
    }

    //alterar
    public Supra alterarBDSup(Supra fonesup){
	for(int i = 0; i < BDSup.size(); i++){
            if(fonesup.getIdProduto() == BDSup.get(i).getIdProduto()){
                String marca = JOptionPane.showInputDialog(null, "Informe a nova marca", "Atualizar os Dados", JOptionPane.QUESTION_MESSAGE);
                fonesup.setMarca(marca);
                float preco = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o preço", "Atualizar os Dados", JOptionPane.QUESTION_MESSAGE));
                try {
                    fonesup.setPreco(preco);
                }catch(PrecoException ex){
                    JOptionPane.showMessageDialog(null, "Preço não pode ser negativo!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
                int peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o novo peso", "Atualizar os Dados", JOptionPane.QUESTION_MESSAGE));
                fonesup.setPeso(peso);
		BDSup.set(i, fonesup);  
                return BDSup.get(i);
            }
	}
        return null;
     }
    
    //Apagar
    public Supra apagarBDSup(Supra fonesup){
        fonesup = consultaIDSupra(fonesup);
        if(fonesup != null){
            BDSup.remove(fonesup);
            return null;
        }else{
            return fonesup;
        }
    }

}
