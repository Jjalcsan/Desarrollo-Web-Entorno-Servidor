package PreEvaluacion;

import java.util.Objects;

public class Piso extends Vivienda implements PrecioVivienda{

	private TipoPiso tipo;
	
	public Piso() {}

	public Piso(int superficie, int numHabs, TipoPiso tipo){
		super(superficie, numHabs);
		this.tipo=tipo;

	}
	
	@Override
	public String toString() {
		return super.toString()+"  Tipo vivienda: Piso\n"
				+"  Tipo de piso: "+tipo+" \n";
	}
	
	public TipoPiso getTipo() {
		return tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tipo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piso other = (Piso) obj;
		return Objects.equals(tipo, other.tipo);
	}
	
	
}
