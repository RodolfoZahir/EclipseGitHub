package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class JRadioButton extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
					JRadioButton frame = new JRadioButton();
					frame.setVisible(true);
				    
	}
	int contador = 1;
	int respuestaP1 = 0;
	int respuestaP2 = 0;
	int respuestaP3 = 0;
	int respuestaP4 = 0;
	int respuestaP5 = 0;
	int evaluacion = 0;

	public JRadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		javax.swing.JRadioButton rdP1A = new javax.swing.JRadioButton("Si");
		rdP1A.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdP1A.setBounds(480, 23, 43, 23);
		contentPane.add(rdP1A);
		
		javax.swing.JRadioButton rdP1B = new javax.swing.JRadioButton("No");
		rdP1B.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdP1B.setBounds(525, 21, 62, 23);
		contentPane.add(rdP1B);
		
		ButtonGroup rdP1 = new ButtonGroup();
		rdP1.add(rdP1A);
		rdP1.add(rdP1B);
		
		javax.swing.JRadioButton rdP2A = new javax.swing.JRadioButton("Si");
		rdP2A.setVisible(false);
		rdP2A.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdP2A.setBounds(480, 49, 43, 23);
		contentPane.add(rdP2A);
		
		javax.swing.JRadioButton rdP2B = new javax.swing.JRadioButton("No");
		rdP2B.setVisible(false);
		rdP2B.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdP2B.setBounds(525, 49, 62, 23);
		contentPane.add(rdP2B);
		ButtonGroup rdP2 = new ButtonGroup();
		rdP2.add(rdP2A);
		rdP2.add(rdP2B);
		
		javax.swing.JRadioButton rdP3A = new javax.swing.JRadioButton("Si");
		rdP3A.setVisible(false);
		rdP3A.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdP3A.setBounds(480, 75, 43, 23);
		contentPane.add(rdP3A);
		
		javax.swing.JRadioButton rdP3B = new javax.swing.JRadioButton("No");
		rdP3B.setVisible(false);
		rdP3B.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdP3B.setBounds(525, 75, 62, 23);
		contentPane.add(rdP3B);
		ButtonGroup rdP3 = new ButtonGroup();
		rdP3.add(rdP3A);
		rdP3.add(rdP3B);
		
		javax.swing.JRadioButton rdP4A = new javax.swing.JRadioButton("Si");
		rdP4A.setVisible(false);
		rdP4A.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdP4A.setBounds(480, 101, 43, 23);
		contentPane.add(rdP4A);
		
		javax.swing.JRadioButton rdP4B = new javax.swing.JRadioButton("No");
		rdP4B.setVisible(false);
		rdP4B.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdP4B.setBounds(525, 101, 62, 23);
		contentPane.add(rdP4B);
		ButtonGroup rdP4 = new ButtonGroup();
		rdP4.add(rdP4A);
		rdP4.add(rdP4B);
		
		javax.swing.JRadioButton rdP5A = new javax.swing.JRadioButton("Si");
		rdP5A.setVisible(false);
		rdP5A.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdP5A.setBounds(480, 127, 43, 23);
		contentPane.add(rdP5A);
		
		javax.swing.JRadioButton rdP5B = new javax.swing.JRadioButton("No");
		rdP5B.setVisible(false);
		rdP5B.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdP5B.setBounds(525, 127, 62, 23);
		contentPane.add(rdP5B);
		ButtonGroup rdP5 = new ButtonGroup();
		rdP5.add(rdP5A);
		rdP5.add(rdP5B);
		
		JLabel inpP1 = new JLabel("\u00BFLos Peces Betta Necesitan Oxigeno Para Sobrevivir?");
		inpP1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		inpP1.setBounds(10, 21, 417, 27);
		contentPane.add(inpP1);
		
		JLabel inpP2 = new JLabel("\u00BFLos Peces Globo Pueden Vivir Toda Su Vida En Agua Dulce?");
		inpP2.setVisible(false);
		inpP2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		inpP2.setBounds(10, 47, 453, 27);
		contentPane.add(inpP2);
		
		JLabel inpP3 = new JLabel("\u00BFLos Peces Pueden Tener Dientes?");
		inpP3.setVisible(false);
		inpP3.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		inpP3.setBounds(10, 71, 453, 27);
		contentPane.add(inpP3);
		
		JLabel inpP4 = new JLabel("\u00BFTodos Los Peces Tienen Escamas?");
		inpP4.setVisible(false);
		inpP4.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		inpP4.setBounds(10, 101, 453, 27);
		contentPane.add(inpP4);
		
		JLabel inpP5 = new JLabel("\u00BFLos Peces Pueden Tener Mejor Vista Que Un Humano?");
		inpP5.setVisible(false);
		inpP5.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		inpP5.setBounds(10, 130, 453, 27);
		contentPane.add(inpP5);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador = contador - 1;
				switch(contador) {
				case 1:
					inpP1.setVisible(true);
					rdP1A.setVisible(true);
					rdP1B.setVisible(true);
					inpP2.setVisible(false);
					rdP2A.setVisible(false);
					rdP2B.setVisible(false);
					inpP3.setVisible(false);
					rdP3A.setVisible(false);
					rdP3B.setVisible(false);
					inpP4.setVisible(false);
					rdP4A.setVisible(false);
					rdP4B.setVisible(false);
					inpP5.setVisible(false);
					rdP5A.setVisible(false);
					rdP5B.setVisible(false);
					break;
				case 2:
					inpP1.setVisible(false);
					rdP1A.setVisible(false);
					rdP1B.setVisible(false);
					inpP2.setVisible(true);
					rdP2A.setVisible(true);
					rdP2B.setVisible(true);
					inpP3.setVisible(false);
					rdP3A.setVisible(false);
					rdP3B.setVisible(false);
					inpP4.setVisible(false);
					rdP4A.setVisible(false);
					rdP4B.setVisible(false);
					inpP5.setVisible(false);
					rdP5A.setVisible(false);
					rdP5B.setVisible(false);
					break;
				case 3:
					inpP1.setVisible(false);
					rdP1A.setVisible(false);
					rdP1B.setVisible(false);
					inpP2.setVisible(false);
					rdP2A.setVisible(false);
					rdP2B.setVisible(false);
					inpP3.setVisible(true);
					rdP3A.setVisible(true);
					rdP3B.setVisible(true);
					inpP4.setVisible(false);
					rdP4A.setVisible(false);
					rdP4B.setVisible(false);
					inpP5.setVisible(false);
					rdP5A.setVisible(false);
					rdP5B.setVisible(false);
					break;
				case 4:
					inpP1.setVisible(false);
					rdP1A.setVisible(false);
					rdP1B.setVisible(false);
					inpP2.setVisible(false);
					rdP2A.setVisible(false);
					rdP2B.setVisible(false);
					inpP3.setVisible(false);
					rdP3A.setVisible(false);
					rdP3B.setVisible(false);
					inpP4.setVisible(true);
					rdP4A.setVisible(true);
					rdP4B.setVisible(true);
					inpP5.setVisible(false);
					rdP5A.setVisible(false);
					rdP5B.setVisible(false);
					break;
				case 5:
					inpP1.setVisible(false);
					rdP1A.setVisible(false);
					rdP1B.setVisible(false);
					inpP2.setVisible(false);
					rdP2A.setVisible(false);
					rdP2B.setVisible(false);
					inpP3.setVisible(false);
					rdP3A.setVisible(false);
					rdP3B.setVisible(false);
					inpP4.setVisible(false);
					rdP4A.setVisible(false);
					rdP4B.setVisible(false);
					inpP5.setVisible(true);
					rdP5A.setVisible(true);
					rdP5B.setVisible(true);
					break;
				}
			}
		});
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnterior.setBackground(Color.CYAN);
		btnAnterior.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 14));
		btnAnterior.setBounds(26, 193, 89, 23);
		contentPane.add(btnAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador = contador + 1;
				switch(contador) {
				case 1:
					inpP1.setVisible(true);
					rdP1A.setVisible(true);
					rdP1B.setVisible(true);
					inpP2.setVisible(false);
					rdP2A.setVisible(false);
					rdP2B.setVisible(false);
					inpP3.setVisible(false);
					rdP3A.setVisible(false);
					rdP3B.setVisible(false);
					inpP4.setVisible(false);
					rdP4A.setVisible(false);
					rdP4B.setVisible(false);
					inpP5.setVisible(false);
					rdP5A.setVisible(false);
					rdP5B.setVisible(false);
					break;
				case 2:
					inpP1.setVisible(false);
					rdP1A.setVisible(false);
					rdP1B.setVisible(false);
					inpP2.setVisible(true);
					rdP2A.setVisible(true);
					rdP2B.setVisible(true);
					inpP3.setVisible(false);
					rdP3A.setVisible(false);
					rdP3B.setVisible(false);
					inpP4.setVisible(false);
					rdP4A.setVisible(false);
					rdP4B.setVisible(false);
					inpP5.setVisible(false);
					rdP5A.setVisible(false);
					rdP5B.setVisible(false);
					break;
				case 3:
					inpP1.setVisible(false);
					rdP1A.setVisible(false);
					rdP1B.setVisible(false);
					inpP2.setVisible(false);
					rdP2A.setVisible(false);
					rdP2B.setVisible(false);
					inpP3.setVisible(true);
					rdP3A.setVisible(true);
					rdP3B.setVisible(true);
					inpP4.setVisible(false);
					rdP4A.setVisible(false);
					rdP4B.setVisible(false);
					inpP5.setVisible(false);
					rdP5A.setVisible(false);
					rdP5B.setVisible(false);
					
					break;
				case 4:
					inpP1.setVisible(false);
					rdP1A.setVisible(false);
					rdP1B.setVisible(false);
					inpP2.setVisible(false);
					rdP2A.setVisible(false);
					rdP2B.setVisible(false);
					inpP3.setVisible(false);
					rdP3A.setVisible(false);
					rdP3B.setVisible(false);
					inpP4.setVisible(true);
					rdP4A.setVisible(true);
					rdP4B.setVisible(true);
					inpP5.setVisible(false);
					rdP5A.setVisible(false);
					rdP5B.setVisible(false);
				    
					break;
				case 5:
					inpP1.setVisible(false);
					rdP1A.setVisible(false);
					rdP1B.setVisible(false);
					inpP2.setVisible(false);
					rdP2A.setVisible(false);
					rdP2B.setVisible(false);
					inpP3.setVisible(false);
					rdP3A.setVisible(false);
					rdP3B.setVisible(false);
					inpP4.setVisible(false);
					rdP4A.setVisible(false);
					rdP4B.setVisible(false);
					inpP5.setVisible(true);
					rdP5A.setVisible(true);
					rdP5B.setVisible(true);
					break;
				
				}
				
				
				if (contador > 5)
				{
					contador--;
				}
			}
		});
		btnSiguiente.setBackground(Color.CYAN);
		btnSiguiente.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 14));
		btnSiguiente.setBounds(139, 193, 89, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				for (int i = 0; i<5; i++)
				{
					if (i == 0)
					{
						if (rdP1A.isSelected())
						{
							
						}
						else
						{
							evaluacion = evaluacion + 1;
						}
					}
					if (i == 1)
					{
						if (rdP2A.isSelected())
						{
							
						}
						else
						{
							evaluacion = evaluacion + 1;
						}
					}
					if (i == 2)
					{
						if (rdP3A.isSelected())
						{
							evaluacion = evaluacion + 1;
						}
					}
					if (i == 3)
					{
						if (rdP4A.isSelected())
						{
							
						}
						else
						{
							evaluacion = evaluacion + 1;
						}
					}
					if (i == 4)
					{
						if (rdP5A.isSelected())
						{
							evaluacion = evaluacion + 1;
						}
					}
				}
				JOptionPane.showMessageDialog(null,"Cantidad de aciertos: " + evaluacion);
			}
		});
		btnEvaluar.setBackground(Color.CYAN);
		btnEvaluar.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 14));
		btnEvaluar.setBounds(254, 193, 89, 23);
		contentPane.add(btnEvaluar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBackground(Color.CYAN);
		btnSalir.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 14));
		btnSalir.setBounds(374, 193, 89, 23);
		contentPane.add(btnSalir);
	}
}
