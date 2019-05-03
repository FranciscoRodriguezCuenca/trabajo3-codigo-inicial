package etsisi.ems.trabajo3.banco;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Vector;

public class Utilidades {
	public static Movimiento nuevoMovimiento(double importe, String mensaje) {
		
		Movimiento m = new Movimiento();
		m.setConcepto(mensaje);
		m.setImporte(importe);
		Date date = new Date();
		LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		m.setFecha(fecha);
		//mMovimientos.addElement(m);
		return m;
	}
	
	public static double getSaldo(Vector<Movimiento> mMovimientos) {
		double r = 0.0;
		for (int i = 0; i < mMovimientos.size(); i++) {
			Movimiento m = (Movimiento) mMovimientos.elementAt(i);
			r += m.getImporte();			
		}
		return r;
	}
}
