package ej5ShotgunSurgery;

public class EtiquetaEnvio {
	private Usuario usuario;

	public EtiquetaEnvio(Usuario usuario) {
		this.usuario = usuario;
	}

	public void imprimirEtiqueta() {
		System.out.println("Enviando a:");
		System.out.println(usuario.getNombre());
		System.out.println("Dirección: " + usuario.getDireccion()[0] + "\n\t Número: " + usuario.getDireccion()[1]
				+ "\n\t Piso: " + usuario.getDireccion()[2]);
	}
}
