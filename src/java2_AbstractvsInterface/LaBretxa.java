package java2_AbstractvsInterface;

public abstract class LaBretxa extends Cine implements Peliculas {
	//cine
	@Override
	public void ventaentrada() {
		System.out.print("Las entradas son");
	}
	
	//peliculas
	@Override
	public void verduracion() {
		System.out.print("La duracion es");
	}
	
	
	
}
