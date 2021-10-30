package unidad2.hilosbarraprogreso;

import javax.swing.JProgressBar;

public class ProgresoDelHilo implements Runnable {
	
	private JProgressBar barra;
	
	public ProgresoDelHilo (JProgressBar barraVentana ) {this.barra = barraVentana;
}
	@Override
	public void run() {
		while( !Hilo.terminado==true) { 
			barra.setValue(Hilo.progreso);
			barra.repaint();
			int i = 0;
		     try {                             
		         while (i <= 100) {
		             Thread.sleep(1000);                    // <- Sleep, Aquí está la demora, Que refleja el avance de 10 en 10 en Jbar
		             i += 10;
		             barra.setValue(i);
		         }
		     }
		     catch (Exception e) {
		         System.err.println( e.getMessage() );
		     }
			if (Hilo.terminado) {
				barra.setValue(100);
				System.out.println("ProgresoDelHilo.java TERMINADO");
				break;
			}
		}
		
	}
}
