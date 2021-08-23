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
        hogarTemporal = new String[15];
        sinHogar = false;
    }
    
    public void asignarPerro(Perrito p, String[][] f)
    {
        int cH = 0;
        if (p.getAsignado() == false)
        {
            for (int cF = 0; cF <= f.length; cF++)
            {
                if (p.getPeligrosidad() == true) //el perro es peligroso
                {
                    if (f[cF][2].equals("0") && f[cF][3].equals("0") && Integer.parseInt(f[cF][4]) < 4) //familias sin hijos 
                    {
                        hogarTemporal[cH] = f[cF][0];
                        cH++;
                    }
                }
                else //el perro no es peligroso
                {
                    if (p.getSize().toLowerCase().equals("pequeño") || p.getRaza().toLowerCase().equals("labrador")) //el perro es pequeño o labrador
                    {
                        if (Integer.parseInt(f[cF][4]) < 4) //cualquier tipo de familia puede acogerlo
                        {
                            hogarTemporal[cH] = f[cF][0];
                            cH++;   
                        }
                    }

                    else if (p.getSize().toLowerCase().equals("mediano")) //el perro es mediano
                    {
                        if (f[cF][2].equals("0") && Integer.parseInt(f[cF][4]) < 4) //familia sin niños pequeños
                        {
                            hogarTemporal[cH] = f[cF][0];
                            cH++;   
                        }
                    }

                    else if (p.getSize().toLowerCase().equals("grande")) //el perro es grande
                    {
                        if (f[cF][2].equals("0") && f[cF][3].equals("0") && Integer.parseInt(f[cF][4]) < 4) //familias sin hijos 
                        {
                            hogarTemporal[cH] = f[cF][0];
                            cH++;
                        }
                    }
                }
                cF++;
            }
            if ( hogarTemporal[0] == null)
            {
                sinHogar = true;
            }
        }
    }

    public void acogerPerro(String ape, String[][] fam)
    {
        boolean bandera = false;
        int nuevasMascotas = 0;

        for (int i = 0; i <= hogarTemporal.length; i++) //validar que la familia si puede acoger al perro
        {
            if (hogarTemporal[i].equals(ape))
            {
                bandera = true;
            }
            else
            {
                bandera = false;
            }
        }

        if (bandera == true)
        {
            for (int j = 0; j <= fam.length; j++)
            {
                if (fam[j][0].equals(ape))
                {
                    nuevasMascotas = Integer.parseInt(fam[j][0]) + 1;
                    fam[j][4] = Integer.toString(nuevasMascotas);
                    
                }
            }
        }
    }

    public String[] getHogarTemporal()
    {
        return hogarTemporal;
    }

    public String[] getSinHogar()
    {
        return sinHogar;
    }
}
