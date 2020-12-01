package Cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import PaqueteFarmacia.IncFarmacia;
import Productos.FacturaVenta;

import javax.swing.JScrollPane;
import java.awt.SystemColor;

public class Cliente extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel Label1,Label2,Label3,Label4,Label5,Label6,Label7;
	private JButton Button1,Button2,Button3,Button4,Button5,Button6;
	private JTextField textField1,textField2,textField3,textField4,textField5,textField6;
	private JPanel panel, panel_1,panel_3;
	private DefaultTableModel model;  
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(850,530 );
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
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
		Button1.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 75, 787, 117);
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
		
		Label3 = new JLabel("Nombre:");
		Label3.setBounds(10, 30, 51, 13);
		panel_2.add(Label3);
		
		textField2 = new JTextField();
		textField2.setBounds(71, 26, 217, 22);
		panel_2.add(textField2);
		textField2.setColumns(10);
		
		Label4 = new JLabel("Apellido:");
		Label4.setBounds(298, 30, 51, 13);
		panel_2.add(Label4);
		
		textField3 = new JTextField();
		textField3.setBounds(359, 26, 210, 22);
		panel_2.add(textField3);
		textField3.setColumns(10);
		
		Label5 = new JLabel("RNC:");
		Label5.setBounds(594, 30, 45, 13);
		panel_2.add(Label5);
		
		textField4 = new JTextField();
		textField4.setBounds(633, 27, 154, 21);
		panel_2.add(textField4);
		textField4.setColumns(10);
		
		Label6 = new JLabel("Correo: ");
		Label6.setBounds(298, 66, 51, 13);
		panel_2.add(Label6);
		
		textField5 = new JTextField();
		textField5.setBounds(359, 62, 429, 22);
		panel_2.add(textField5);
		textField5.setColumns(10);
		
		Label7 = new JLabel("Telefono:");
		Label7.setBounds(10, 65, 61, 16);
		panel_2.add(Label7);
		
		textField6 = new JTextField();
		textField6.setBounds(71, 62, 217, 22);
		panel_2.add(textField6);
		textField6.setColumns(10);
		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.textHighlight);
		panel_3.setBounds(10, 398, 814, 78);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		Button2 = new JButton("Guardar");
		Button2.setBounds(713, 10, 91, 58);
		panel_3.add(Button2);
		Button2.addActionListener(this);
		
		Button3 = new JButton("Actualizar");
		Button3.setBounds(612, 10, 91, 58);
		panel_3.add(Button3);
		Button3.addActionListener(this);
		
		Button4 = new JButton("Borrar");
		Button4.setBounds(511, 10, 91, 58);
		panel_3.add(Button4);
		Button4.addActionListener(this);
		
		Button5 = new JButton("Regresar");
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IncFarmacia vents = new IncFarmacia();
				vents.setVisible(true);
				
				
			}
		});
		Button5.setBounds(10, 10, 91, 58);
		panel_3.add(Button5);
		
		Button6 = new JButton("Cancelar");
		Button6.setBounds(393, 10, 108, 58);
		panel_3.add(Button6);
		Button6.addActionListener(this);
		
		ActualizarClientes();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Buscar clientes 
		if(e.getSource()==Button1) {
			BuscarCliente();
		}
		
		//guardar cliente
		if(e.getSource()==Button2) {
			GuardarClientes();
		}
	    
	    //actualizar datos        	
		if(e.getSource()==Button3) {
			ActualizarClientes();
		}
		
		
		//Borrar datos        	
				if(e.getSource()==Button4) {
					BorrarDatos();
					ActualizarClientes();
					
				}
		
		
		
		//cancelar datos
		if(e.getSource()==Button6) {
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
			textField5.setText("");
			textField6.setText("");
		}
				
		}
	//metodos 
	
	//guardar clientes
	public void GuardarClientes() {
		try { 
			//var
			String n,a,c,t;
			int r;
			n=textField2.getText();
			a=textField3.getText();
			r=Integer.parseInt(textField4.getText());
			c=textField5.getText();
			t=textField6.getText();
			
			//sql
			Class.forName("com.mysql.jdbc.Driver");
			Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
			Statement stm=(Statement) Conexion.createStatement();
			int resultset=stm.executeUpdate("insert into clientes(Nombre,Apellidos,RNC,Correo,Telefono) values ('"+n+"','"+a+"','"+r+"','"+c+"','"+t+"')");
			if(resultset>0) {
			    	JOptionPane.showMessageDialog(null, "Cliente guardado con exito");
			 }
			Conexion.close();
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
			textField5.setText("");
			textField6.setText("");
			
		}catch(ClassNotFoundException q) {
        	 q.printStackTrace();
        	 } catch(SQLException i) {
            		System.err.println("Error al listar los datos."+i.getMessage());
        	 }
	}
	//metodo actualizar 
	public void ActualizarClientes() {
		try {
		    model =new DefaultTableModel();
			table.setModel(model);
			model.addColumn("NOMBRE");
			model.addColumn("APELLIDOS");
			model.addColumn("RNC");
			model.addColumn("CORREO");
			model.addColumn("TELEFONO");
			Class.forName("com.mysql.jdbc.Driver");
			Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
			Statement stm=(Statement) Conexion.createStatement();
			ResultSet result =stm.executeQuery("select Nombre,Apellidos,RNC,Correo,Telefono from clientes ");
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
	public void BuscarCliente() {
		try {
			//var
			String Nom=textField1.getText();
			String [] data= new String [5]; 
			model =new DefaultTableModel();
			table.setModel(model);
			model.addColumn("NOMBRE");
			model.addColumn("APELLIDOS");
			model.addColumn("RNC");
			model.addColumn("CORREO");
			model.addColumn("TELEFONO");
			
			//sql
			Class.forName("com.mysql.jdbc.Driver");
			Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
			Statement stm=(Statement) Conexion.createStatement();
			ResultSet result =stm.executeQuery("select Nombre,Apellidos,RNC,Correo,Telefono from clientes where Nombre='"+Nom+"'");
			 while(result.next()){
				 data[0]=result.getString(1);
	             data[1]=result.getString(2);
	             data[2]=result.getString(3);
	             data[3]=result.getString(4);
	             data[4]=result.getString(5);
	             model.addRow(data);
	         }
			Conexion.close();
			textField1.setText("");
	         
		 }catch(ClassNotFoundException q) {
	        	 q.printStackTrace();
	        	 } catch(SQLException i) {
	            		System.err.println("Error al listar los datos."+i.getMessage());
	            	}
	}
	
	 public void BorrarDatos() {
	    	
	    	try {
	    		 int row=table.getSelectedRow();
	 			 String Nom=table.getValueAt(row,0).toString();
				 Class.forName("com.mysql.jdbc.Driver");
				 Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
				 Statement stm=(Statement) Conexion.createStatement();
				 int resultset=stm.executeUpdate("delete from clientes where Nombre='"+Nom+"'");
				 if(resultset>0) {
				    	JOptionPane.showMessageDialog(null, " Borrado con exito");
				 }
				
				 Conexion.close();
				 
		         
			 }catch(ClassNotFoundException q) {
		        	 q.printStackTrace();
		        	 } catch(SQLException i) {
		            		System.err.println("Error al listar los datos."+i.getMessage());
		            	}
	
		
		
	}
}


