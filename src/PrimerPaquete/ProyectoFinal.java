package PrimerPaquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import PaqueteFarmacia.IncFarmacia;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;

public class ProyectoFinal extends JFrame{

	private JFrame frmLogin;
	JTextField usser;
	JButton Button1,Cerrar;
	JLabel Label1,Label2;
	private JPasswordField jpass;

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
		frmLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		frmLogin.setResizable(false);
		frmLogin.setLocationRelativeTo(null);
		
		JButton INICIAR= new JButton("INICIAR");
		INICIAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				char[] array = jpass.getPassword();
				String Contraseña = new String(array);

				if (usser.getText().equals("admin") && Contraseña.equals("1234")) {
					dispose();
					
					JOptionPane.showMessageDialog(null, "USUARIO ADMINISTRADOR INICIADO");
				    JOptionPane.showMessageDialog(null, "Bienvenido al sistema");

					IncFarmacia farm = new IncFarmacia();
					farm.setVisible(true);
							
					
				}else {
					JOptionPane.showMessageDialog(null, "Usser or Password Incorrect","ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
				
				

			}

			
				
			
		});
	    INICIAR.setBackground(Color.BLACK);
		INICIAR.setForeground(Color.RED);
		INICIAR.setFont(new Font("Verdana", Font.BOLD, 14));
		INICIAR.setBounds(416, 113, 124, 34);
		frmLogin.getContentPane().add(INICIAR);
		
		Cerrar = new JButton("X");
		Cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		Cerrar.setBackground(Color.WHITE);
		Cerrar.setForeground(Color.RED);
		Cerrar.setFont(new Font("Verdana", Font.BOLD, 18));
		Cerrar.setBounds(493, 0, 57, 37);
		frmLogin.getContentPane().add(Cerrar);
		
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
		
		usser = new JTextField();
		usser.setBounds(185, 55, 150, 23);
		frmLogin.getContentPane().add(usser);
		usser.setColumns(10);
		
		jpass = new JPasswordField();
		jpass.setBounds(185, 92, 150, 24);
		frmLogin.getContentPane().add(jpass);
		
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
