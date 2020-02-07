package pe.com.johimesa.udemy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilitario {

	public static String formatDate(Date fecha, String formato) {
				
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		// Se pone otro comentarios
		return sdf.format(fecha);
	}
	
}
