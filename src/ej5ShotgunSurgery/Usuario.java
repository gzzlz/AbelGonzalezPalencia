package ej5ShotgunSurgery;

public class Usuario {
	private String nombre;
	private String[] direccion; // [0] nombre de calle, [1] número en la calle, [2] piso

	public Usuario(String nombre, String[] direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String[] getDireccion() {
		return direccion;
	}

}
