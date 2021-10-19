package PreEvaluacion;

import java.util.Objects;

public class Casa extends Vivienda implements PrecioVivienda{

	private int numPisos;

	public Casa() {}
	
	public Casa(int superficie, int numHabs, int numPisos) {
		super(superficie, numHabs);
		this.numPisos = numPisos;
	}

	public int getNumPisos() {
		return numPisos;
	}


	@Override
	public String toString() {
		return super.toString()+"  Tipo vivienda: Casa\n"
				+"  Numero de pisos: "+numPisos+" \n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numPisos);
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
		Casa other = (Casa) obj;
		return numPisos == other.numPisos;
	}

	
}
