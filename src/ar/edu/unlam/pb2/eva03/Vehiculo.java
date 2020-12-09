package ar.edu.unlam.pb2.eva03;

public class Vehiculo {
	
	private Integer Codigo;
	private String Descripcion;
	
	public Vehiculo(Integer c, String d) {
		this.Descripcion=d;
		this.Codigo=c;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Codigo == null) ? 0 : Codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (Codigo == null) {
			if (other.Codigo != null)
				return false;
		} else if (!Codigo.equals(other.Codigo))
			return false;
		return true;
	}

}
