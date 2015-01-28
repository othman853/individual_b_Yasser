package br.com.individualc.yasser;

public class Principal {
	
	public static void main(String[] args) {
		CaixaEletronico caixa = new CaixaEletronico();
		
		caixa.sacar(180);
		caixa.sacar(20);
		caixa.sacar(200);
		caixa.sacar(1250);
		caixa.sacar(230);
		caixa.sacar(181);
	}

}
