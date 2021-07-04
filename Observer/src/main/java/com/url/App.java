package com.url;

import com.url.observer.PesoARGObservador;
import com.url.observer.PesoMXObservador;
import com.url.observer.SolObservador;
import com.url.observer.Subject;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new SolObservador(subject);
		
		
		System.out.println("Si desea cambiar 10 dólares obtendrá : ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 dólares obtendrá : ");
		subject.setEstado(100);
	}
}
