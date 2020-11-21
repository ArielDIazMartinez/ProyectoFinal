package Cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Cliente extends JFrame {

	private JPanel contentPane;
	private JLabel Label1;
	private JPanel panel, panel_1;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
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
	public Cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850,600 );
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 846, 52);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label1 = new JLabel("Clientes");
		Label1.setFont(new Font("Tahoma", Font.BOLD, 26));
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setBounds(10, 10, 826, 32);
		panel.add(Label1);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Buscar clientes ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 62, 826, 202);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar:");
		lblNewLabel.setBounds(10, 36, 45, 13);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(65, 28, 637, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(712, 28, 85, 29);
		panel_1.add(btnNewButton);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellidos", "Cedula", "Correo", "Direccion"
			}
		));
		table.setBounds(10, 73, 787, 105);
		panel_1.add(table);
		
		
	
	
	}
}
