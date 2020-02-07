package pe.com.johimesa.udemy;

import java.util.Date;

import pe.com.johimesa.udemy.util.Utilitario;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String fecha = Utilitario.formatDate(new Date(), "yyyy/MM/dd HH:mm:ss a");
        
        System.out.println(fecha);
    }
}
