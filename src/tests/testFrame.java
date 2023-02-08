package tests;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class testFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testFrame frame = new testFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public testFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\gc\\Documents\\Ezequiel\\portafolio\\portafolio\\imagenes\\alura.png"));
		setTitle("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 313);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Bienvenido al Conversor");
		titulo.setBackground(new Color(0, 204, 102));
		titulo.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(5, 5, 500, 40);
		contentPane.add(titulo);
		
		JComboBox selectorConversor = new JComboBox();
		selectorConversor.setModel(new DefaultComboBoxModel(new String[] {"Conversor de Moneda", "Conversor de Temperatura"}));
		selectorConversor.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		selectorConversor.setMaximumRowCount(2);
		selectorConversor.setBackground(new Color(255, 255, 255));
		selectorConversor.setBounds(105, 94, 300, 30);
		contentPane.add(selectorConversor);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		btnContinuar.setIconTextGap(2);
		btnContinuar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnContinuar.setBounds(199, 209, 100, 25);
		contentPane.add(btnContinuar);
		
		JLabel subtitulo = new JLabel("Seleccione una opcion");
		subtitulo.setHorizontalAlignment(SwingConstants.CENTER);
		subtitulo.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		subtitulo.setBackground(new Color(0, 204, 102));
		subtitulo.setBounds(5, 43, 500, 40);
		contentPane.add(subtitulo);
	}
}
