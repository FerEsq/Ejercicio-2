/* Nombre: Perro.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Descripción: ---------------------
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 22.08.2021 */

public class Perrito
{
    private String raza;
    private String size;
    private int edad;
    private int salud;
    private String color;
    private String nombre;
    private boolean peligro;
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

    public void calcularPeligrosidad()
    {
        int c = 0;
        while (peligro == false)
        {
            if (razasP[c].equals(raza.toLowerCase()))
            {
                peligro = true;
            }
            c++;
        }
    }

    public boolean getPeligrosidad()
    {
        return peligro;
    }

    public String getRaza()
    {
        return raza;
    }

    public String getSize()
    {
        return size;
    }
    
}
