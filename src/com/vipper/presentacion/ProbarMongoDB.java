package com.vipper.presentacion;

import java.net.UnknownHostException;
import com.vipper.persistencia.Conexion;

public class ProbarMongoDB {

	public static void main(String[] args) {
		Conexion c1 = new Conexion();
		
		try {
			c1.abrirConexion();
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		}
	}

}
