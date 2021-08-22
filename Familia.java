
/* Nombre: Familia.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Descripción: ---------------------
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 22.08.2021 */

public class Familia 
{
    private Random rand; 
    private boolean galleta;
    private float confiabilidad;
    
    public Familia() //constructor
    { 
        rand = new Random();
        galleta = false;
        confiabilidad = rand.nextFloat() * 10;
    } 
    
}
