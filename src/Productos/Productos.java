package Productos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import PaqueteFarmacia.IncFarmacia;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Productos extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField1,textField2, textField3, textField4, textField5;
	private JTable table;
	private JButton Button1,Button2, Button3, Button4, Button5, Button6,Button7;
	private JLabel  Label1, Label2,Label3, Label4,Label5,Label6,Label7,Label8;
	private JPanel panel, panel_1,panel_2, panel_3;
	private JDateChooser dateChooser;
	public JComboBox comboBox;
	private DefaultTableModel model;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Productos frame = new Productos();
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
	public Productos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Desktop\\images.ico"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(850, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Buscar Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 50, 813, 263);
		getContentPane().add(panel);
		panel.setLayout(null);
		
	    Label1 = new JLabel("Buscar:");
	    Label1.setFont(new Font("Tahoma", Font.BOLD, 13));
	    Label1.setBounds(22, 28, 61, 27);
		panel.add( Label1);
		
		textField1 = new JTextField();
		textField1.setBounds(93, 27, 553, 32);
		panel.add(textField1);
		textField1.setColumns(10);
		
		Button1 = new JButton("Buscar ");
		Button1.setBounds(671, 23, 114, 39);
		panel.add(Button1);
		Button1.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 72, 753, 167);
		panel.add(scrollPane);
		
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
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos de productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 323, 813, 156);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		Label2 = new JLabel("Nombre:");
		Label2.setFont(new Font("Tahoma", Font.BOLD, 13));
		Label2.setBounds(10, 27, 65, 16);
		panel_1.add(Label2);
		
		textField2 = new JTextField();
		textField2.setBounds(90, 22, 310, 29);
		panel_1.add(textField2);
		textField2.setColumns(10);
		
		Label3 = new JLabel("Cantidad:");
		Label3.setFont(new Font("Tahoma", Font.BOLD, 13));
		Label3.setBounds(10, 65, 72, 29);
		panel_1.add(Label3);
		
		textField3 = new JTextField();
		textField3.setBounds(90, 61, 108, 29);
		panel_1.add(textField3);
		textField3.setColumns(10);
		
		Label4= new JLabel("Precio:");
		Label4.setFont(new Font("Tahoma", Font.BOLD, 13));
		Label4.setBounds(208, 61, 58, 33);
		panel_1.add(Label4);
		
		textField4 = new JTextField();
		textField4.setBounds(265, 61, 135, 29);
		panel_1.add(textField4);
		textField4.setColumns(10);
		
		Label5 = new JLabel("Fecha de Vencimiento:");
		Label5.setFont(new Font("Tahoma", Font.BOLD, 13));
		Label5.setBounds(410, 65, 155, 29);
		panel_1.add(Label5);
		
		Label6 = new JLabel("Tipo:");
		Label6.setFont(new Font("Tahoma", Font.BOLD, 13));
		Label6.setBounds(10, 109, 65, 16);
		panel_1.add(Label6);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar"}));
		comboBox.setBounds(90, 104, 163, 29);
		panel_1.add(comboBox);
		
		Button2 = new JButton("Nuevo");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			TipoProductos produc = new TipoProductos();
			produc.setVisible(true);
			dispose();
			
				
			}
		});
		Button2.setBounds(265, 104, 135, 29);
		panel_1.add(Button2);
		
		Label7 = new JLabel("Descripcion:");
		Label7.setFont(new Font("Tahoma", Font.BOLD, 13));
		Label7.setBounds(410, 27, 91, 16);
		panel_1.add(Label7);
		
		textField5 = new JTextField();
		textField5.setBounds(495, 23, 295, 28);
		panel_1.add(textField5);
		textField5.setColumns(10);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(575, 65, 215, 29);
		panel_1.add(dateChooser);
		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.textHighlight);
		panel_3.setBounds(0,0,846,48);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		Label8 = new JLabel("Inventario de productos");
		Label8.setHorizontalAlignment(SwingConstants.CENTER);
		Label8.setFont(new Font("Tahoma", Font.BOLD, 26));
		Label8.setBounds(10, 10, 826, 28);
		panel_3.add(Label8);
		
		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setBounds(10, 489, 813, 58);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		Button3= new JButton("Regresar");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IncFarmacia vents = new IncFarmacia();
				vents.setVisible(true);
				dispose();			}
		});
		Button3.setBounds(10, 10, 99, 38);
		panel_2.add(Button3);
		
		Button4 = new JButton("Guardar");
		Button4.setBounds(710, 10, 93, 38);
		panel_2.add(Button4);
		Button4.addActionListener(this);
		
		Button5 = new JButton("Borrar");
		Button5.setBounds(504, 10, 93, 38);
		panel_2.add(Button5);
		Button5.addActionListener(this);
		
		Button6 = new JButton("Actulizar ");
		Button6.setBounds(607, 10, 93, 38);
		panel_2.add(Button6);
		Button6.addActionListener(this);
		
        Button7 = new JButton("Cancelar");
        Button7.setBounds(396, 10, 98, 38);
		panel_2.add(Button7);
		Button7.addActionListener(this);
		 
		ActualizarItems();
		getComboBox();
	
		
	}
	
     //ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//guardar items
		if(e.getSource()==Button4) {
			GuardarItems(); 
		}
	    //buscar items
		if(e.getSource()==Button1) {
		 BuscarItems();	
		        
	     }
		//cancelar los datos escritos
		if(e.getSource()==Button7) {
		   textField2.setText("");
		   textField3.setText("");
		   textField4.setText("");
		   textField5.setText("");
				}
		//borrar datos de tabla
		if(e.getSource()==Button5) {
			BorrarItem();
			ActualizarItems();
		}
		
	   //actualizar items
	  if(e.getSource()==Button6) {
		  ActualizarItems();
		  getComboBox();
	       }
	  }
	
	//metodos 
     
	//getdatos comboBox	
	public void getComboBox(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
			Statement stm=(Statement) Conexion.createStatement();
			ResultSet result =stm.executeQuery("select Nombre from tipos_medicamentos");
			while(result.next()){
			comboBox.addItem(result.getString("Nombre"));
			}
			Conexion.close();
	        }catch(ClassNotFoundException q) {
	        	
	        	q.printStackTrace();
	        	} catch(SQLException i) {
	        		System.err.println("Error al listar los datos."+i.getMessage());
	        	}
	}
	
	//Actualizar items
	public void ActualizarItems() {
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
	     //metodo buscar items
	     public void BuscarItems () {
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
	     
	     //guardar items en al base de datos
	     public void GuardarItems() {
	    	 try {
				 //var
				 String Nombre=(textField2.getText()); 
				 Float Precio=Float.parseFloat(textField4.getText());
				 int Cantidad=Integer.parseInt(textField3.getText());
				 Date date=(dateChooser.getDate());
				 long d= date.getTime();
				 java.sql.Date fecha=new java.sql.Date(d);
				 String Tipo=comboBox.getSelectedItem().toString();
				 String Descrip=(textField5.getText());
				 
				 //sql
				 Class.forName("com.mysql.jdbc.Driver");
				 Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
				 Statement stm=(Statement) Conexion.createStatement();
				 int resultset=stm.executeUpdate("insert into inventario(Nombre,Precio,Cantidad,Fecha_vencimiento,Tipo,Descripcion) values ('"+Nombre+"','"+Precio+"','"+Cantidad+"','"+fecha+"','"+Tipo+"','"+Descrip+"')");
				 if(resultset>0) {
				    	JOptionPane.showMessageDialog(null, "Medicamento Guardado con exito");
				 }
				 Conexion.close();
				 textField2.setText("");
				 textField3.setText("");
				 textField4.setText("");
				 textField5.setText("");
		         
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
				 int resultset=stm.executeUpdate("delete from inventario where Nombre='"+Nom+"'");
				 if(resultset>0) {
				    	JOptionPane.showMessageDialog(null, "Medicamento Borrado con exito");
				 }
				
				 Conexion.close();
				 
		         
			 }catch(ClassNotFoundException q) {
		        	 q.printStackTrace();
		        	 } catch(SQLException i) {
		            		System.err.println("Error al listar los datos."+i.getMessage());
		            	}
	     }
	
	
	
}
