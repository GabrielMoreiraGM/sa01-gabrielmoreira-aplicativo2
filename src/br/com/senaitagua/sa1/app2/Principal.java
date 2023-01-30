package br.com.senaitagua.sa1.app2;
import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ano = JOptionPane.showInputDialog("Digite o ano corrente: ");
		int anoAtual = Integer.parseInt(ano);
		
		IdadeBO idadeAviao = new IdadeBO ();
		
		JOptionPane.showMessageDialog(null, "A idade do EMB 100 Bandeirante é: "+idadeAviao.calcIdadeAviao(anoAtual)+" anos.");

	}

}
