package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal frame = new PantallaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Conversor");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\gc\\Documents\\Ezequiel\\portafolio\\portafolio\\imagenes\\alura.png"));
		setBounds(100, 100, 500, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTemperaturas = new JButton("Temperaturas");
		btnTemperaturas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PantallaTemperatura pantallaTemperatura = new PantallaTemperatura();
				pantallaTemperatura.setVisible(true);
				dispose();
			}
		});
		btnTemperaturas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnTemperaturas.setBorderPainted(false);
		btnTemperaturas.setBounds(274, 156, 200, 23);
		contentPane.add(btnTemperaturas);
		
		JButton btnMonedas = new JButton("Monedas");
		btnMonedas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PantallaMonedas pantallaMonedas = new PantallaMonedas();
				pantallaMonedas.setVisible(true);
				dispose();
				//System.out.println("Monedas");
			}
		});
		btnMonedas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnMonedas.setBorderPainted(false);
		btnMonedas.setBounds(10, 153, 200, 23);
		contentPane.add(btnMonedas);
		
		JLabel fondoTemperatura = new JLabel("New label");
		fondoTemperatura.setIcon(new ImageIcon("C:\\Users\\gc\\eclipse-workspace\\ConversorDeMoneda\\src\\images\\fondoTermometro1.jpg"));
		fondoTemperatura.setBounds(274, 99, 200, 130);
		contentPane.add(fondoTemperatura);
		
		JLabel fondoMoneda = new JLabel("New label");
		fondoMoneda.setIcon(new ImageIcon("C:\\Users\\gc\\eclipse-workspace\\ConversorDeMoneda\\src\\images\\fondoDinero1.jpg"));
		fondoMoneda.setBounds(10, 99, 200, 130);
		contentPane.add(fondoMoneda);
		
		JLabel subtitulo = new JLabel("Seleccione una opcion");
		subtitulo.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		subtitulo.setHorizontalAlignment(SwingConstants.CENTER);
		subtitulo.setForeground(new Color(0, 0, 0));
		subtitulo.setBounds(10, 58, 464, 30);
		contentPane.add(subtitulo);
		
		JLabel titulo = new JLabel("Bienvenido al Conversor");
		titulo.setForeground(new Color(0, 0, 0));
		titulo.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(10, 11, 464, 30);
		contentPane.add(titulo);
		
		JLabel fondo = new JLabel("");
		fondo.setIconTextGap(1);
		fondo.setIcon(new ImageIcon("C:\\Users\\gc\\eclipse-workspace\\ConversorDeMoneda\\src\\images\\fondoApp1.jpg"));
		fondo.setBounds(0, 0, 484, 289);
		contentPane.add(fondo);
	}
}
