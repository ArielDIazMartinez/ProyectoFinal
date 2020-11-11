package Productos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.BoxLayout;
import com.toedter.calendar.JDateChooser;

public class addProductos {

	private JFrame frame;
	private JTextField textField1,textField2, textField3, textField4, textField5;
	private JTable table;
	private JButton Button1,Button2, Button3, Button4, Button5;
	private JLabel  Label1, Label2,Label3, Label4,Label5,Label6,Label7,Label8;
	private JPanel panel_1,panel_2, panel_3;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addProductos window = new addProductos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addProductos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(850, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Buscar Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 50, 813, 263);
		frame.getContentPane().add(panel);
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 72, 753, 167);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Precio", "Cantidad", "Fec. Ven.", "Tipo", "Descripcion"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(115);
		table.getColumnModel().getColumn(1).setPreferredWidth(94);
		table.getColumnModel().getColumn(2).setPreferredWidth(113);
		table.getColumnModel().getColumn(3).setPreferredWidth(96);
		table.getColumnModel().getColumn(4).setPreferredWidth(88);
		table.getColumnModel().getColumn(5).setPreferredWidth(147);
		scrollPane.setViewportView(table);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos de productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 323, 813, 156);
		frame.getContentPane().add(panel_1);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar"}));
		comboBox.setBounds(90, 104, 163, 29);
		panel_1.add(comboBox);
		
		Button2 = new JButton("Nuevo");
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
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(575, 65, 215, 29);
		panel_1.add(dateChooser);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.PINK);
		panel_3.setBounds(0,0,846,48);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		Label8 = new JLabel("Inventario de productos");
		Label8.setHorizontalAlignment(SwingConstants.CENTER);
		Label8.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Label8.setBounds(10, 10, 826, 28);
		panel_3.add(Label8);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(10, 489, 813, 58);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		Button3= new JButton("Regresar");
		Button3.setBounds(10, 10, 99, 38);
		panel_2.add(Button3);
		
		Button4 = new JButton("Guardar");
		Button4.setBounds(710, 10, 93, 38);
		panel_2.add(Button4);
		
		Button5 = new JButton("Borrar");
		Button5.setBounds(607, 10, 93, 38);
		panel_2.add(Button5);
	}
}
