package Productos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FacturaVenta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private DefaultTableModel model ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacturaVenta frame = new FacturaVenta();
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
	public FacturaVenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(650, 450);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 646, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Facturas de ventas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 5, 626, 36);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Buscar Factura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 61, 615, 265);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 23, 61, 13);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(81, 19, 421, 25);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarClientes();
			}
		});
		btnNewButton.setBounds(512, 18, 93, 26);
		panel_1.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 54, 595, 187);
		panel_1.add(scrollPane);
		
		table = new JTable();
		model =new DefaultTableModel();
		table.setModel(model);
		model.addColumn("CLIENTE");
		model.addColumn("RNC");
		model.addColumn("PRODUCTO");
		model.addColumn("PRECIO");
		model.addColumn("CANTIDAD");
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setBounds(10, 336, 615, 65);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.setBounds(504, 10, 101, 44);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Regresar");
		btnNewButton_3.setBounds(10, 10, 100, 44);
		panel_2.add(btnNewButton_3);
		ActualizarFacturas();
	}
	
	//metodos 
	
	//actualizar datos
	public void ActualizarFacturas() {
		try {
		    model =new DefaultTableModel();
			table.setModel(model);
			model.addColumn("CLIENTE");
			model.addColumn("RNC");
			model.addColumn("PRODUCTO");
			model.addColumn("PRECIO");
			model.addColumn("CANTIDAD");
			Class.forName("com.mysql.jdbc.Driver");
			Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
			Statement stm=(Statement) Conexion.createStatement();
			ResultSet result =stm.executeQuery("select Cliente,RNC,Producto,Precio,Cantidad from generar_ventas ");
            String [] data= new String [5]; 
			while (result.next()) {
            	data[0]=result.getString(1);
            	data[1]=result.getString(2);
            	data[2]=result.getString(3);
            	data[3]=result.getString(4);
            	data[4]=result.getString(5);
            	model.addRow(data);
            }
			
			Conexion.close();
            }catch(ClassNotFoundException q) {
            	
            	q.printStackTrace();
            	} catch(SQLException i) {
            		System.err.println("Error al listar los datos."+i.getMessage());
            	}
	}
	//BuscarCLientes
	public void BuscarClientes() {
		try {
		    model =new DefaultTableModel();
			table.setModel(model);
			model.addColumn("CLIENTE");
			model.addColumn("RNC");
			model.addColumn("PRODUCTO");
			model.addColumn("PRECIO");
			model.addColumn("CANTIDAD");
			String Buscar= (textField.getText());
			Class.forName("com.mysql.jdbc.Driver");
			Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
			Statement stm=(Statement) Conexion.createStatement();
			ResultSet result=stm.executeQuery("select Cliente,RNC,Producto,Precio,Cantidad from generar_ventas where Cliente='"+Buscar+"' ");
			String [] data= new String [5]; 
			while (result.next()) {
            	data[0]=result.getString(1);
            	data[1]=result.getString(2);
            	data[2]=result.getString(3);
            	data[3]=result.getString(4);
            	data[4]=result.getString(5);
            	model.addRow(data);
            }
			Conexion.close();
		}catch(ClassNotFoundException q) {
        	
        	q.printStackTrace();
        	} catch(SQLException i) {
        		System.err.println("Error al listar los datos."+i.getMessage());
        	}
	}
	
	
}
