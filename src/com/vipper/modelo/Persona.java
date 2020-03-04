package com.vipper.modelo;

public class Persona {
	private String id;
	private String nombre;
	private int edad;
	private String email;
	private String genero;
	private double sueldo;
	private String empresa;
	private String telefono;
	
	
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", email=" + email + ", genero=" + genero
				+ ", sueldo=" + sueldo + ", empresa=" + empresa + ", telefono=" + telefono + "]";
	}

	public Persona() {}

	public Persona(String id, String nombre, int edad, String email, String genero, double sueldo, String empresa,
			String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.genero = genero;
		this.sueldo = sueldo;
		this.empresa = empresa;
		this.telefono = telefono;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
}
