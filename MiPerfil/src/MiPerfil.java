import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MiPerfil {

	private JFrame frmMiPerfil;
	private JTextField Tnombre;
	private JTextField Tapellido;
	private JTextField Tedad;
	private JTextField Temail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPerfil window = new MiPerfil();
					window.frmMiPerfil.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiPerfil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiPerfil = new JFrame();
		frmMiPerfil.setTitle("Mi Perfil");
		frmMiPerfil.setBounds(100, 100, 436, 440);
		frmMiPerfil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiPerfil.getContentPane().setLayout(null);
		
		JLabel Enombre = new JLabel("Nombre");
		Enombre.setBounds(30, 30, 77, 35);
		frmMiPerfil.getContentPane().add(Enombre);
		
		Tnombre = new JTextField();
		Tnombre.setText("Constantin");
		Tnombre.setName("Constantin");
		Tnombre.setToolTipText("");
		Tnombre.setBounds(30, 66, 135, 20);
		frmMiPerfil.getContentPane().add(Tnombre);
		Tnombre.setColumns(10);
		
		JLabel Lapellido = new JLabel("Apellido");
		Lapellido.setBounds(25, 116, 46, 14);
		frmMiPerfil.getContentPane().add(Lapellido);
		
		Tapellido = new JTextField();
		Tapellido.setText("Bejenaru");
		Tapellido.setBounds(30, 141, 135, 20);
		frmMiPerfil.getContentPane().add(Tapellido);
		Tapellido.setColumns(10);
		
		JLabel Ledad = new JLabel("Edad");
		Ledad.setBounds(25, 203, 46, 14);
		frmMiPerfil.getContentPane().add(Ledad);
		
		Tedad = new JTextField();
		Tedad.setText("36");
		Tedad.setBounds(37, 244, 62, 20);
		frmMiPerfil.getContentPane().add(Tedad);
		Tedad.setColumns(10);
		
		JLabel Lemail = new JLabel("E-mail");
		Lemail.setBounds(30, 291, 46, 14);
		frmMiPerfil.getContentPane().add(Lemail);
		
		Temail = new JTextField();
		Temail.setText("bejenarudragos@gmail.com");
		Temail.setBounds(44, 344, 196, 20);
		frmMiPerfil.getContentPane().add(Temail);
		Temail.setColumns(10);
		
		JButton close = new JButton("Salir");
		close.addActionListener(e -> System.exit(0));
		close.setBounds(288, 343, 89, 23);
		frmMiPerfil.getContentPane().add(close);
	}
}
