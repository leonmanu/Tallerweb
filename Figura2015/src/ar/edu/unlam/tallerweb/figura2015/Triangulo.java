package ar.edu.unlam.tallerweb.figura2015;

public class Triangulo {
	
	private Double ladoBase;
	private Double lado2;
	private Double lado3;
	private Double semiPerimetro;


public Triangulo (Double ladoBase,Double lado2,Double lado3){
	this.ladoBase=ladoBase;
	this.lado2=lado2;
	this.lado3=lado3;
}

	public Double area(){
		semiPerimetro=(ladoBase + lado2 + lado3)/2;
		return Math.sqrt( semiPerimetro*(semiPerimetro-ladoBase)*(semiPerimetro-lado2)*(semiPerimetro-lado3) );
	}
	
	public Double perimetro() {
		return ladoBase + lado2 + lado3;
	}
}