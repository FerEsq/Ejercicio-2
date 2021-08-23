import javax.lang.model.util.ElementScanner14;

/* Nombre: Perrera.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Descripción: ---------------------
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 22.08.2021 */

public class Perrera 
{
    private String[] hogarTemporal;
    private boolean sinHogar;

    public Perrera() //constructor
    {  
        hogarTemporal = new String[14];
        sinHogar = false;
    }
    
    public void asignarPerro(Perro p, String[][] f)
    {
        int cH = 0;
        int cF = 0;
        if (p.getAsignado() == false)
        {
            while (sinHogar == false)
            {
                if (p.getPeligrosidad() == true) //el perro es peligroso
                {
                    if (f[cF][2] == "0" && f[cF][3] == "0" && Integer.parseInt(f[cF][4]) < 4) //familias sin hijos 
                    {
                        hogarTemporal[cH] = f[cF][0];
                        cH++;
                    }
                }
                else //el perro no es peligroso
                {
                    if (p.getSize().toLowerCase() == "pequeño" || p.getRaza().toLowerCase() == "labrador") //el perro es pequeño o labrador
                    {
                        if (Integer.parseInt(f[cF][4]) < 4) //cualquier tipo de familia puede acogerlo
                        {
                            hogarTemporal[cH] = f[cF][0];
                            cH++;   
                        }
                    }

                    else if (p.getSize().toLowerCase() == "mediano") //el perro es pequeño o labrador
                    {
                        if (f[cF][2] == "0" && Integer.parseInt(f[cF][4]) < 4) //cualquier tipo de familia puede acogerlo
                        {
                            hogarTemporal[cH] = f[cF][0];
                            cH++;   
                        }
                    }

                    else if (p.getSize().toLowerCase() == "grande") //el perro es pequeño o labrador
                    {
                        if (f[cF][2] == "0" && f[cF][3] == "0" && Integer.parseInt(f[cF][4]) < 4) //familias sin hijos 
                        {
                            hogarTemporal[cH] = f[cF][0];
                            cH++;
                        }
                    }
                }
                cF++;
            }
        }
        else     
        {

        }

    }
}
