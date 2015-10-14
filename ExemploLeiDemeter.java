package exemplo.com.model;

import java.util. ArrayList;
import java.util.List;

public class CarrinhoCompras{

	private List<Itens> itens;
	
	public CarrinhoCompras(){
		this.itens = new ArrayList<>(Itens);
		}
	
	public Double valorTotalDosItens(){
		Double valorTotal = 0.0;
		for(Itens item : itens){
			valorTotal += item.getValorDoProduto();			
		}
		return valorTotal;
	}
	
}
