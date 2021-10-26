package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwingCollection extends JFrame {

	private JPanel contentPane;
	private JTextField inpDatos;
	public static void main(String[] args) {
		
					SwingCollection frame = new SwingCollection();
					frame.setVisible(true);
}
	public SwingCollection() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExpresion = new JLabel("Teclee la Expresi\u00F3n:");
		lblExpresion.setBackground(Color.WHITE);
		lblExpresion.setForeground(Color.BLACK);
		lblExpresion.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 14));
		lblExpresion.setBounds(10, 11, 122, 35);
		contentPane.add(lblExpresion);
		
		inpDatos = new JTextField();
		inpDatos.setBounds(127, 13, 163, 29);
		contentPane.add(inpDatos);
		inpDatos.setColumns(10);
		
		JButton btnNewButton = new JButton("Resolver");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Stack<String> Pila = new Stack<String>();
				String operacion = inpDatos.getText();
				char caracter = ' ';
				int flagError = 0;
				int x = 0;
				int menu = 0;
				double resultado = 0;
				//1 Suma
			    //2 Resta
				//3 Multiplicacion
				//4 Division
				for (int i=0; i<operacion.length(); i++)
				{
					caracter = operacion.charAt(i);
					if (caracter=='(') {Pila.push("abre");}
					if (caracter==')') 
					{for (int j = 0; j<operacion.length(); j++)
					{if (caracter == '0') {x = 0;}{if (caracter == '1') {x = 1;}{if (caracter == '2') {x = 2;}
					{if (caracter == '3') {x = 3;}{if (caracter == '4') {x = 4;}{if (caracter == '5') {x = 5;}
					{if (caracter == '6') {x = 6;}{if (caracter == '7') {x = 7;}{if (caracter == '8') {x = 8;}
					{if (caracter == '9') {x = 9;}
					{if (caracter=='+') {menu = 1; resultado = resultado + x;}
					{if (caracter=='-') {menu = 2; resultado = resultado - x;}
					{if (caracter=='*') {menu = 3; resultado = resultado * x;}
					{if (caracter=='/') {menu = 4; resultado = resultado / x;}
					{if (caracter==')' && menu==1); {resultado = resultado + x;}}
					{if (caracter==')' && menu==2); {resultado = resultado - x;}}
					{if (caracter==')' && menu==3); {resultado = resultado * x;}}
					{if (caracter==')' && menu==4); {resultado = resultado / x;}}
					{if (Pila.size()==0) {flagError = 1; break;}
					else {Pila.pop(); }
					}
				}
				}
			}}}}}}}}}}}}}}
				if (Pila.isEmpty() && flagError == 0) {JOptionPane.showMessageDialog(null,"Está Correcta la Expresión"); }
				else {JOptionPane.showMessageDialog(null,"Está Incorrecta la Expresión");
				}
				JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 14));
		btnNewButton.setBounds(311, 13, 98, 30);
		contentPane.add(btnNewButton);
	}
				}
