package ar.edu.unlam.pb2.eva03;

public class Terrestre extends Vehiculo implements ITerrestre {
	
	private Double Velocidad;


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
