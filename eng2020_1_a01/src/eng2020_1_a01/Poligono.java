package eng2020_1_a01;

public abstract class Poligono extends Figura {
	private double base,altura;

	public Poligono(double base2, double altura2) {
		// TODO Auto-generated constructor stub
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Poligono [base=" + base + ", altura=" + altura + "]";
	}
			}