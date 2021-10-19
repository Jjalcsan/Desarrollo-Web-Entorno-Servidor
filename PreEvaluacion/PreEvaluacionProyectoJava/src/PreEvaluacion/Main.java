package PreEvaluacion;

import java.util.Scanner;


public class Main {

	private static Scanner teclado = new Scanner(System.in);
	private static final String MENU_PRINCIPAL = "1. Ingresar un nuevo piso\n" + 
													"2. Ingresar una nueva casa\n" + 
													"3. Listar las viviendas disponibles\n" + 
													"4. Comprobar el precio de una vivienda\n" + 
													"5. Borrar una vivienda existente\n" + 
													"6. Salir";
	
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		int opcion=0;
		
		
			try {
				while(opcion < 6) {

				System.out.println(MENU_PRINCIPAL);
				
				System.out.println("Introduce una opcion:");
				
				opcion = Integer.parseInt(teclado.nextLine());
				
				switch (opcion) {
					
					case 1: //Nuevo piso
						
						System.out.println("¿Cuantos metros cuadrados tiene el piso?");
						int superficie = Integer.parseInt(teclado.nextLine());
						
						System.out.println("¿Cuantas habitaciones tiene el piso?");
						int habitaciones = Integer.parseInt(teclado.nextLine());
						
						System.out.println("¿Es un duplex(1), un estudio(2) o un piso normal(3)?");
						int tipo = Integer.parseInt(teclado.nextLine());
						
						if (tipo==1) {
							
							Piso piso = new Piso(superficie, habitaciones, TipoPiso.DUPLEX);
							empresa.addPiso(piso);
						
						} else if(tipo==2) {
						
							Piso piso = new Piso(superficie, habitaciones, TipoPiso.ESTUDIO);
							empresa.addPiso(piso);
						
						} else if(tipo==3) {
						
							Piso piso = new Piso(superficie, habitaciones, TipoPiso.NORMAL);
							empresa.addPiso(piso);
						
						} else {
						
							System.out.println("Opcion incorrecta");
						}
						
						break;
					
					case 2: //Nueva casa
						
						System.out.println("¿Cuantos metros cuadrados tiene la casa?");
						int superficieC = Integer.parseInt(teclado.nextLine());
						
						System.out.println("¿Cuantas habitaciones tiene la casa?");
						int habitacionesC = Integer.parseInt(teclado.nextLine());
						
						System.out.println("¿Cuantos pisos tiene?");
						int pisos = Integer.parseInt(teclado.nextLine());
						
						Casa casa = new Casa(superficieC, habitacionesC, pisos);
						
						empresa.addCasa(casa);
						
						break;
					
					case 3: //Listar viviendas
						
						System.out.println(empresa.listarViviendas());
						
						break;
					
					case 4: //Precio vivienda

						System.out.println("Indica el ID de la casa para ver su precio");
						int codigo = Integer.parseInt(teclado.nextLine());
						
						System.out.println(empresa.checkPrecio(codigo)+"\n");
						
						break;
						
					case 5: //Borrar una vivienda;
						
						System.out.println("Indica el ID de la casa a eliminar");
						int codigo2 = Integer.parseInt(teclado.nextLine());
						System.out.println(empresa.delVivienda(codigo2)+"\n");
						break;
						
					case 6:	//Salir
						System.out.println("Gracias y hasta la proxima");
						break;
						
					default:
						break;
				}
				}
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
			
	}

}
