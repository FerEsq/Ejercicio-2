
/* Nombre: Familia.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 22.08.2021 */

public class Familia 
{
    //Propiedades
    private String[] vectorF;
    private String[][] familias = new String[15][];

    public Familia() //el usuario no ingresa una nueva familia
    {
        familias[0] = new String[]{"Esquivel", "4", "1", "3", "1"}; 
        familias[1] = new String[]{"De Leon", "3", "0", "3", "4"}; 
        familias[2] = new String[]{"Giron", "2", "0", "0", "0"}; 
    }
    
    public Familia(String apellido, String miembros, String chicos, String grandes, String mascotas) //el usuario ingresa una nueva familia
    {
        vectorF = new String[5];
        vectorF = new String[]{apellido, miembros, chicos, grandes, mascotas}; 

        familias[0] = new String[]{"Esquivel", "4", "1", "3", "1"}; 
        familias[1] = new String[]{"de Leon", "3", "0", "3", "1"}; 
        familias[2] = new String[]{"Giron", "2", "0", "2", "0"}; 
    } 

    public String[][] ingresarFamilia(int pos, String[][] fam) //ingresar la familia al array de familias
    { 
        fam[pos] = vectorF;    
        return fam;
    }

    public String[][] getFamilias() //obtemer el array de familias
    {
        return familias;
    } 
    
}
