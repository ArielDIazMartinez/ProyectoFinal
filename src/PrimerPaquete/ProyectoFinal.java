package PrimerPaquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

public class ProyectoFinal {

	private JFrame frmLogin;
	JTextField textField1,textField2;
	JButton Button1,Button2;
	JLabel Label1,Label2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoFinal window = new ProyectoFinal();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProyectoFinal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("LOGIN");
		frmLogin.getContentPane().setBackground(Color.BLACK);
		frmLogin.setBounds(100, 100, 566, 219);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		frmLogin.setResizable(false);
		frmLogin.setLocationRelativeTo(null);
		
		JButton Button1= new JButton("INICIAR");
	    Button1.setBackground(Color.BLACK);
		Button1.setForeground(Color.RED);
		Button1.setFont(new Font("Verdana", Font.BOLD, 14));
		Button1.setBounds(416, 113, 124, 34);
		frmLogin.getContentPane().add(Button1);
		
		Button2 = new JButton("X");
		Button2.setBackground(Color.WHITE);
		Button2.setForeground(Color.RED);
		Button2.setFont(new Font("Verdana", Font.BOLD, 14));
		Button2.setBounds(493, 0, 57, 37);
		frmLogin.getContentPane().add(Button2);
		
		Label1 = new JLabel("USUARIO: ");
		Label1.setForeground(Color.RED);
		Label1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		Label1.setBounds(54, 54, 103, 23);
		frmLogin.getContentPane().add(Label1);
		
		Label2 = new JLabel("CONTRASE\u00D1A :");
		Label2.setForeground(Color.RED);
		Label2.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		Label2.setBounds(54, 88, 127, 28);
		frmLogin.getContentPane().add(Label2);
		
		textField1 = new JTextField();
		textField1.setBounds(185, 55, 150, 23);
		frmLogin.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(185, 91, 150, 24);
		frmLogin.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		frmLogin.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton_3 = new JButton("CUENTA ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showInternalMessageDialog(null, "Usuario: Admin  " + "Password: firestorm");
				
			}
		});
		mnNewMenu.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("VERCION");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showInternalMessageDialog(null, "La Vercion Actual es la Vercion     1.0.0");
			}
		});
		mnNewMenu.add(btnNewButton_2);
		
		JMenu mnNewMenu_1 = new JMenu("Soporte");
		menuBar.add(mnNewMenu_1);
		
		JButton btnNewButton_4 = new JButton("Support");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showInternalMessageDialog(null, "Para cualquier consulta sobre esta vercion de Int.Farmacia Por Favor Contacte con el Desarrollador"
						+ "Atraves del Siguiente Correo >   20199079@itla.edu.do ");
			}
		});
		mnNewMenu_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Manual ");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showInternalMessageDialog(null, "Descargue el Manual de Usuario Desde el Siguiente enlace >  https://drive.google.com/drive/u/0/my-drive");
				
			}
		});
		mnNewMenu_1.add(btnNewButton_5);
	}
}
