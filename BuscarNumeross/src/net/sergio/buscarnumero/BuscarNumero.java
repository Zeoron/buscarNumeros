package net.sergio.buscarnumero;

public class BuscarNumero {

	private static final int ESCOLLIT = 859999;
	private static final int MAXIMNUMEROS = 1000000;

	public static void main(String[] args) {
		int numeroACercar = ESCOLLIT;
		int [] llistaNumeros = new int [MAXIMNUMEROS];
		for (int i = 0; i<llistaNumeros.length;i++) {
			llistaNumeros[i] = i;
		}
		long startTime = System.currentTimeMillis();
		buscarNumero(numeroACercar, llistaNumeros);
		long endTime = System.currentTimeMillis();
		System.out.println("El temps d'execuci� es " + (endTime-startTime) + "ms");
		System.out.println("Temps inicial recollit " + endTime);
		System.out.println("Temps final recollit " + startTime);
	}

	private static void buscarNumero(int numeroACercar, int[] llistaNumeros) {
		boolean hoes = false;
		int index = 0;
		while (!hoes) {
			if (llistaNumeros[index]==numeroACercar) {
				hoes = true;
			} else {
				index ++;
			}
		}
	}

}
