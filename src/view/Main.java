package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCorrida;

public class Main {

	public static void main(String[] args) {
		
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for(int idCorredor = 1; idCorredor < 5; idCorredor++) {
			ThreadCorrida threadCorrida = new ThreadCorrida(idCorredor, semaforo);
			threadCorrida.start();
		}

	}

}