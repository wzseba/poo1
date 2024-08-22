package main;

public class Cliente {

	private String nombre;

	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public void solicitarEnvioFlores(Florista florista, String tipoFlor, String direccion) {
		florista.gestionarEnvio(new Flor(tipoFlor), new Direccion(direccion));
	}
}
