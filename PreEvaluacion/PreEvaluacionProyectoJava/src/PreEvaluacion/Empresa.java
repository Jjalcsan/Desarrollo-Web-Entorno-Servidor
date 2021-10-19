package PreEvaluacion;

import java.util.HashSet;
import java.util.Iterator;

public class Empresa {

	private String nombre = "Empresa";
	private HashSet<Vivienda> viviendas;
	
	public Empresa() {
		
		viviendas = new HashSet<Vivienda>();
		
	}
	
	/**
	 * @param piso recibirá un objeto de la clase piso en el main y lo añadirá directamente al HashSet
	 */
	public void addPiso(Piso piso){
		
		
		viviendas.add(piso);
	}
	

	/**
	 * @param casa recibirá un objeto de la clase casa en el main y la añadirá directamente al HashSet
	 */
	public void addCasa(Casa casa){
		
		viviendas.add(casa);
		
	}
	
	/**
	 * Metodo que comprueba el precio de una vivienda
	 * @param codigo recibira el ID de una casa que se genera automaticamente 
	 * @return devolvera un int con el precio de la vivienda
	 */
	public int checkPrecio(int codigo) {
		
		int precio = 0;
		
		for (Iterator<Vivienda> iterator = viviendas.iterator(); iterator.hasNext();) {
			
			Vivienda vivienda = (Vivienda) iterator.next();
			
			if (vivienda.getId()==codigo) {
				
				precio = vivienda.preciototal(vivienda.getSuperficie());
				
			}
			
		}
		
		return precio;
	}
	
	/**
	 * Metodo que nos sirve para eliminar una vivienda del HashSet
	 * @param codigo al igual que CheckPrecio recibira el codigo de la vivienda generado automaticamente
	 * @return devolvera un String que indicará si se ha podido borrar la vivienda especificada o no
	 */
	public String delVivienda(int codigo) {
		
		String respuesta = "";
		
		for (Iterator<Vivienda> iterator = viviendas.iterator(); iterator.hasNext();) {
			
			Vivienda vivienda = (Vivienda) iterator.next();
			
			if (vivienda.getId()==codigo) {
				
				viviendas.remove(vivienda);
				
				respuesta = "Vivienda eliminada";
				
			} else {
				respuesta = "Vivienda no eliminada";
			}
		}
		
		return respuesta;
	}
	
	/**
	 * Metodo para mostrarnos cada una de las viviendas con cada propiedad que posea
	 * @return Devolvera un StringBuilde to String que listará cada una de las viviendas con
	 * su propio toString
	 */
	public String listarViviendas() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Vivienda v : viviendas) {
			
			sb.append(v.toString());
		}
		
		return sb.toString();
	}
	
}
