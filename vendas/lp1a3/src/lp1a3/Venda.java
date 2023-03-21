package lp1a3;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private List<Produto> produtos = new ArrayList<>();
	
	public Venda() {
		produtos.add(new Produto("produto 1", 15));
		produtos.add(new Produto("produto 2", 20));
		produtos.add(new Produto("produto 3", 25));
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void adicionarProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void listarProdutos() {
		for(int i=0; i<produtos.size(); i++) {
			System.out.printf("id: "+i+" | ");
			System.out.println(produtos.get(i));
		}
	}
	
	public void venderProduto(int id) throws ExcecaoVenda {
		if(produtos.size() <= 0) {
			throw new ExcecaoVenda("produto nao existe");
		}
		if(produtos.contains(produtos.get(id))){
			produtos.remove(id);
		}else {
			throw new ExcecaoVenda("produto nao existe");
		}

	}
}
