package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ITerrestre;

public class Terrestre extends Vehiculo implements ITerrestre {
	
	protected Double Velocidad;


	public Terrestre(Integer n, String d) {
		super(n, d);
		this.Velocidad=0.0;
	}
	
	public Double getVelocidad() {
		return Velocidad;
	}

	public void setVelocidad(Double velocidad) {
		Velocidad = velocidad;
	}

}
