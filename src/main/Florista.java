package main;

public class Florista {
	private String nombre;

	public Florista(String nombre) {
		this.nombre = nombre;
	}

	public void gestionarEnvio(Flor tipoFlor, Direccion direccion) {
		Envio envioFlor = new Envio(tipoFlor, direccion);
		envioFlor.enviarFlores();
	}

}
