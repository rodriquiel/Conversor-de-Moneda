package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ConversorTemperatura.FunctionTemperaturas;
import utlilidades.ValidarNumero;

public class PantallaTemperatura extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaTemperatura frame = new PantallaTemperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public PantallaTemperatura() {
		ValidarNumero validador = new ValidarNumero();
		FunctionTemperaturas functionTemperaturas = new FunctionTemperaturas();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Conversor de Temperatura");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setForeground(Color.BLACK);
		titulo.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
		titulo.setBounds(10, 0, 464, 30);
		contentPane.add(titulo);
		
		JComboBox barraSeleccion = new JComboBox();
		barraSeleccion.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Celsius a Kelvin",
				"Celsius a Fahrenheit",
				"Kelvin a Celsius",
				"Fahrenheit a Celsius",
		}));
		barraSeleccion.setBounds(113, 55, 260, 30);
		barraSeleccion.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		contentPane.add(barraSeleccion);
		
		JTextField entradaDatos = new JTextField();
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
	                 functionTemperaturas.convertirTemperatura(seleccion, input);
	                 dispose();
	                 //System.out.println("Seleccion: " + seleccion + " input: " + input);
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
