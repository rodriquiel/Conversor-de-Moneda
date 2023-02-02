package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio frame = new inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
		
		setTitle("Conversor");
		setResizable(false);
		setLocationRelativeTo(null);
		
	}
	
	private void iniciarComponentes() {
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Bienvenido\r\n");
		titulo.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 42));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(180, 11, 240, 48);
		contentPane.add(titulo);
		
		JLabel subtitulo = new JLabel("Seleccione que desea convertir");
		subtitulo.setHorizontalAlignment(SwingConstants.CENTER);
		subtitulo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 32));
		subtitulo.setBounds(10, 70, 564, 31);
		contentPane.add(subtitulo);
		
		JComboBox listaOpciones = new JComboBox();
		listaOpciones.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		listaOpciones.setModel(new DefaultComboBoxModel(new String[] {"Conversor de moneda", "Conversor de medida", "Conversor de temperatura", "3"}));
		listaOpciones.setToolTipText("Seleccione");
		listaOpciones.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		listaOpciones.setMaximumRowCount(4);
		listaOpciones.setBounds(160, 159, 280, 30);
		contentPane.add(listaOpciones);
		
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		btnNewButton.setBounds(434, 320, 140, 30);
		contentPane.add(btnNewButton);
	}
}
