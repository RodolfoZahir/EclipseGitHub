package ejercicio1;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaSerie extends JFrame {

	private JPanel contentPane;
	private JTextField inpNumero1;
	private JLabel lblNumero1;
	private JLabel lblNumero2;
	private JTextField inpNumero2;
	private JLabel lblIteraciones;
	private JTextField inpIteraciones;
	private JButton btnGenerar;
	private JTextArea varSerie;

	public static void main(String[] args) {
		VentanaSerie frame = new VentanaSerie();
		frame.setVisible(true);
	}

	public VentanaSerie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		inpNumero1 = new JTextField();
		inpNumero1.setBounds(117, 11, 86, 20);
		contentPane.add(inpNumero1);
		inpNumero1.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(117, 98, 89, 23);
		contentPane.add(btnSalir);
		
		lblNumero1 = new JLabel("Numero Inicial 1:");
		lblNumero1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		lblNumero1.setBounds(10, 14, 111, 14);
		contentPane.add(lblNumero1);
		
		lblNumero2 = new JLabel("Numero Inicial 2:");
		lblNumero2.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		lblNumero2.setBounds(10, 45, 111, 14);
		contentPane.add(lblNumero2);
		
		inpNumero2 = new JTextField();
		inpNumero2.setColumns(10);
		inpNumero2.setBounds(117, 42, 86, 20);
		contentPane.add(inpNumero2);
		
		lblIteraciones = new JLabel("Iteraciones: ");
		lblIteraciones.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		lblIteraciones.setBounds(40, 73, 111, 14);
		contentPane.add(lblIteraciones);
		
		inpIteraciones = new JTextField();
		inpIteraciones.setColumns(10);
		inpIteraciones.setBounds(117, 70, 86, 20);
		contentPane.add(inpIteraciones);
		
		btnGenerar = new JButton("Generar Serie");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String varNum1S = inpNumero1.getText();
				String varNum2S = inpNumero2.getText();
				String varIteracionesS = inpIteraciones.getText();
				String cadena = "";
				
				int varNum1 = Integer.parseInt(varNum1S);
				int varNum2 = Integer.parseInt(varNum2S);
				int varIteraciones = Integer.parseInt(varIteracionesS);
				int suma = 0;
				int contador = 0;
				cadena = " " + varNum1;
				cadena = cadena + " " + varNum2;
				while(contador <= varIteraciones)
		        {
		            suma = varNum1 + varNum2;
		            cadena = cadena + " " + suma;
		            contador++;
		            varNum1 = varNum2;
		            varNum2 = suma;
		        }
				varSerie.setText(cadena);
				
			}
		});
		btnGenerar.setBounds(0, 98, 111, 23);
		contentPane.add(btnGenerar);
		
		varSerie = new JTextArea();
		varSerie.setBounds(213, 9, 199, 38);
		contentPane.add(varSerie);
	}
}
