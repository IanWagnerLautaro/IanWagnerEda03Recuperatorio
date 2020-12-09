package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.IAcuatico;
import ar.edu.unlam.pb2.eva03.interfaces.IVolador;

public class HidroAvion extends Vehiculo implements IVolador, IAcuatico {

	private Double Profundidad;
	private Double Altura;
	
	public HidroAvion(Integer n, String d) {
		super(n, d);
		this.Altura=0.0;
		this.Profundidad=0.0;
		
	}

	public Double getProfundidad() {
		return Profundidad;
	}

	public void setProfundidad(Double profundidad) {
		Profundidad = profundidad;
	}

	public Double getAltura() {
		return Altura;
	}

	public void setAltura(Double altura) {
		Altura = altura;
	}
	
}
