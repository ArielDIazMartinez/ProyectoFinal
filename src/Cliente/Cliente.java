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
import javax.swing.JScrollPane;

public class Cliente extends JFrame {

	private JPanel contentPane;
	private JLabel Label1,Label2;
	private JPanel panel, panel_1;
	private JTextField textField1;
	private DefaultTableModel model;  
	private JTable table;
	private JButton Button1;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_4;
	private JPanel panel_3;
	private JButton btnNewButton_4;
	
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
		setSize(850,530 );
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
		panel_1.setBounds(10, 62, 814, 202);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Label2 = new JLabel("Buscar:");
		Label2.setBounds(10, 36, 45, 13);
		panel_1.add(Label2);
		
		textField1 = new JTextField();
		textField1.setBounds(65, 28, 637, 29);
		panel_1.add(textField1);
		textField1.setColumns(10);
		
		Button1 = new JButton("Buscar");
		Button1.setBounds(712, 28, 85, 29);
		panel_1.add(Button1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 71, 787, 121);
		panel_1.add(scrollPane);
		
		table = new JTable();
		model =new DefaultTableModel();
		table.setModel(model);
		model.addColumn("NOMBRE");
		model.addColumn("APELLIDOS");
		model.addColumn("RNC");
		model.addColumn("CORREO");
		model.addColumn("TELEFONO");
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Añadir cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 277, 814, 111);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 30, 51, 13);
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(71, 26, 217, 22);
		panel_2.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(298, 30, 51, 13);
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(359, 26, 210, 22);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("RNC:");
		lblNewLabel_2.setBounds(594, 30, 45, 13);
		panel_2.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(633, 27, 154, 21);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Correo: ");
		lblNewLabel_3.setBounds(298, 66, 51, 13);
		panel_2.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(359, 62, 429, 22);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Telefono:");
		lblNewLabel_4.setBounds(10, 65, 61, 16);
		panel_2.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(71, 62, 217, 22);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.PINK);
		panel_3.setBounds(10, 398, 814, 78);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(713, 10, 91, 58);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.setBounds(612, 10, 91, 58);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.setBounds(511, 10, 91, 58);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Regresar");
		btnNewButton_3.setBounds(10, 10, 91, 58);
		panel_3.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Cancelar");
		btnNewButton_4.setBounds(393, 10, 108, 58);
		panel_3.add(btnNewButton_4);
		
		
		
		
	
	
	}
}
