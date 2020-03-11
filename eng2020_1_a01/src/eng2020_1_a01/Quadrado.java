package eng2020_1_a01;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double lado) {
		super(lado, lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return getAltura()*Math.sqrt(2);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getAltura()*getBase();
	}

}
