package eng2020_1_a01;


public class Cubo extends Quadrado implements Tridimensional{
	
	public Cubo(double lado) {
		super(lado);
	}
	
	@Override
	public double volume() {
		return area() * getBase();
	}

	@Override
	public String toString() {
		return "Cubo [lado = " + getBase() + "]";
	}
	
}
