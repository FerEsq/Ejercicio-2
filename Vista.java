
/* Nombre: Vista.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 22.08.2021 */

//Import
import java.util.Scanner;

public class Vista 
{
    Scanner scan;
    Familia fam;
    public Vista() //constructor
    {  
        scan = new Scanner(System.in);
    }

    //Mensajes de bienvenida
    public void mostrarInicio(Familia fam, Perrito per)
    {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("   ✦ Bienvenid@ a Hogares Temporales para Canes (HTC) ✦ \n");
		System.out.println(" - Hay tres familias en el sistema: " + fam.getFamilias()[0][0] + ", " + fam.getFamilias()[1][0] + ", " + fam.getFamilias()[2][0]);
        System.out.println(" - Hay un perro en el sistema de raza: " + per.getRaza());
        System.out.println(" - Recuerde darle doble enter al ingresar un dato");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
    
    //Menu
    public int mostrarMenu()
    {
        int op = 0;
        System.out.println("¿Que opción desea ejecutar? (ingrese solo el número)");	
		System.out.println("1. Nueva familia");
		System.out.println("2. Nuevo perro");
		System.out.println("3. Asignar perro");
		System.out.println("4. Salir");

        op = scan.nextInt();
        return op;
    }

    public void sistemaLleno()
    {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("El sistema ha llegado a su límite, no es posible ingresar otra familia");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    //Nueva familia
    public String pedirApellido()
    {
        System.out.println("\nIngrese el apellido:");
        scan.nextLine();
        return scan.nextLine();
    }
    public String pedirMiembros()
    {
        System.out.println("\nIngrese el número de miembros:");
        scan.nextLine();
        return scan.nextLine();
    }
    public String pedirChicos()
    {
        System.out.println("\nIngrese el número de niños menores a 10 años:");
        scan.nextLine();
        return scan.nextLine();
    }
    public String pedirGrandes()
    {
        System.out.println("\nIngrese el número de niños mayores a 10 años:");
        scan.nextLine();
        return scan.nextLine();
    }
    public String pedirMascotas()
    {
        System.out.println("\nIngrese el número de mascotas acogidas:");
        scan.nextLine();
        return scan.nextLine();
    }

    //Nuevo perro
    public String pedirRaza()
    {
        System.out.println("\nIngrese la raza (si no la conoce coloque mestizo):");
        scan.nextLine();
        return scan.nextLine();
    }
    public String pedirSize()
    {
        System.out.println("\nIngrese el tamaño (pequeño, grande, mediano):");
        scan.nextLine();
        return scan.nextLine();
    }
    public int pedirEdad()
    {
        System.out.println("\nIngrese la edad:");
        return scan.nextInt();
    }
    public int pedirSalud()
    {
        System.out.println("\nIngrese la salud (0-100):");
        return scan.nextInt();
    }
    public String pedirColor()
    {
        System.out.println("\nIngrese el color:");
        scan.nextLine();
        return scan.nextLine();
    }
    public String pedirNombre()
    {
        System.out.println("\nIngrese el nombre:");
        scan.nextLine();
        return scan.nextLine();
    }

    //Asignar perro
    public void mostrarFamilias(String[] capaces)
    {
        System.out.println("\nLas familias que pueden acoger a este perro son:");
        for (int i = 0; i < capaces.length; i++)
        {
            if (capaces[i] != null)
            {
                System.out.println(capaces[i]);
            }
        }
    }
    public String pedirFamilia()
    {
        System.out.println("\nIngrese la familia que acogerá al perro");
        scan.nextLine();
        return scan.nextLine();
    }

    public void perroAsignado()
    {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("El perro ya fue asignado a un hogar");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void sinHogar()
    {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("No hay una familia apta para acoger al perro, se le habilitará un espacio en la perrera");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
