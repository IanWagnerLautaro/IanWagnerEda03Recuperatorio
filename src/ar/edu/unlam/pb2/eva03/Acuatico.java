package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.IAcuatico;

public class Acuatico extends Vehiculo implements IAcuatico {
	
	protected Double Profundidad;

	public Acuatico(Integer n, String d) {
		super(n, d);
		this.Profundidad=0.0;
	}
	
	public Double getProfundidad() {
		return Profundidad;
	}

	public void setProfundidad(Double profundidad) {
		Profundidad = profundidad;
	}

}
