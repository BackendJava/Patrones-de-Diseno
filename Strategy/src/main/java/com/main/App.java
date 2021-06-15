package com.main;

import com.strategy.AntivirusSimple;
import com.strategy.Contexto;

public class App {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusSimple());
		contexto.ejecutar();
	}

}
