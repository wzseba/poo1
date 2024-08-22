package main;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente luis = new Cliente("luis");
		Florista pedro = new Florista("pedro");
		
		luis.solicitarEnvioFlores(pedro,"rosas", "casa de alba");

	}

}
