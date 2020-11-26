package Productos;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GenerarVentas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarVentas frame = new GenerarVentas();
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
	public GenerarVentas() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(917, 876);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GENERAR VENTAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(263, -14, 391, 91);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 197, 890, 159);
		contentPane.add(scrollPane);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 108, 59, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(204, 108, 696, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar Productos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(79, 95, 115, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(104, 152, 253, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(389, 149, 91, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("BUSCAR");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(21, 159, 80, 17);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 418, 74, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("CLIENTES");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(104, 406, 115, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(199, 418, 701, 2);
		contentPane.add(separator_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CLIENTES"}));
		comboBox.setBounds(10, 459, 347, 37);
		contentPane.add(comboBox);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNuevo.setBounds(563, 459, 107, 37);
		contentPane.add(btnNuevo);
		
		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAgregar.setBounds(417, 459, 115, 37);
		contentPane.add(btnAgregar);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(10, 570, 74, 2);
		contentPane.add(separator_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("VENTAS");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(104, 558, 115, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(204, 570, 696, 2);
		contentPane.add(separator_1_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(21, 603, 718, 150);
		contentPane.add(scrollPane_1);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(783, 799, 115, 37);
		contentPane.add(btnGuardar);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBorrar.setBounds(643, 799, 115, 37);
		contentPane.add(btnBorrar);
		
		JButton btnRegresar = new JButton("REGRESAR");
		btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegresar.setBounds(21, 799, 115, 37);
		contentPane.add(btnRegresar);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("TOTAL");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(796, 616, 115, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(783, 641, 86, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAgregar_1 = new JButton("AGREGAR");
		btnAgregar_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAgregar_1.setBounds(509, 149, 115, 37);
		contentPane.add(btnAgregar_1);
	}
}
