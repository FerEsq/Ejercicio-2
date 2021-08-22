
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
		Scanner scan = new Scanner(System.in);
		//Crear perro y amigo (se instancia por si el usuario no crea unas al ejecutar el programa)
		String raz = "Sin especificar";
		String col = "Sin especificar";
		String nom = "Sin especificar";
		Perro perro = new Perro(raz, col, nom);
		Amigo amigo = new Amigo();
		//Propiedades 
		String tel = "Sin especificar";
		int rec = 0;
		int pregunta = 0;
		int sE = 0;
		int opcion = 0;
		int saldo = amigo.getDinero();

		//Mensajes de bienvenida
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" ✦ Bienvenido al asistente de búsqueda de perros perdidos ✦ \n");
		System.out.println(" - Se ha creado un amigo con suerte: " + amigo.getSuerte() + " y dinero: Q" + amigo.getDinero() + ".00");
		System.out.println(" - Se ha creado un perro sin descripción, para cambiar esto cree un nuevo perro");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				
		while (opcion != 7)
		{
			//Menú
			System.out.println("¿Que opción desea ejecutar? (ingrese solo el número)");	
			System.out.println("1. Nuevo amigo");
			System.out.println("2. Nuevo perro");
			System.out.println("3. Llamar a la perrera");
			System.out.println("4. Imprimir anuncio");
			System.out.println("5. Publicar en el periódico local");
			System.out.println("6. Consultar dinero");
			System.out.println("7. Salir\n");
			
			opcion = scan.nextInt();
			
			//Nuevo amigo
			if (opcion == 1)
			{	
				//Condicional suerte
				System.out.println("¿Como desea generar su nuevo amigo? (ingrese solo el número)");	
				System.out.println("1. Suerte al azar");
				System.out.println("2. Suerte específica");
				pregunta = scan.nextInt();

				if (pregunta == 1) //generar amigo con suerte al azar
				{	
					amigo = new Amigo();
					saldo = amigo.getDinero();
					System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println(" - Se ha creado un nuevo amigo con suerte: " + amigo.getSuerte() + " y dinero: Q" + amigo.getDinero() + ".00");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				} 
				else if (pregunta == 2) //generar amigo con suerte ingresada por el usuario
				{	
					System.out.println("Ingrese la suerte del nuevo amigo: ");
					sE = scan.nextInt();
					amigo = new Amigo(sE);
					saldo = amigo.getDinero();
					System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println(" - Se ha creado un nuevo amigo con suerte: " + amigo.getSuerte() + " y dinero: Q" + amigo.getDinero() + ".00");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				} 
			} 

			//Nuevo perro
			else if (opcion == 2)
			{
				//Solicitar propiedades del perro
				raz = scan.nextLine();
				System.out.println("Ingrese la raza del perro: ");	
				raz = scan.nextLine();
				System.out.println("Ingrese el color del perro: ");	
				col = scan.nextLine();
				System.out.println("Ingrese el nombre del perro: ");	
				nom = scan.nextLine();
				//Crear nuevo perro
				perro = new Perro(raz, col, nom);
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println(" - Se ha creado un nuevo perro de raza " + raz + ", color " + col + " y nombre " + nom);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			} 

			//Pererra
			else if (opcion == 3)
			{
				if (perro.getEncontrado() == false) //si no se ha encontrado al perro
				{
					perro.callPerrera(amigo.getSuerte());
				}
				else //si ya se encontró al perro
				{
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Parece que ya han encontrado a su perro, no creo que sea necesario llamar a la perrera");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				}
			} 
			
			//Anuncio
			else if (opcion == 4)
			{
				if (perro.getEncontrado() == false) //si no se ha encontrado al perro
				{
					if (saldo >= 25) //si tiene suficiente dinero
					{
						//Solicitar datos del anuncio
						tel = scan.nextLine();
						System.out.println("Ingrese su teléfono de contacto: ");
						tel = scan.nextLine();
						System.out.println("Ingrese la recompensa ofrecida: ");	
						rec = scan.nextInt();
						//Imprimir y analizar anuncio	
						perro.printAnuncio(tel, rec);
						saldo = perro.suerteAnuncio(saldo, amigo.getSuerte());
					}
					else //no tiene suficiente dinero
					{
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            			System.out.println("Parece que no tienes suficiente dinero :(");
            			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
					}
				}
				else //si ya se encontró al perro
				{
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Parece que ya han encontrado a su perro, no creo que sea necesario colocar su anuncio en todas partes");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				}
						
			} 

			//Periodico
			else if (opcion == 5)
			{
				if (perro.getEncontrado() == false) //si no se ha encontrado al perro
				{
					if (saldo >= 125) //si tiene suficiente dinero
					{
						//Solicitar datos del anuncio
						tel = scan.nextLine();
						System.out.println("Ingrese su teléfono de contacto: ");
						tel = scan.nextLine();
						System.out.println("Ingrese la recompensa ofrecida: ");	
						rec = scan.nextInt();	
						//Imprimir y analizar anuncio	
						perro.printPeriodico(tel, rec);
						saldo = perro.suertePeriodico(saldo, amigo.getSuerte());
					}
					else //no tiene suficiente dinero
					{
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            			System.out.println("Parece que no tienes suficiente dinero :(");
            			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
					}
				}
				else //si ya se encontró al perro
				{
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Parece que ya han encontrado a su perro, no creo que sea necesario publicar su anuncio en el periódico local");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				}
			}

			//Dinero
			else if (opcion == 6)
			{
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Su saldo es de: Q" + saldo + ".00"); //imprimir saldo
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~\n");
			}

			//Salir
			else if (opcion == 7)
			{
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println(" ✦ Gracias por utilizar nuestro sistema. ¡Vuelva pronto! ✦ "); 
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");	
			}

			//Otra ocpión
			else
			{
				System.out.println("Esa opción no existe, intente de nuevo\n");
			}
		}
	}
}