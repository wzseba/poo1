package main;

public class Envio {

	private Direccion direccion;
	private Flor tipoflor;

	public Envio(Flor tipoFlor, Direccion direccion) {
		this.direccion = direccion;
		this.tipoflor = tipoFlor;
	}

	public void enviarFlores() {
		System.out.println("Enviando " + tipoflor.getFlores() + " a " + direccion.getDireccion());
	}

}
