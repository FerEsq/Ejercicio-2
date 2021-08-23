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
    private boolean asignado;

    public Perrera() //constructor
    {  
        hogarTemporal = new String[15];
        sinHogar = false;
        asignado = false;
    }
    
    public void asignarPerro(Perrito p, String[][] f)
    {
        int cH = 0;
        int limite = 0;
        for (int i = 0; i < f.length; i++)
            {
                if (f[i] == null)
                {
                    limite = i;
                    break;
                }
            }

            for (int cF = 0; cF < limite; cF++)
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
            }
            if ( hogarTemporal[0] == null)
            {
                sinHogar = true;
            }
    }

    public void acogerPerro(String ape, String[][] fam)
    {
        boolean bandera = false;
        int nuevasMascotas = 0;

        int lim1 = 0;
        for (int k = 0; k < hogarTemporal.length; k++)
        {
            
            if (hogarTemporal[k] == null)
            {
                lim1 = k;
                break;
            }
        }

        for (int i = 0; i < lim1; i++) //validar que la familia si puede acoger al perro
        {
            if (hogarTemporal[i].equals(ape))
            {
                bandera = true;
                break;
            }
        }

        if (bandera == true)
        {
            int lim = 0;
            for (int n = 0; n < fam.length; n++)
            {
                if (fam[n] == null)
                {
                    lim = n;
                    break;
                }
            }

            for (int j = 0; j < lim; j++)
            {
                if (fam[j][0].equals(ape))
                {
                    nuevasMascotas = Integer.parseInt(fam[j][4]) + 1;
                    fam[j][4] = Integer.toString(nuevasMascotas);
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("La familia " + ape + " ahora tiene " + nuevasMascotas + " mascotas acogidas");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    asignado = true;
                }
            }
        }
        else
        {
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("La familia no es apta para acoger el perro, porfavor inténtelo de nuevo");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    public String[] getHogarTemporal()
    {
        return hogarTemporal;
    }

    public boolean getSinHogar()
    {
        return sinHogar;
    }

    public boolean getAsignado()
    {
        return asignado;
    }
}
