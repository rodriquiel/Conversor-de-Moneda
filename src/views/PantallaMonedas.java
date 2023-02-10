package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import conversorMonedas.FunctionMonedas;
import utlilidades.ValidarNumero;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaMonedas extends JFrame {

	private JPanel contentPane;
	private JTextField entradaDatos;

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaMonedas frame = new PantallaMonedas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public PantallaMonedas() {
		ValidarNumero validador = new ValidarNumero();
		FunctionMonedas functionMonedas = new FunctionMonedas();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Conversor de Moneda");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setForeground(Color.BLACK);
		titulo.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
		titulo.setBounds(10, 0, 464, 30);
		contentPane.add(titulo);
		
		JComboBox barraSeleccion = new JComboBox();
		barraSeleccion.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Peso Argentino a USD",
				"Peso Argentino a Blue USD",
				"Peso Argentino a Euro",
				"Peso Argentino a Libra",
				"Peso Argentino a Yen",
				"USD a Peso Argentino ",
				"Blue USD a Peso Argentino",
				"Euro a Peso Argentino",
				"Libra a Peso Argentino",
				"Yen a Peso Argentino",
		}));
		barraSeleccion.setBounds(113, 55, 260, 30);
		barraSeleccion.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		contentPane.add(barraSeleccion);
		
		entradaDatos = new JTextField();
		entradaDatos.setBounds(113, 186, 260, 30);
		contentPane.add(entradaDatos);
		entradaDatos.setColumns(10);
		
		JLabel subtituloValor = new JLabel("Ingrese el valor");
		subtituloValor.setHorizontalAlignment(SwingConstants.CENTER);
		subtituloValor.setForeground(Color.BLACK);
		subtituloValor.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		subtituloValor.setBounds(10, 155, 464, 30);
		contentPane.add(subtituloValor);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String seleccion = (barraSeleccion.getSelectedItem()).toString();
				String inputS = entradaDatos.getText();
				double input;
				if(validador.validar(inputS) == true) {
	                 input = Double.parseDouble(inputS);
	                 functionMonedas.convertirMonedas(seleccion, input);
	                 //System.out.println("Seleccion: " + seleccion + " input: " + input);
	                 dispose();
	            }
				
			}
		});
		btnConvertir.setBorderPainted(false);
		btnConvertir.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnConvertir.setBounds(355, 260, 120, 24);
		contentPane.add(btnConvertir);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon("C:\\Users\\gc\\eclipse-workspace\\ConversorDeMoneda\\src\\images\\fondoApp1.jpg"));
		fondo.setBounds(0, 0, 484, 294);
		contentPane.add(fondo);
	}
}
