package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.interfaces.*;

	public class Batalla {
	
		private String nombre;
		private Double latitud;
		private Double longitud;
		private TipoDeBatalla tipo;
		Set<Vehiculo> vehiculosEnLaBatalla;
	
	
		public Batalla(String n, TipoDeBatalla tb, Double lat, Double lon) {
			this.tipo=tb;
			this.nombre=n;
			this.latitud=lat;
			this.longitud=lon;
			this.vehiculosEnLaBatalla=new HashSet<Vehiculo>();
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public Double getLatitud() {
			return latitud;
		}


		public void setLatitud(Double latitud) {
			this.latitud = latitud;
		}


		public Double getLongitud() {
			return longitud;
		}


		public void setLongitud(Double longitud) {
			this.longitud = longitud;
		}


		public TipoDeBatalla getTipo() {
			return tipo;
		}


		public void setTipo(TipoDeBatalla tipo) {
			this.tipo = tipo;
		}
	
		public void agregarVehiculo(Vehiculo v) {
			this.vehiculosEnLaBatalla.add(v);
		}
	
}
