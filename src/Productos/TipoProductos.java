package Productos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import PaqueteFarmacia.IncFarmacia;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class TipoProductos extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel, panel_1;
	private JLabel Label1,Label3,Label4,Label5;
	private JTextField textField1,textField3,textField4;
	private JButton Button1,Button2,Button3,Button4,Button5,btnBorrar;
	private JTable table;
	private DefaultTableModel model;
	private JPanel panel_2;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TipoProductos frame = new TipoProductos();
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
	public TipoProductos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Desktop\\images.ico"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(650, 550);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label3 = new JLabel("Nombre:");
		Label3.setFont(new Font("Tahoma", Font.BOLD, 13));
		Label3.setBounds(27, 339, 74, 20);
		contentPane.add(Label3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(10, 429, 611, 70);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Button2 = new JButton("Regresar");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);}
		});
		Button2.setBounds(10, 11, 108, 49);
		panel_1.add(Button2);
		Button2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		Button3 = new JButton("Guardar");
		Button3.setBounds(489, 11, 108, 49);
		panel_1.add(Button3);
		Button3.setFont(new Font("Tahoma", Font.BOLD, 14));
		Button3.addActionListener(this);
		
		Button4 = new JButton("Cancelar");
		Button4.setFont(new Font("Tahoma", Font.BOLD, 14));
		Button4.setBounds(243, 11, 108, 49);
		panel_1.add(Button4);
		
		Button5 = new JButton("Actulizar");
		Button5.setFont(new Font("Tahoma", Font.BOLD, 14));
		Button5.setBounds(361, 11, 118, 49);
		Button5.addActionListener(this);
		panel_1.add(Button5);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBorrar.setBounds(125, 11, 108, 49);
		panel_1.add(btnBorrar);
		btnBorrar.addActionListener(this);
		
		
		
		panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 649, 49);
		contentPane.add(panel);
		
		Label5 = new JLabel("Tipos de medicamentos");
		Label5.setFont(new Font("Tahoma", Font.BOLD, 26));
		Label5.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Label5);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Buscar Tipos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 59, 611, 251);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		Label1 = new JLabel("Buscar");
		Label1.setBounds(10, 25, 50, 17);
		panel_2.add(Label1);
		Label1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField1 = new JTextField();
		textField1.setBounds(69, 26, 429, 20);
		panel_2.add(textField1);
		textField1.setColumns(10);
		
		Button1 = new JButton("Buscar");
		Button1.setBounds(508, 22, 93, 25);
		panel_2.add(Button1);
		Button1.setFont(new Font("Tahoma", Font.BOLD, 13));
		Button1.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 68, 591, 173);
		panel_2.add(scrollPane);
		
		table = new JTable();
		model =new DefaultTableModel();
		table.setModel(model);
		model.addColumn("NOMBRE");
		model.addColumn("DESCRIPCION");
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "A�adir productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 320, 611, 99);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		Label4 = new JLabel("Descripcion:");
		Label4.setBounds(10, 58, 79, 16);
		panel_3.add(Label4);
		Label4.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField4 = new JTextField();
		textField4.setBounds(99, 58, 500, 19);
		panel_3.add(textField4);
		textField4.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(99, 21, 500, 20);
		panel_3.add(textField3);
		textField3.setColumns(10);
		ActulizarTipos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//ingreso de datos
		if(e.getSource()==Button3) {
			 try {
				 //var
				 Productos p= new Productos();
				 String Nombre=(textField3.getText()); 			
				 String Descrip=(textField4.getText());
				 String Nom;
				 //sql
				 Class.forName("com.mysql.jdbc.Driver");
				 Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
				 Statement stm=(Statement) Conexion.createStatement();
				 int resultset=stm.executeUpdate("insert into tipos_medicamentos(Nombre,Descripcion) values ('"+Nombre+"','"+Descrip+"')");
				 if(resultset>0) {
				    	JOptionPane.showMessageDialog(null, "Tipo de medicamento guardado con exito");
				 }
				 ResultSet resultset2 =stm.executeQuery("select Nombre,Descripcion from tipos_medicamentos");
				 Conexion.close();
				 textField3.setText("");
				 textField4.setText("");
		         
			 }catch(ClassNotFoundException q) {
		        	 q.printStackTrace();
		        	 } catch(SQLException i) {
		            		System.err.println("Error al listar los datos."+i.getMessage());
		            	}
		}
	//buscar tipos
	if(e.getSource()==Button1) {
		try {
			 //var
			 String Nombre=(textField1.getText()); 			
			 model =new DefaultTableModel();
			 table.setModel(model);
			 model.addColumn("NOMBRE");
			 model.addColumn("DESCRIPCION");
			 String [] data= new String [2]; 
			 //sql
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
			 Statement stm=(Statement) Conexion.createStatement();
			 ResultSet result =stm.executeQuery("select Nombre,Descripcion from tipos_medicamentos where Nombre='"+Nombre+"'");
			 while(result.next()){
				 data[0]=result.getString(1);
	             data[1]=result.getString(2);
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
	//actulizar lista
	if(e.getSource()==Button5) {
		ActulizarTipos();
	}
	
	
	
	
	//Borrar de la tabla lista
		if(e.getSource()==btnBorrar) {
			
			BorrarItem();
			ActulizarTipos();
		}
	
	
	
	
	}
	
	//metodos
	
	//actualizar tipos de datos
	public void ActulizarTipos() {
		try {
			model =new DefaultTableModel();
			table.setModel(model);
			model.addColumn("NOMBRE");
			model.addColumn("DESCRIPCION");
			String [] data= new String [2];
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
			 Statement stm=(Statement) Conexion.createStatement();
			 ResultSet result =stm.executeQuery("select Nombre,Descripcion from tipos_medicamentos");
			 while (result.next()) {
	            	data[0]=result.getString(1);
 	            	data[1]=result.getString(2);
	            	model.addRow(data);
	            }
			 Conexion.close();
			 
		 }catch(ClassNotFoundException q) {
	        	 q.printStackTrace();
	        	 } catch(SQLException i) {
	            		System.err.println("Error al listar los datos."+i.getMessage());
	            	}
	}
	
	
	
    public void BorrarItem() {
    	
   	 try {
   		 int row=table.getSelectedRow();
			 String Nom=table.getValueAt(row,0).toString();
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
			 Statement stm=(Statement) Conexion.createStatement();
			 int resultset=stm.executeUpdate("delete from tipos_medicamentos where Nombre='"+Nom+"'");
			 if(resultset>0) {
			    	JOptionPane.showMessageDialog(null, "Tipo De Medicamento Borrado con exito");
			 }
			
			 Conexion.close();
			 
	         
		 }catch(ClassNotFoundException q) {
	        	 q.printStackTrace();
	        	 } catch(SQLException i) {
	            		System.err.println("Error al listar los datos."+i.getMessage());
	            	}
    }
}
