package br.com.individualc.yasser;

public class CaixaEletronico {

	private static final int[] NOTAS_DISPONIVEIS = { 100, 50, 20, 10 };
	private static final int MENOR_NOTA = 10;

	public void sacar(double valor) {
		
		while (valor >= MENOR_NOTA) {
			for (int i = 0; i < NOTAS_DISPONIVEIS.length; i++) {
				if (valor >= NOTAS_DISPONIVEIS[i]) {
					
					valor -= NOTAS_DISPONIVEIS[i];					
					if (valor > 0 && valor < MENOR_NOTA) {
						System.out.println("VALOR INVALIDO");
						return;
					}
					
					System.out.println("NOTA: " + NOTAS_DISPONIVEIS[i]);
					i--;
					continue;
				}
				
			}
		}		
	}
}
