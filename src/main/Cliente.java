package main;

public class Cliente {

	private String nombre;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public void solicitarEnvioFlores(String tipoFlor, String direccion) {
		Florista pedro = new Florista("pedro");
		pedro.gestionarEnvio(tipoFlor, direccion);
	}
}
