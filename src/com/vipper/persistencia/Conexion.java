package com.vipper.persistencia;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class Conexion {
	//Atributos
	protected MongoClient cliente;
	protected DB db;
	
	public void abrirConexion() throws UnknownHostException {
		//1. Conectarse con el cliente de MongoDB.
		//Equivalente a ejecutar mongo.exe
		cliente = new MongoClient("localhost", 27017);
		System.out.println("Accedio al cliente exitosamente");
		//2. Accedemos a nuestra db local personal.
		db = cliente.getDB("personal");
		System.out.println("La base de datos es: " + db.getName());
	}
	
	public void cerrarConexion() {
		cliente.close();
	}
}
