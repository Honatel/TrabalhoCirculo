
public class Circulo {
	
	public double area;
	public double TT;
	public double raio;
	public double diametro;
	
	public Circulo( double diametro){
		this.TT = 3.14;
		this.diametro = diametro;
		this.raio = this.diametro / 2;
	}
	
	public void CalculoArea(){	
		this.area = this.TT * CalculoRaio(this.raio);
	}

	private double CalculoRaio(double raio2) {
		
		return raio * raio;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getTT() {
		return TT;
	}

	public void setTT(double tT) {
		TT = tT;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}


	
}
