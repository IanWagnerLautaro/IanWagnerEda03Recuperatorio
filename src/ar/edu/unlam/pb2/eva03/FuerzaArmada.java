package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas; 

	public FuerzaArmada() {
		
		this.convoy=new HashSet<Vehiculo>();
		this.batallas=new HashMap<String, Batalla>();

	}

	public void agregarVehiculo(Vehiculo v) {
		
		this.convoy.add(v);
	}

	public Integer getCapacidadDeDefensa() {
		
		return this.convoy.size();
	}

	public void crearBatalla(String n, TipoDeBatalla tb, Double lat, Double lon) {
		
		Batalla b=new Batalla(n, tb, lat, lon);
		
		this.batallas.put(n, b);
		
		
	}
	
	public Batalla getBatalla(String n) {
		
		return this.batallas.get(n);
		
	}

}
