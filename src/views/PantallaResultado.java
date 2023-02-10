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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class PantallaResultado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String resultado = "AAAAA";
					PantallaResultado frame = new PantallaResultado(resultado);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public PantallaResultado(String resultado) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Conversor");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setForeground(Color.BLACK);
		titulo.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
		titulo.setBounds(10, 0, 464, 30);
		contentPane.add(titulo);
		
		JLabel subtituloResultado = new JLabel("Resultado");
		subtituloResultado.setHorizontalAlignment(SwingConstants.CENTER);
		subtituloResultado.setForeground(Color.BLACK);
		subtituloResultado.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		subtituloResultado.setBounds(10, 67, 464, 30);
		contentPane.add(subtituloResultado);
		
		JButton btnCerrar = new JButton("Salir");
		btnCerrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBorderPainted(false);
		btnCerrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnCerrar.setBounds(355, 260, 120, 24);
		contentPane.add(btnCerrar);
		
		JLabel salidaResultado = new JLabel(resultado);
		salidaResultado.setHorizontalAlignment(SwingConstants.CENTER);
		salidaResultado.setForeground(Color.BLACK);
		salidaResultado.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		salidaResultado.setBounds(10, 124, 464, 30);
		contentPane.add(salidaResultado);
		
		JLabel tituloContinuar = new JLabel("¿Desea continuar?");
		tituloContinuar.setHorizontalAlignment(SwingConstants.CENTER);
		tituloContinuar.setForeground(Color.BLACK);
		tituloContinuar.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
		tituloContinuar.setBounds(10, 219, 464, 30);
		contentPane.add(tituloContinuar);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
				pantallaPrincipal.setVisible(true);
				dispose();
			}
		});
		btnContinuar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnContinuar.setBorderPainted(false);
		btnContinuar.setBounds(10, 260, 120, 24);
		contentPane.add(btnContinuar);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon("C:\\Users\\gc\\eclipse-workspace\\ConversorDeMoneda\\src\\images\\fondoApp1.jpg"));
		fondo.setBounds(0, 0, 484, 294);
		contentPane.add(fondo);
	}
}
