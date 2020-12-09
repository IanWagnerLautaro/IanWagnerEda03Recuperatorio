package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoInexistente;
import ar.edu.unlam.pb2.eva03.interfaces.*;

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

	public boolean enviarALaBatalla(String n, Integer Codigo) throws VehiculoIncompatible, VehiculoInexistente {
		
		Vehiculo vehiculoaAgregar = buscarVehiculo(Codigo);
		
		if(this.convoy.contains(vehiculoaAgregar)==false) {
			
			throw new VehiculoInexistente("El Vehiculo no existe");
		}
		
		TipoDeBatalla batalla =this.batallas.get(n).getTipo();
		
		
		switch(batalla) {
			
		case TERRESTRE:
			if(vehiculoaAgregar instanceof ITerrestre) {
				this.batallas.get(n).agregarVehiculo(vehiculoaAgregar);
				return true;
			}else {
				throw new VehiculoIncompatible("El vehiculo es incompatible");
			}
		case NAVAL:
			if(vehiculoaAgregar instanceof IAcuatico) {
				this.batallas.get(n).agregarVehiculo(vehiculoaAgregar);
				return true;
			}else {
				throw new VehiculoIncompatible("El vehiculo es incompatible");
			}	
		case AEREA:
			if(vehiculoaAgregar instanceof IVolador) {
				this.batallas.get(n).agregarVehiculo(vehiculoaAgregar);
				return true;
			}else {
				throw new VehiculoIncompatible("El vehiculo es incompatible");
			}		
		default:
			return false;	
		}
		
	}

	private Vehiculo buscarVehiculo(Integer codigo) {
		
		for (Vehiculo vehiculo : convoy) {
			if(vehiculo.getCodigo().equals(codigo)==true) {
				return vehiculo;
			}
		}
		
		return null;
	}

}
