package main;

public class Florista {
	private String nombre;
	
	public Florista(String nombre) {
		this.nombre = nombre;
	}
	
	public void gestionarEnvio(String tipoFlor, String direccion) {
		Envio envioFlor = new Envio("rosas","calle false 123");
		envioFlor.enviarFlores(new Flor(tipoFlor), new Direccion(direccion));
	}

}
