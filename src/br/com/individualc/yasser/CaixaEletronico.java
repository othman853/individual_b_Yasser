package br.com.individualc.yasser;

public class CaixaEletronico {

	private static final int[] NOTAS_DISPONIVEIS = { 100, 50, 20, 10 };
	private static final int MENOR_NOTA = 10;
	
	private int contadorNotasDe10 = 0;
	private int contadorNotasDe20 = 0;
	private int contadorNotasDe50 = 0;
	private int contadorNotasDe100 = 0;

	public void sacar(double valorDoSaque) {
		
		zerarContagemDeNotas();
		int nota = 0;
		while (valorDoSaque >= MENOR_NOTA) {
			
			for (int i = 0; i < NOTAS_DISPONIVEIS.length; i++) {
				nota = NOTAS_DISPONIVEIS[i];
				if (valorDoSaque >= nota) {					
					valorDoSaque -= nota;					
					if (valorDoSaque > 0 && valorDoSaque < MENOR_NOTA) {
						System.out.println("VALOR INVALIDO");
						return;
					}
					
					contabilizarNota(nota);					
					i--;
					continue;
				}				
			}			
		}
		
		imprimirNotasSacadas();
	}
	
	private void zerarContagemDeNotas(){
		contadorNotasDe10 = 0;
		contadorNotasDe20 = 0;
		contadorNotasDe50 = 0;
		contadorNotasDe100 = 0;		
	}
	
	private void contabilizarNota(int valor){
		switch(valor){
		case 10:
			contadorNotasDe10++;
			break;
		case 20:
			contadorNotasDe20++;
			break;
		case 50:
			contadorNotasDe50++;
			break;
		case 100:
			contadorNotasDe100++;
			break;
		}
	}
	
	public void imprimirNotasSacadas(){
		System.out.println("[10]  : " + contadorNotasDe10);
		System.out.println("[20]  : " + contadorNotasDe20);
		System.out.println("[50]  : " + contadorNotasDe50);
		System.out.println("[100] : " + contadorNotasDe100);
	}
}
