package com.Main;

import com.Interface.IConexion;
import com.inter.impl.ConexionMySQL;
import com.inter.impl.ConexionOracle;
import com.inter.impl.ConexionPostgreSQL;
import com.inter.impl.ConexionSQLServer;
import com.inter.impl.ConexionVacia;

public class ConexionFabrica {

	public IConexion getConexion(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}
}
