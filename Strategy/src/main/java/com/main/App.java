package com.main;

import com.strategy.AntivirusAvanzado;
import com.strategy.Contexto;

public class App {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}

}
