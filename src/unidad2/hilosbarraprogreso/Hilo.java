package unidad2.hilosbarraprogreso;

public class Hilo implements Runnable {

	public static boolean terminado = false;
	public static int progreso = 0;
	public String nombredelHilo;
	public Hilo ( String nombre ) { this.nombredelHilo = nombre;}
	
	@Override
	public void run() {
		terminado = false;
		for (int i=1; i<=100;i++) {
			System.out.println("Hilo.Java PROCESANDO " + progreso + "%");
			progreso = i;
			try { Thread.sleep(80);
			} catch (InterruptedException e) { System.out.println("Hilo.Java INTERRUMPIDO");
			
			}
		}
		terminado = true;
		
	}

}
