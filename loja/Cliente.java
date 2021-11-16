package loja;

import javax.swing.JOptionPane;

public class Cliente {
	private int cadastro;
	private String nome;
	private int idade;
	private String documento;
	String[] tipoPagto2 = {"Credito", "Debito", "Dinheiro"};
	private String tipoPagto;
	String[] pessoa2 = {"Fisica", "Juridica"};
	private String identificacao;
	
	public void cadastrarCliente() {
		int opcao = 1;
		
		while(opcao != 0) {
		int erro = 1;
		cadastro =+1;
		nome = JOptionPane.showInputDialog("Informe o nome do cliente");
		while(erro == 1) {
			try {
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do cliente"));
		erro = 2;
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Formato inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		}
		int opcao2 = JOptionPane.showOptionDialog(null, "Tipo de pessoa ",
				"Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, pessoa2, pessoa2[0]); 
		
		if(opcao2== 0) {
			identificacao= JOptionPane.showInputDialog("informe o seu cpf");
			documento = "Pessoa Fisica"; 
		}
		else if( opcao2 == 1) {
			identificacao=JOptionPane.showInputDialog("Informe o seu cnpj");
			documento = "Pessoa Jurídica";
		}
		opcao = JOptionPane.showConfirmDialog(null, "CLIENTE N°: " + cadastro + "\n NOME: " + nome + "\n IDADE: " + idade
				+ "\n DOCUMENTO : " + documento + "\n CNPJ/CPF :"+ identificacao +"\n Confirmar cadastro?");
		
		if (opcao == 0) {
			JOptionPane.showMessageDialog(null, "Tudo certo! Prosseguindo...");
		}
		if (opcao == 2) {
			JOptionPane.showMessageDialog(null, "Obrigado por usar nosso mini sistema!", "Obrigado", JOptionPane.PLAIN_MESSAGE);
			opcao = 0;
		}
	}
}
	public void pagarProduto() {
		int opcao = JOptionPane.showOptionDialog(null, "Escolha a forma de pagamento?",
				"Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, tipoPagto2, tipoPagto2[0]);
	}
	
	private int getCadastro() {
		return cadastro;
	}
	private void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getDocumento() {
		return documento;
	}
	private void setDocumento(String documento) {
		this.documento = documento;
	}
	private String getTipoPagto() {
		return tipoPagto;
	}
	private void setTipoPagto(String tipoPagto) {
		this.tipoPagto = tipoPagto;
	}
	
	
}
