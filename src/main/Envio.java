package main;

public class Envio {
	
	private String direccion;
	private String tipoflor;
	
	public Envio(String direccion,String tipoFlor) {
		this.direccion = direccion;
		this.tipoflor = tipoFlor;
	}
	
	public void enviarFlores(Flor flor, Direccion dire) {
		System.out.println("Enviado " + flor + " para " + dire);
	}

}
