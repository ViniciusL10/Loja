package loja;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Funcionario {
	private ArrayList<Integer> cadastro = new ArrayList<Integer>();
	private ArrayList<String> nome = new ArrayList<String>();
	private ArrayList<Float> salarioBase= new ArrayList<Float>();
	private ArrayList<String> funcao = new ArrayList<String>(); 
	private int adicionar;

	public void cadastraFuncionario() {
		int opcao = 1;
		boolean exception = true;
		while (opcao != 0 && exception) {
			do {
				try {
					nome.add(JOptionPane.showInputDialog("Insira o nome do funcionário")); 
					funcao.add(JOptionPane.showInputDialog("Qual a função do funcionario"));
					salarioBase.add(Float.parseFloat(JOptionPane.showInputDialog("Informe o salário base do funcionario")));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Formato inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
				} catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Voltando ao menu", "Cancelar",
							JOptionPane.INFORMATION_MESSAGE);
					exception = false;
				}
				adicionar = JOptionPane.showConfirmDialog(null, "Cadastrar mais um Funcionário?", "Funcionário",
						JOptionPane.YES_NO_OPTION);
			} while (adicionar == 0);
			if (exception) {
				for (int i = 0; i < nome.size(); i++) {
					opcao = JOptionPane.showConfirmDialog(null, 
							"FUNCIONÁRIO: \n NOME: " + nome.get(i) + "\n FUNÇÃO: " + funcao.get(i)
							+ "\n SALÁRIO: R$" + salarioBase.get(i)+ "\n Confirmar cadastro?");

				}
				
				if (opcao == 0) {
					JOptionPane.showMessageDialog(null, "Tudo certo! Prosseguindo...");
				}
				if (opcao == 2) {
					JOptionPane.showMessageDialog(null, "Obrigado por usar nosso mini sistema!", "Obrigado",
							JOptionPane.PLAIN_MESSAGE);
					opcao = 0;
				}
			}
		}
	}

	public void efetuarVenda() {

	}

}