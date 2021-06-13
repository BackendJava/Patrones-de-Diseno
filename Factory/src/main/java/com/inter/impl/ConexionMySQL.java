package com.inter.impl;

import com.Interface.IConexion;

public class ConexionMySQL implements IConexion {

	private final String host;
	private final String puerto;
	private final String usuario;
	private final String contrasena;

	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conect� a MySQL");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconect� de MySQL");
	}

	@Override
	public String toString() {
		return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}
}
