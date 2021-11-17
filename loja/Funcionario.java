package loja;

import javax.swing.JOptionPane;

public class Funcionario {
	private int cadastro;
	private String nome;
	private float salarioBase;
	private String funcao;

	public void cadastraFuncionario() {
		int opcao = 1;
		boolean exception = true;
		while (opcao != 0 && exception) {
			try {
				cadastro =+1;
				nome = JOptionPane.showInputDialog("Insira o nome do funcionário");
				funcao = JOptionPane.showInputDialog("Qual a função do funcionario");
				salarioBase = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário base do funcionario"));
				}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Formato inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
			} catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Voltando ao menu", "Cancelar", JOptionPane.INFORMATION_MESSAGE);
					exception = false;
				}
		}
				if(exception) {
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
