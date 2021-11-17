package loja;

import javax.swing.JOptionPane;

public class Executa {

	public static void main(String[] args) {
			
		boolean repetir = true;
		String[] tipoUsuario = {"Funcionario", "Cliente"};
		String[] escolhaCliente = {"Cadastro", "Comprar", "Sair"};
		String[] escolhaFuncionario = {"Cadastro", "Cadastrar Produto","Excluir Produto", "Visualizar Produtos", "Efetuar Venda", "Sair"};
		Funcionario f = new Funcionario();
		Produto p = new Produto();
		Cliente c = new Cliente();
		
		JOptionPane.showMessageDialog(null,"Ol�! Seja bem-vindo(a) ao nosso sistema de loja!");
		while(repetir) {
		boolean repetir2 = true;
		int opcao = JOptionPane.showOptionDialog(null, "Quem � voc�?",
				"Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, tipoUsuario, tipoUsuario[0]); 
		
		if(opcao == 0) {
			while(repetir2) {
			int opcao2 = JOptionPane.showOptionDialog(null, "O que deseja fazer?",
					"Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolhaFuncionario, escolhaFuncionario[0]); 
			
			if(opcao2 == 0) {
				f.cadastraFuncionario();
			} else if (opcao2 == 1) {
				p.cadastrarProduto();
			} else if (opcao2 == 2) {
				p.excluirProduto();
			} else if (opcao2 == 3) {
				p.visualizaProduto();
			} else if(opcao2 == 4) {
				f.efetuarVenda();
			} else if(opcao2 == 5) {
				JOptionPane.showMessageDialog(null, "Saindo...");
				repetir2 = false;
			} else {
				JOptionPane.showMessageDialog(null, "Obrigado por usar nosso mini sistema!", "Fechando", JOptionPane.PLAIN_MESSAGE);
				repetir = false;
				repetir2 = false;
			}
		}
		}
		else if(opcao == 1) {
			int opcao3 = JOptionPane.showOptionDialog(null, "O que deseja fazer?",
					"Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolhaCliente, escolhaCliente[0]);
			
			if(opcao3 == 0) {
				c.cadastrarCliente();
			} else if (opcao3 == 1) {
				c.pagarProduto();
			}
		}
	}
	}
}
