package unidad2.hilosbarraprogreso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BarraProgresoConHilos extends JFrame {

	 
	private JPanel contentPane;
	private JButton btnSalir;
	private JButton btnIniciar;
	private JProgressBar progressBar;
	

	public static void main(String[] args) {
		
	}


	public BarraProgresoConHilos() {
		btnSalir = new JButton("Salir");
		btnIniciar = new JButton("Iniciar");
		progressBar = new JProgressBar();
		contentPane = new JPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(progressBar);
		contentPane.add(btnIniciar);
		contentPane.add(btnSalir);
		setContentPane(contentPane);
		setVisible(true);
		
		btnIniciar = new JButton("INICIAR");
		btnIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hilo objHilo1 = new Hilo("miHilo");
				Thread varHilo1= new Thread(objHilo1);
				
				ProgresoDelHilo objHilo2= new ProgresoDelHilo(progressBar);
				Thread varHilo2= new Thread(objHilo2);
				varHilo1.start();
				varHilo2.start();
			}
		});
		btnIniciar.setBounds(35, 191, 89, 23);
		contentPane.add(btnIniciar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(302, 191, 89, 23);
		contentPane.add(btnSalir);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(68, 64, 305, 46);
		contentPane.add(progressBar);
	}
}
