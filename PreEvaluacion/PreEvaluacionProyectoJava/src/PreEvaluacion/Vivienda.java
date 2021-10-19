package PreEvaluacion;

import java.util.Objects;

public abstract class Vivienda implements PrecioVivienda{

	private int superficie;
	private int numHabs;
	private int id;
	private static int contador = 0;
	
	public Vivienda() {}
	
	public Vivienda(int superficie, int numHabs) {
		super();
		this.superficie = superficie;
		this.numHabs = numHabs;
		this.id = contador++;
	}

	@Override
	public String toString() {
		return "Vivienda con ID: "+id+"\n"
				+"  Superficie: "+superficie+" metros cuadrados\n"
				+"  Habitaciones: "+numHabs+"\n";
	}

	public int getId() {
		return id;
	}

	/**
	 * Este metodo llama a la interfaz PrecioVivienda para calcular el precio de nuestra vivienda
	 * @param superficie: Parametro de entrada, cada metro cuadrado vale 1000€ por lo que hace 
	 * una simple multiplicacion
	 * @return Devolverá un integer con valor positivo
	 */
	public int preciototal(int superficie) {
		int total = 0;
		
		total = superficie * 1000;
		
		return total;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(numHabs, superficie);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vivienda other = (Vivienda) obj;
		return numHabs == other.numHabs && superficie == other.superficie;
	}



	public int getSuperficie() {
		return superficie;
	}

	/**
	 * @return
	 */
	public int getNumHabs() {
		return numHabs;
	}
	
	public void setNumHabs(int numHabs) {
		this.numHabs = numHabs;
	}

	
}
