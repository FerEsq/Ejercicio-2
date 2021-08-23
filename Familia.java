
/* Nombre: Familia.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Descripción: ---------------------
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 22.08.2021 */

public class Familia 
{
    private String[] vectorF;
    private String[][] familias = new String[15][];

    public Familia()
    {
        familias[0] = new String[]{"Esquivel", "4", "1", "3", "1"}; 
        familias[1] = new String[]{"De Leon", "3", "0", "3", "1"}; 
        familias[2] = new String[]{"Giron", "2", "0", "2", "0"}; 
    }
    
    public Familia(String apellido, String miembros, String chicos, String grandes, String mascotas) //constructor
    {
        vectorF = new String[5];
        vectorF = new String[]{apellido, miembros, chicos, grandes, mascotas}; 

        familias[0] = new String[]{"Esquivel", "4", "1", "3", "1"}; 
        familias[1] = new String[]{"de Leon", "3", "0", "3", "1"}; 
        familias[2] = new String[]{"Giron", "2", "0", "2", "0"}; 
    } 

    public String[][] ingresarFamilia(int pos, String[][] fam) 
    { 
        fam[pos] = vectorF;    
        return fam;
    }

    public String[][] getFamilias()
    {
        return familias;
    } 
    
}
