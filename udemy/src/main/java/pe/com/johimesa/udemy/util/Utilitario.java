package pe.com.johimesa.udemy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilitario {

	public static String formatDate(Date fecha, String formato) {
		
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		
		return sdf.format(fecha);
	}
	
}
