package sv.gob.mined.apps.utilitario;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleDateFormat sdf = new SimpleDateFormat("hh 'horas con' mm 'minutos del día' dd 'de' MMMM 'de' YYYY");
        
        System.out.println(Herramientas.aLetras(new BigDecimal("1400.32")));
    }
}
