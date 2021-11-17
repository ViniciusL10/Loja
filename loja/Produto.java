package loja;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Produto {
	private ArrayList<Integer> codigo = new ArrayList<Integer>();
	private ArrayList<String> descricao = new ArrayList<String>();
	private ArrayList<Double> preco = new ArrayList<Double>();
	private ArrayList<String> marca = new ArrayList<String>();
	String[] tamanho2 = {"PP", "P", "M", "G", "GG"};
	private ArrayList<String> tamanho = new ArrayList<String>();
	private ArrayList<String> cor = new ArrayList<String>();
	private ArrayList<Integer> qtdProduto = new ArrayList<Integer>();
	
	public void cadastrarProduto() {
		int duvidas = 1;
		for (int i = 0; i < tamanho2.length; i++) {
			codigo.add(+1);
		}
		
		try {
		descricao.add(JOptionPane.showInputDialog("Informe o nome do produto"));
		marca.add(JOptionPane.showInputDialog("Informe a marca do produto"));
		while(duvidas == 1) {
		int opcao = JOptionPane.showOptionDialog(null, "Escolha o tamanho do produto?",
				"Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, tamanho2, tamanho2[0]);
		if(opcao == 0) {
			tamanho.add("PP");
			duvidas = 0;
		}else if(opcao == 1) {
			tamanho.add("P");
			duvidas = 0;
		}else if(opcao == 2) {
			tamanho.add("M");
			duvidas = 0;
		}else if(opcao == 3) {
			tamanho.add("G");
			duvidas = 0;
		}else if(opcao == 4){
			tamanho.add("GG");
			duvidas = 0;
		}else {
			duvidas = JOptionPane.showConfirmDialog(null, "Você deseja cancelar?");
		}
	}
		cor.add(JOptionPane.showInputDialog("Informe a cor do produto"));
		preco.add(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto")));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Formato inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
	}
	
	public void excluirProduto() {
		visualizaProduto();
		int cod;
		cod = Integer.parseInt(JOptionPane.showInputDialog(" Insira o codigo do produto a ser excluido "));
		for (int i = 0; i < cod; i++) {
			descricao.remove(i);
			marca.remove(i);
			preco.remove(i);
			codigo.remove(i);
			cor.remove(i);
			tamanho.remove(i);
		}
	}
	
	public void visualizaProduto() {
		if(descricao.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Sem produtos cadastrados", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		else {
		for (int i = 0; i < descricao.size(); i++) {
			System.out.println("Nome Produto: " + descricao.get(i) + "\nCodigo: " + codigo.get(i) + "\nMarca: " + marca.get(i) + "\n\n");
		}
		}
	}
	
}
