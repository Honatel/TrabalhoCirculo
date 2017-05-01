
public class RunCirculo {
	public void run(){
		
		Circulo [] listaCalculo = new Circulo[2];
		
		Circulo circulo1 = new Circulo(30);
		Circulo circulo2 = new Circulo(32);
		
		listaCalculo[0]= circulo1;
		listaCalculo[1]= circulo2;
		
		VerificaDistanciasCirculos(listaCalculo);
		
		
		
	}

	private String VerificaDistanciasCirculos(Circulo[] listaCalculo) {
		double soma = listaCalculo[0].diametro + listaCalculo[1].diametro;
		
		if (soma >= 100) {
			return "bateu";
		}
		return "";
	}
}
