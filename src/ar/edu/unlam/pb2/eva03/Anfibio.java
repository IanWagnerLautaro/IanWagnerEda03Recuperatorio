package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.IAcuatico;
import ar.edu.unlam.pb2.eva03.interfaces.ITerrestre;

public class Anfibio extends Vehiculo implements ITerrestre, IAcuatico {

	private Double Profundidad;
	private Double Velocidad;
	
	public Anfibio(Integer n, String d) {
		super(n, d);
		this.Velocidad=0.0;
		this.Profundidad=0.0;
	}

	public Double getProfundidad() {
		return Profundidad;
	}

	public void setProfundidad(Double profundidad) {
		Profundidad = profundidad;
	}

	public Double getVelocidad() {
		return Velocidad;
	}

	public void setVelocidad(Double velocidad) {
		Velocidad = velocidad;
	}


}
