package PaqueteFarmacia;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Calculadora.Calculador;
import Cliente.Cliente;
import PrimerPaquete.InicioSeccion;
import Productos.FacturaVenta;
import Productos.GenerarVentas;
import Productos.Productos;
import Productos.TipoProductos;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.SystemColor;

public class IncFarmacia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncFarmacia frame = new IncFarmacia();
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
	public IncFarmacia() {
		setType(Type.POPUP);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Desktop\\images.ico"));
		setTitle("Inc.Farmacia");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(801, 745);
		setResizable(false);
		setLocationRelativeTo(null);

		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Administracion");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_1);
		
		JButton btnNewButton_1 = new JButton(" Producto            ");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Productos products = new Productos();
				products.setVisible(true);
				dispose();
				
				
			}
		});
		mnNewMenu_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Tipo de Producto");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TipoProductos producs = new TipoProductos();
				producs.setVisible(true);
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		mnNewMenu_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Factura de Ventas   ");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				FacturaVenta vents = new FacturaVenta();
				vents.setVisible(true);
				dispose();
				
				
				
				
				
			}
		});
		mnNewMenu_1.add(btnNewButton_3);
		
		JMenu mnNewMenu_2 = new JMenu("Ventas ");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_2);
		
		JButton btnNewButton_4 = new JButton("Registrar ventas");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GenerarVentas vents = new GenerarVentas();
				vents.setVisible(true);
				dispose();
				
				
				
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		mnNewMenu_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Clientes                 ");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				Cliente cli = new Cliente();
				cli.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		mnNewMenu_2.add(btnNewButton_5);
		
		JMenu mnNewMenu_3 = new JMenu("Calcular");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_3);
		
		JButton btnNewButton_6 = new JButton("Calculadora");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Calculador cli = new Calculador();
				cli.setVisible(true);
				
				
				
				
				
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		mnNewMenu_3.add(btnNewButton_6);
		
		JMenu mnNewMenu_4 = new JMenu("Ayuda");
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_4);
		
		JButton btnNewButton_7 = new JButton("Acerca de....");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		mnNewMenu_4.add(btnNewButton_7);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton_8 = new JButton("PRODUCTOS");
		btnNewButton_8.setBounds(289, 179, 138, 45);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Productos products = new Productos();
				products.setVisible(true);
				dispose();
				
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("CLIENTES");
		btnNewButton_9.setBounds(10, 179, 138, 45);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente cli = new Cliente();
				cli.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("GENERAR VENTA");
		btnNewButton_10.setBounds(553, 179, 138, 45);
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GenerarVentas vents = new GenerarVentas();
				vents.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setBounds(722, 11, 53, 45);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				InicioSeccion pf = new InicioSeccion();
				pf.setVisible(true);
				dispose();
				
				
			}
		});
	}
}
