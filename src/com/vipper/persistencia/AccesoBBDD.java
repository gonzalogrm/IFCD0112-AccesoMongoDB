package com.vipper.persistencia;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.bson.NewBSONDecoder;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.vipper.modelo.Persona;

public class AccesoBBDD extends Conexion {
	//Atributos
	public DBCollection detalle;
	
	public List<Persona> mostrarTodosPersona() throws UnknownHostException{
		//3. Definción de variables
		List<Persona> result = new ArrayList<Persona>();
		DBCursor rs; //Obtiene los resultados de la coleccion, similar al ResultSet
		BasicDBObject documentoJSON;
		
		//2. Abrir Conexion - Conectarse al cliente
		abrirConexion();
		
		//3. Obtener la colección
		detalle = db.getCollection("detalle");
		System.out.println("Obtiene la coleción " + detalle.getFullName());
		System.out.println("Contiene " + detalle.count() + " documentos");
		
		
		//4. Obtener todos los documentos de la coleccion
		rs = detalle.find();
		
		//5. Bucle para obtener los documentos
		while (rs.hasNext()) {
			documentoJSON = (BasicDBObject) rs.next();
			result.add(
				new Persona(
					documentoJSON.getString("_id"), 
				    documentoJSON.getString("name"), 
				    documentoJSON.getInt("age"), 
				    documentoJSON.getString("email"), 
				    documentoJSON.getString("gender"),  
				    documentoJSON.getString("company"), 
				    documentoJSON.getString("phone")
			    )
			);
		}
		
		//6. Cerrar cliente
		cerrarConexion();
		
		return result;
	}

	public List<Persona> mostrarMayoresX(int x) throws UnknownHostException{
		//3. Definción de variables
		List<Persona> result = new ArrayList<Persona>();
		DBCursor rs; //Obtiene los resultados de la coleccion, similar al ResultSet
		BasicDBObject documentoJSON;
		
		//2. Abrir Conexion - Conectarse al cliente
		abrirConexion();
		
		//3. Obtener la colección
		detalle = db.getCollection("detalle");
		System.out.println("Obtiene la coleción " + detalle.getFullName());
		System.out.println("Contiene " + detalle.count() + " documentos");
		
		
		//4. Obtener todos los documentos de la coleccion
		//Usamos un new BasicDBObject("$gt", 35) porque es un nuevo key value tipo BSON, 
		//Si fuese un literal quedaria: BasicDBObject query = new BasicDBObject("age", 35);
		BasicDBObject query = new BasicDBObject("age", new BasicDBObject("$gt", x));
		System.out.println("query: " + query.toString());
		rs = detalle.find(query);
		
		//5. Bucle para obtener los documentos
		while (rs.hasNext()) {
			documentoJSON = (BasicDBObject) rs.next();
			result.add(
				new Persona(
					documentoJSON.getString("_id"), 
				    documentoJSON.getString("name"), 
				    documentoJSON.getInt("age"), 
				    documentoJSON.getString("email"), 
				    documentoJSON.getString("gender"),  
				    documentoJSON.getString("company"), 
				    documentoJSON.getString("phone")
			    )
			);
		}
		
		//6. Cerrar cliente
		cerrarConexion();
		
		return result;
	}


}
