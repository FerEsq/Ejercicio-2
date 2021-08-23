/* Nombre: Perro.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 22.08.2021 */

public class Perrito
{
    //Propiedades
    private String raza;
    private String size;
    private int edad;
    private int salud;
    private String color;
    private String nombre;
    private boolean peligro;
    //array razas peligrosas
    private String[] razasP = {"pit bull terrier", "american staffordshire terrier", "tosa inu", "dogo argentino", "dogo guatemalteco",
                               "fila brasileño", "presa canario", "dóberman", "gran perro japónes", "mástin napolitano", "presa mallorqui",
                                "dogo de burdeos", "bullmastiff", "bull terrier inglés", "bulldog americano", "rhodesiano", "rottweiler"};
    
    public Perrito(String r, String si, int e, int sa, String c, String n) //constructor
    {
        raza = r;
        size = si;
        edad = e;
        salud = sa;
        color = c;
        nombre = c;
        peligro = false;    
    } 

    private void calcularPeligrosidad() //compara el array de razas peligrosas con la raza del perro para obtener su peligrosidad
    {
        int c = 0;
        while (peligro == false && c < 17)
        {
            if (razasP[c].equals(raza.toLowerCase()))
            {
                peligro = true;
                break;
            }
            c++;
        }
    }

    public boolean getPeligrosidad() //obtener la peligrosidad
    {
        calcularPeligrosidad();
        return peligro;
    }

    public String getRaza() //obtener la raza
    {
        return raza;
    }

    public String getSize() //obtener el tamaño
    {
        return size;
    }
    
}
