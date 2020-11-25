package PrimerPaquete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import PaqueteFarmacia.IncFarmacia;
import java.awt.Window.Type;

public class InicioSeccion extends JFrame {
	
	private JPanel contentPane;
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
					InicioSeccion frame = new InicioSeccion();
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
	public InicioSeccion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Desktop\\images.ico"));
		setTitle("LOGIN");
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 566, 219);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		JButton INICIAR= new JButton("INICIAR");
		INICIAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] array = jpass.getPassword();
				String Contraseña = new String(array);

				if (usser.getText().equals("admin") && Contraseña.equals("1234")) {
					
					 
					JOptionPane.showMessageDialog(null, "USUARIO ADMINISTRADOR INICIADO");
				    JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
					dispose();

   
					IncFarmacia farm = new IncFarmacia();
					farm.setVisible(true);
					usser.setText("");
					jpass.setText("");
					
				}else {
					JOptionPane.showMessageDialog(null, "Usser or Password Incorrect","ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
				

			}
				
			
		});
	    INICIAR.setBackground(Color.WHITE);
		INICIAR.setForeground(Color.BLACK);
		INICIAR.setFont(new Font("Verdana", Font.BOLD, 14));
		INICIAR.setBounds(391, 67, 124, 34);
		getContentPane().add(INICIAR);
		
		Cerrar = new JButton("X");
		Cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		Cerrar.setBackground(Color.WHITE);
		Cerrar.setForeground(Color.BLACK);
		Cerrar.setFont(new Font("Verdana", Font.BOLD, 18));
		Cerrar.setBounds(507, 0, 53, 37);
		getContentPane().add(Cerrar);
		
		Label1 = new JLabel("USUARIO: ");
		Label1.setForeground(Color.BLACK);
		Label1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		Label1.setBounds(54, 54, 103, 23);
		getContentPane().add(Label1);
		
		Label2 = new JLabel("CONTRASE\u00D1A :");
		Label2.setForeground(Color.BLACK);
		Label2.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		Label2.setBounds(54, 88, 127, 28);
		getContentPane().add(Label2);
		
		usser = new JTextField();
		usser.setBounds(185, 55, 150, 23);
		getContentPane().add(usser);
		usser.setColumns(10);
		
		jpass = new JPasswordField();
		jpass.setBounds(185, 92, 150, 24);
		getContentPane().add(jpass);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton_3 = new JButton("CUENTA ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showInternalMessageDialog(null, "Usuario: Admin  " + "Password: 1234");
				
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

