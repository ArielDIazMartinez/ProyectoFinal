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
		getContentPane().setBackground(Color.BLACK);
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
	    INICIAR.setBackground(Color.BLACK);
		INICIAR.setForeground(Color.RED);
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
		Cerrar.setForeground(Color.RED);
		Cerrar.setFont(new Font("Verdana", Font.BOLD, 18));
		Cerrar.setBounds(507, 0, 53, 37);
		getContentPane().add(Cerrar);
		
		Label1 = new JLabel("USUARIO: ");
		Label1.setForeground(Color.RED);
		Label1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		Label1.setBounds(54, 54, 103, 23);
		getContentPane().add(Label1);
		
		Label2 = new JLabel("CONTRASE\u00D1A :");
		Label2.setForeground(Color.RED);
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 255));
		panel.setBounds(10, 11, 33, 26);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 255));
		panel_1.setBounds(65, 11, 33, 26);
		getContentPane().add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 51, 255));
		panel_1_1.setBounds(124, 11, 33, 26);
		getContentPane().add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(0, 51, 255));
		panel_1_2.setBounds(188, 11, 33, 26);
		getContentPane().add(panel_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(0, 51, 255));
		panel_1_3.setBounds(257, 11, 33, 26);
		getContentPane().add(panel_1_3);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(new Color(0, 51, 255));
		panel_1_4.setBounds(325, 11, 33, 26);
		getContentPane().add(panel_1_4);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBackground(new Color(0, 51, 255));
		panel_1_5.setBounds(391, 11, 33, 26);
		getContentPane().add(panel_1_5);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setBackground(new Color(0, 51, 255));
		panel_1_6.setBounds(450, 11, 33, 26);
		getContentPane().add(panel_1_6);
		
		JPanel panel_1_7 = new JPanel();
		panel_1_7.setBackground(new Color(0, 51, 255));
		panel_1_7.setBounds(10, 131, 33, 26);
		getContentPane().add(panel_1_7);
		
		JPanel panel_1_8 = new JPanel();
		panel_1_8.setBackground(new Color(0, 51, 255));
		panel_1_8.setBounds(64, 131, 33, 26);
		getContentPane().add(panel_1_8);
		
		JPanel panel_1_9 = new JPanel();
		panel_1_9.setBackground(new Color(0, 51, 255));
		panel_1_9.setBounds(124, 131, 33, 26);
		getContentPane().add(panel_1_9);
		
		JPanel panel_1_10 = new JPanel();
		panel_1_10.setBackground(new Color(0, 51, 255));
		panel_1_10.setBounds(188, 131, 33, 26);
		getContentPane().add(panel_1_10);
		
		JPanel panel_1_11 = new JPanel();
		panel_1_11.setBackground(new Color(0, 51, 255));
		panel_1_11.setBounds(257, 131, 33, 26);
		getContentPane().add(panel_1_11);
		
		JPanel panel_1_12 = new JPanel();
		panel_1_12.setBackground(new Color(0, 51, 255));
		panel_1_12.setBounds(325, 131, 33, 26);
		getContentPane().add(panel_1_12);
		
		JPanel panel_1_13 = new JPanel();
		panel_1_13.setBackground(new Color(0, 51, 255));
		panel_1_13.setBounds(391, 131, 33, 26);
		getContentPane().add(panel_1_13);
		
		JPanel panel_1_14 = new JPanel();
		panel_1_14.setBackground(new Color(0, 51, 255));
		panel_1_14.setBounds(450, 131, 33, 26);
		getContentPane().add(panel_1_14);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
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

