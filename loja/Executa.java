package loja;

import javax.swing.JOptionPane;

public class Executa {

	public static void main(String[] args) {
			
		String[] tipoUsuario = {"Funcionario", "Cliente"};
		String[] escolhaCliente = {"Cadastro", "Comprar", "Sair"};
		String[] escolhaFuncionario = {"Cadastro", "Cadastrar Produto","Excluir Produto", "Visualizar Produtos", "Efetuar Venda", "Sair"};
		Funcionario f = new Funcionario();
		Produto p = new Produto();
		Cliente c = new Cliente();
		
		JOptionPane.showMessageDialog(null,"Olá! Seja bem-vindo(a) ao nosso sistema de loja!");
		int opcao = JOptionPane.showOptionDialog(null, "Quem é você?",
				"Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, tipoUsuario, tipoUsuario[0]); 
		
		if(opcao == 0) {
			int opcao2 = JOptionPane.showOptionDialog(null, "O que deseja fazer?",
					"Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolhaFuncionario, escolhaFuncionario[0]); 
		}
		else if(opcao == 1) {
			int opcao3 = JOptionPane.showOptionDialog(null, "O que deseja fazer?",
					"Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolhaCliente, escolhaCliente[0]); 
		}
	}

}
