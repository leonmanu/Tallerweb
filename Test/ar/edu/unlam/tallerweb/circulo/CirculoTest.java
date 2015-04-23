package ar.edu.unlam.tallerweb.circulo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTest {

	@Test
	public void testSuperficie() {
		
		Circulo miCirculo=new Circulo(1.5);
		Assert.assertEquals(7.06,miCirculo.superficie(),0.1);
		
	}
	
	public void testPerimetro(){
		
		Circulo miCirculo=new Circulo(5.2);
		Assert.assertEquals(32.6,miCirculo.perimetro(),0.1);
	}

}
