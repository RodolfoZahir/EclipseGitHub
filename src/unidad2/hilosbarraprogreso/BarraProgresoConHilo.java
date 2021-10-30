package unidad2.hilosbarraprogreso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class BarraProgresoConHilo extends JFrame {
	private JProgressBar progressBar;
	private JPanel contentPane_1;
	private JProgressBar progressBarr;

	public static void main(String[] args) {

					BarraProgresoConHilo frame = new BarraProgresoConHilo();
					frame.setVisible(true);

	}

	public BarraProgresoConHilo() {
		progressBar = new JProgressBar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_1);
		contentPane_1.setLayout(null);
		
		
		JButton btnSalirr = new JButton("Salir");
		btnSalirr.setBackground(Color.BLACK);
		btnSalirr.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30));
		btnSalirr.setForeground(Color.WHITE);
		btnSalirr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalirr.setBounds(252, 156, 128, 34);
		contentPane_1.add(btnSalirr);
		
		JButton btnIniciarr = new JButton("Iniciar");
		btnIniciarr.setBackground(Color.BLACK);
		btnIniciarr.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30));
		btnIniciarr.setForeground(Color.WHITE);
		btnIniciarr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hilo objHilo1 = new Hilo("miHilo");
				Thread varHilo1= new Thread(objHilo1);
				ProgresoDelHilo objHilo2= new ProgresoDelHilo(progressBarr);
				Thread varHilo2= new Thread(objHilo2);
				varHilo1.start();
				varHilo2.start();
			}
		});
		btnIniciarr.setBounds(51, 156, 128, 34);
		contentPane_1.add(btnIniciarr);
		
		progressBarr = new JProgressBar();
		progressBarr.setBackground(Color.BLACK);
		progressBarr.setForeground(Color.GREEN);
		progressBarr.setBounds(116, 101, 204, 23);
		contentPane_1.add(progressBarr);
	}

}
