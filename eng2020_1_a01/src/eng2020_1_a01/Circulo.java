package eng2020_1_a01;

public class Circulo extends Figura {
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
		
		// TODO Auto-generated method stub
		}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}

}
