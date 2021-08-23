
/* Nombre: Driver.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Descripción: Driver program que implementa el menú de opciones para la búsqueda del perro
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 13.08.2021
 			  Modificado el 14.08.2021 */

//Import
import java.util.Scanner;

//Clase Driver (SimuladorPerrera)
class Driver
{	
	/** 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Familia familia = new Familia();
		Vista vista = new Vista();
		Perrera perrera = new Perrera();
		Perrito perro = new Perrito("schnauzer", "pequeño", 7, 80, "gris", "honey");
		String[][] Familias = familia.getFamilias();
		int opcion = 0;
		int posicion = 3;

		//Mensajes de bienvenida
		vista.mostrarInicio();
				
		while (opcion != 4)
		{
			//Menú		
			opcion = vista.mostrarMenu();

			if (opcion == 1)
			{
				if (posicion < 15)
				{
					familia = new Familia(vista.pedirApellido(), vista.pedirMiembros(), vista.pedirChicos(), vista.pedirGrandes(), vista.pedirMascotas());
					Familias = familia.ingresarFamilia(posicion, Familias);
					System.out.println(Familias[posicion][0]);
					posicion++;
				}
				else
				{
					vista.sistemaLleno();
				}
			}

			if (opcion == 2)
			{
				perro = new Perrito(vista.pedirRaza(), vista.pedirSize(), vista.pedirEdad(), vista.pedirSalud(), vista.pedirColor(), vista.pedirNombre());
				System.out.println(perro.getRaza());
			}

			if (opcion == 2)
			{
				perro = new Perrito(vista.pedirRaza(), vista.pedirSize(), vista.pedirEdad(), vista.pedirSalud(), vista.pedirColor(), vista.pedirNombre());
				System.out.println(perro.getRaza());
			}

			if (opcion == 3)
			{
				perrera.asignarPerro(perro, Familias);
				vista.mostrarFamilias(perrera.getHogarTemporal());
			}

			//Otra ocpión
			/*else
			{
				System.out.println("Esa opción no existe, intente de nuevo\n");
			}*/
		}
	}
}