package loja;

import javax.swing.JOptionPane;

public class Funcionario {
	private int cadastro;
	private String nome;
	private float salarioBase;
	private String funcao;

	public void cadastraFuncioanrio() {
		int opcao = 1;
		while (opcao != 0) {
			int erro = 1;
				cadastro =+1;
				nome = JOptionPane.showInputDialog("Insira o nome do funcionário");
				funcao = JOptionPane.showInputDialog("Qual a função do funcionario");
				while(erro == 1) {
					try {
				salarioBase = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário base do funcionario"));
				erro = 2;
				}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Formato inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}
				opcao = JOptionPane.showConfirmDialog(null, "FUNCIONÁRIO: \n NOME: " + nome + "\n FUNÇÃO: " + funcao
						+ "\n SALÁRIO: R$" + salarioBase + "\n Confirmar cadastro?");

				if (opcao == 0) {
					JOptionPane.showMessageDialog(null, "Tudo certo! Prosseguindo...");
				}
				if (opcao == 2) {
					JOptionPane.showMessageDialog(null, "Obrigado por usar nosso mini sistema!", "Obrigado", JOptionPane.PLAIN_MESSAGE);
					opcao = 0;
				}
		}
	}

	public void efetuarVenda() {

	}


}
