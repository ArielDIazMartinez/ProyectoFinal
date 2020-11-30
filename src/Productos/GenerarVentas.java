package Productos;


import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;


public class GenerarVentas extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel Label1,Label2,Label3;
	private JTextField textField1,textField2,textField3;
	private JTable table;
	public JTable table_1;
	private JButton Button1,Button2,Button4,Button5,Button6,Button7,Button8;
	private DefaultTableModel model,model2;
	private JComboBox comboBox ;
	String [] data= new String [5];
	float total=0;
	private JPanel panel_5;
	
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
		setSize(917, 825);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 913, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Generar ventas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 5, 893, 58);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Buscar Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 83, 878, 254);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Label1 = new JLabel("Buscar:");
		Label1.setBounds(10, 22, 80, 17);
		panel_1.add(Label1);
		Label1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField1 = new JTextField();
		textField1.setBounds(72, 20, 337, 26);
		panel_1.add(textField1);
		textField1.setColumns(10);
		
		Button1 = new JButton("BUSCAR");
		Button1.setBounds(419, 12, 105, 37);
		panel_1.add(Button1);
	    Button1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    Button1.addActionListener(this);
		
		textField2 = new JTextField();
		textField2.setBounds(626, 20, 242, 26);
		panel_1.add(textField2);
		textField2.setColumns(10);
		
		Label2 = new JLabel("Cantidad:");
		Label2.setFont(new Font("Tahoma", Font.BOLD, 14));
		Label2.setBounds(534, 24, 82, 13);
		panel_1.add(Label2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 73, 858, 150);
		panel_1.add(scrollPane);
		
		table = new JTable();
		model =new DefaultTableModel();
		table.setModel(model);
		model.addColumn("NOMBRE");
		model.addColumn("PRECIO");
		model.addColumn("CANTIDAD");
		model.addColumn("FEC. VEN.");
		model.addColumn("TIPO");
		model.addColumn("DESCRIPCION");
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Buscar cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 354, 558, 91);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(10, 25, 347, 37);
		panel_2.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CLIENTES"}));
		
		Button4 = new JButton("NUEVO");
		Button4.setBounds(397, 25, 107, 37);
		panel_2.add(Button4);
		Button4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Ventas:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 462, 878, 213);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(21, 24, 711, 164);
		panel_3.add(scrollPane_1);
		
		table_1 = new JTable();
		model2 =new DefaultTableModel();
		table_1.setModel(model2);
		model2.addColumn("CLIENTE");
		model2.addColumn("RNC");
		model2.addColumn("PRODUCTO");
		model2.addColumn("PRECIO");
		model2.addColumn("CANTIDAD");
		scrollPane_1.setViewportView(table_1);
		
	    Label3 = new JLabel("TOTAL");
		Label3.setBounds(758, 24, 115, 14);
		panel_3.add(Label3);
		Label3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField3 = new JTextField();
		textField3.setBounds(742, 48, 96, 34);
		panel_3.add(textField3);
		textField3.setEditable(false);
		textField3.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.textHighlight);
		panel_4.setBounds(10, 697, 878, 73);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		Button5 = new JButton("GUARDAR");
		Button5.setBounds(740, 10, 128, 53);
		panel_4.add(Button5);
		Button5.setFont(new Font("Tahoma", Font.BOLD, 14));
		Button5.addActionListener(this);
		
		Button6 = new JButton("BORRAR");
		Button6.setBounds(602, 10, 128, 53);
		panel_4.add(Button6);
		Button6.setFont(new Font("Tahoma", Font.BOLD, 14));
		Button6.addActionListener(this);
		
		Button7 = new JButton("REGRESAR");
		Button7.setBounds(24, 12, 139, 49);
		panel_4.add(Button7);
		Button7.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		Button8 = new JButton("Actualizar");
		Button8.setFont(new Font("Tahoma", Font.BOLD, 14));
		Button8.setBounds(459, 10, 133, 53);
		panel_4.add(Button8);
		Button8.addActionListener(this);
		
		panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Agregar producto y cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(593, 354, 294, 91);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		Button2= new JButton("AGREGAR");
		Button2.setBounds(82, 33, 127, 37);
		panel_5.add(Button2);
		Button2.setFont(new Font("Tahoma", Font.BOLD, 14));
		Button2.addActionListener(this);
		
		
		Actualizar();
		getClientes();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//actualizar
		if(e.getSource()==Button8) {
			Actualizar();
			}
		//buscar
		if(e.getSource()==Button1) {
			getItems();
		}
		//agregar
		if(e.getSource()==Button2) {
			PasarDatos();
			data[0]=("");
        	data[1]=("");
			data[2]=("");
        	data[3]=("");
        	data[4]=("");
        	textField2.setText("");
        	textField3.setText(Float.toString(total));
		}
		//subir factura a la base de datos
		if(e.getSource()==Button5) {
			SubirFacturas();
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//metodos
	
	//actualizar
	public void Actualizar() {
		try {
		    model =new DefaultTableModel();
			table.setModel(model);
			model.addColumn("NOMBRE");
			model.addColumn("PRECIO");
			model.addColumn("CANTIDAD");
			model.addColumn("FEC. VEN.");
			model.addColumn("TIPO");
			model.addColumn("DESCRIPCION");
			Class.forName("com.mysql.jdbc.Driver");
			Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
			Statement stm=(Statement) Conexion.createStatement();
			ResultSet result =stm.executeQuery("select Nombre,Precio,Cantidad,Fecha_vencimiento,Tipo,Descripcion from inventario ");
            String [] data= new String [6]; 
			while (result.next()) {
            	data[0]=result.getString(1);
            	data[1]=result.getString(2);
            	data[2]=result.getString(3);
            	data[3]=result.getString(4);
            	data[4]=result.getString(5);
            	data[5]=result.getString(6);
            	model.addRow(data);
            }
			
			Conexion.close();
            }catch(ClassNotFoundException q) {
            	
            	q.printStackTrace();
            	} catch(SQLException i) {
            		System.err.println("Error al listar los datos."+i.getMessage());
            	}
		
		}
	    //getClientes
	    public void getClientes() {
	    	try {
				 //var
				 String Nom;
				 Class.forName("com.mysql.jdbc.Driver");
				 Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
				 Statement stm=(Statement) Conexion.createStatement();
				 ResultSet resultset2 =stm.executeQuery("select Nombre from clientes");
				 while(resultset2.next()){
		             Nom=resultset2.getString("Nombre"); 
		             comboBox.addItem(Nom);
		         }
				 Conexion.close();
				 
			 }catch(ClassNotFoundException q) {
		        	 q.printStackTrace();
		        	 } catch(SQLException i) {
		            		System.err.println("Error al listar los datos."+i.getMessage());
		            	}
	    }
	    //buscar productos
	    public void getItems() {
	    	try {
	    		model =new DefaultTableModel();
	 			table.setModel(model);
	 			model.addColumn("NOMBRE");
	 			model.addColumn("PRECIO");
	 			model.addColumn("CANTIDAD");
	 			model.addColumn("FEC. VEN.");
	 			model.addColumn("TIPO");
	 			model.addColumn("DESCRIPCION");
			    String Buscar= (textField1.getText());
				Class.forName("com.mysql.jdbc.Driver");
				Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
				Statement stm=(Statement) Conexion.createStatement();
				ResultSet result=stm.executeQuery("select Nombre,Precio,Cantidad,Fecha_vencimiento,Tipo,Descripcion from inventario where Nombre='"+Buscar+"'");
				String [] data= new String [6]; 
				while (result.next()) {
	            	data[0]=result.getString(1);
	            	data[1]=result.getString(2);
	            	data[2]=result.getString(3);
	            	data[3]=result.getString(4);
	            	data[4]=result.getString(5);
	            	data[5]=result.getString(6);
	            	model.addRow(data);
	            }
				
	            Conexion.close();
	            }catch(ClassNotFoundException q) {
	            	
	            	q.printStackTrace();
	            	} catch(SQLException i) {
	            		System.err.println("Error al listar los datos."+i.getMessage());
	            	}
	    }
	    //PasarDatos
	    public void PasarDatos() {
	    	try {
			String cliente=comboBox.getSelectedItem().toString();
			Class.forName("com.mysql.jdbc.Driver");
			Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
			Statement stm=(Statement) Conexion.createStatement();
			ResultSet result =stm.executeQuery("select Nombre,RNC from clientes where Nombre='"+cliente+"' ");
			while (result.next()) {
            	data[0]=result.getString(1);
            	data[1]=result.getString(2);
            	int row=table.getSelectedRow();
    			String Nom=table.getValueAt(row,0).toString();
    			String Precio=table.getValueAt(row,1).toString();
    			data[2]=Nom;
            	data[3]=Precio;
            	data[4]=textField2.getText();
			    model2.addRow(data);
			}
			Conexion.close();
            }catch(ClassNotFoundException q) {
            	
            	q.printStackTrace();
            	} catch(SQLException i) {
            		System.err.println("Error al listar los datos."+i.getMessage());
            	}
	    	
	    	int cont=table.getSelectedRow();
	    	total+=Float.parseFloat(table_1.getValueAt(cont,3).toString());
	    	
	    }
	    
	    //subir facturas a la base de datos
	    public void SubirFacturas() {
	    	int cont= table_1.getRowCount();
	    	for(int row=0; row<cont; row++) {
	    		 try {
	    	String Cliente=table_1.getValueAt(row,0).toString();
			int RNC=Integer.parseInt(table_1.getValueAt(row,1).toString());
			String Producto=table_1.getValueAt(row,2).toString();
			float Precio=Float.parseFloat(table_1.getValueAt(row,3).toString());
			int Cantidad= Integer.parseInt(table_1.getValueAt(row,4).toString());
	    	//sql
			Class.forName("com.mysql.jdbc.Driver");
			 Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
			 Statement stm=(Statement) Conexion.createStatement();
			 int resultset=stm.executeUpdate("insert into generar_ventas(Cliente,RNC,Producto,Precio,Cantidad) values ('"+Cliente+"','"+RNC+"','"+Producto+"','"+Precio+"','"+Cantidad+"')");
			 Conexion.close();
	    		 }catch(ClassNotFoundException q) {
		        	 q.printStackTrace();
		        	 } catch(SQLException i) {
		            		System.err.println("Error al listar los datos."+i.getMessage());
		            	}
	    	}
			 JOptionPane.showMessageDialog(null, "Venta generada con exito");
			 model2 =new DefaultTableModel();
				table_1.setModel(model2);
				model2.addColumn("CLIENTE");
				model2.addColumn("RNC");
				model2.addColumn("PRODUCTO");
				model2.addColumn("PRECIO");
				model2.addColumn("CANTIDAD");
	    }
	    
}
	
	
	

