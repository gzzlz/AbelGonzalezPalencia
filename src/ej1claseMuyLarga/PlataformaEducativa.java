package ej1claseMuyLarga;

import java.util.*;

public class PlataformaEducativa {
	private Map<String, String> usuarios; // username -> password
	private Map<String, List<String>> cursos; // username -> cursos
	private Map<String, String> contenidoCursos; // curso -> contenido

	public PlataformaEducativa() {
		usuarios = new HashMap<>();
		cursos = new HashMap<>();
		contenidoCursos = new HashMap<>();
	}

	public void registrarUsuario(String username, String password) {
		if (!usuarios.containsKey(username)) {
			usuarios.put(username, password);
			System.out.println("Usuario registrado con éxito.");
		} else {
			System.out.println("El usuario ya existe.");
		}
	}

	public boolean iniciarSesion(String username, String password) {
		return usuarios.containsKey(username) && usuarios.get(username).equals(password);
	}

	public void agregarCurso(String curso, String contenido) {
		if (!contenidoCursos.containsKey(curso)) {
			contenidoCursos.put(curso, contenido);
			System.out.println("Curso agregado con éxito.");
		} else {
			System.out.println("El curso ya existe.");
		}
	}

	public void inscribirUsuarioEnCurso(String username, String curso) {
		if (usuarios.containsKey(username) && contenidoCursos.containsKey(curso)) {
			cursos.get(username).add(curso);
			System.out.println("Usuario inscrito en el curso.");
		} else {
			System.out.println("Error al inscribir al usuario.");
		}
	}

	public void mostrarCursosUsuario(String username) {
		if (cursos.containsKey(username)) {
			List<String> listaCursos = cursos.get(username);
			System.out.println("Cursos de " + username + ": " + listaCursos);
		}
	}

	public void mostrarCursos() {
        for (String nombreCurso : cursos.keySet()) {
				System.out.println("Curso: " + nombreCurso);
        }
    }
}
