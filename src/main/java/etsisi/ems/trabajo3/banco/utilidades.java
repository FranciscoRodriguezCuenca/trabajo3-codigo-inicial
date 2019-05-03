package etsisi.ems.trabajo3.banco;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Vector;

public class utilidades {
	
	public static void nuevoMovimiento(double importe, String mensaje, Vector<Movimiento> mMovimientos) {
		
		Movimiento m = new Movimiento();
		m.setConcepto(mensaje);
		m.setImporte(importe);
		Date date = new Date();
		LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		m.setFecha(fecha);
		mMovimientos.addElement(m);
	}
}
