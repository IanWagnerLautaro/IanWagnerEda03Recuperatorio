package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.IVolador;

public class Volador extends Vehiculo implements IVolador {
	
	protected Double Altura;

	public Volador(Integer n, String d) {
		super(n, d);
		this.Altura=0.0;
		
	}

	public Double getAltura() {
		return Altura;
	}

	public void setAltura(Double altura) {
		Altura = altura;
	}

	

}
