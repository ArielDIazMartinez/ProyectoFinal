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
	private JTextField textField;
	private JTextField textField_1;

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
		
		JButton btnNewButton = new JButton("INICIAR");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 14));
		btnNewButton.setBounds(416, 113, 124, 34);
		frmLogin.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 14));
		btnNewButton_1.setBounds(493, 0, 57, 37);
		frmLogin.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("USUARIO : ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(54, 54, 103, 23);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CONTRASE\u00D1A :");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(54, 88, 127, 28);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(185, 55, 150, 23);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(185, 91, 150, 24);
		frmLogin.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
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
