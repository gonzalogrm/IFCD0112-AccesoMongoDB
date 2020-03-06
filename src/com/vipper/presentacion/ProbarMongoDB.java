package com.vipper.presentacion;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.vipper.modelo.Persona;
import com.vipper.persistencia.AccesoBBDD;
import com.vipper.persistencia.Conexion;

public class ProbarMongoDB {

	public static void main(String[] args) {
		Conexion c1 = new Conexion();
		
		try {
			c1.abrirConexion();
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		}
		
		AccesoBBDD acceso = new AccesoBBDD();
		List<Persona> list;
		
		try {
			list = acceso.mostrarMayoresX(35);
			
			for (Persona p : list) {
				System.out.println(p.toString());
			}
			
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		}
		
	}

}
