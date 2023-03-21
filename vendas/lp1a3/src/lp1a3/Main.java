package lp1a3;

import java.util.Scanner;

public class Main {
	private static int op, id;
	private static double valor;
	
	public static void main(String[] args) {
		Venda venda = new Venda();
		Scanner sc = new Scanner(System.in);
		
		do {
			menu();
			op = sc.nextInt();
			
			switch (op) {
			case 0: {
				System.exit(0);
				break;
			}
			case 1: {
				venda.listarProdutos();
				break;
			}
			case 2: {
				System.out.println("informe o id do produto para compra-lo");
				id = sc.nextInt();
				try {
					System.out.print("deposite o dinheiro: ");
					valor = sc.nextDouble();
					if(valor < venda.getProdutos().get(id).getPreco()) {
						System.out.println("valor abaixo do esperado! faltam: RS"+(venda.getProdutos().get(id).getPreco() - valor));
						break;
					}
					venda.venderProduto(id);
					System.out.println("produto vendido!");
				} catch (ExcecaoVenda e) {
					e.printStackTrace();
				}
				break;
			}
			default:
				System.err.println("opcao invalida");
			}
			
		}while(op != 0);
		
		sc.close();
	}
	
	public static void menu() {
		System.out.println("sitema de vendas");
		System.out.println("0. sair");
		System.out.println("1. listar produtos");
		System.out.println("2. vender produto");
	}

}
