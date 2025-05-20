package ej5ShotgunSurgery;

public class Factura {
	private Usuario usuario;

	public Factura(Usuario usuario) {
		this.usuario = usuario;
	}

	public void imprimirFactura() {
		System.out.println("Factura para " + usuario.getNombre());
		System.out.println("Dirección: " + usuario.getDireccion()[0] + "\n\t Número: " + usuario.getDireccion()[1]
				+ "\n\t Piso: " + usuario.getDireccion()[2]);
	}
}
