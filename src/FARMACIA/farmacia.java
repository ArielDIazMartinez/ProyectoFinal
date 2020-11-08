package FARMACIA;

import java.awt.EventQueue;
//import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;


public class farmacia {

	private JFrame frame;
	JMenu Menu, Administracion, Ventas,Calcular, Ayuda;
	JMenuItem Salir, Producto, TipoProducto, ListaVentas,Calculadora, RegistrarVenta, Clientes, Acerca; 
	JMenuBar Barra;
	JButton Button1, Button2, Button3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					farmacia window = new farmacia();
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
	public farmacia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		//JMenu
		Menu= new JMenu("Menu");
		Administracion= new JMenu("Administracion");
		Ventas= new JMenu("Ventas");
		Calcular= new JMenu("Calcular");
		Ayuda= new JMenu("Ayuda");
		
		//Items
		Salir=new JMenuItem("Salir");
		Producto=new JMenuItem("Producto");
		TipoProducto=new JMenuItem("Tipo de productos");
		ListaVentas=new JMenuItem("Lista de ventas");
		RegistrarVenta= new JMenuItem("Registrar Venta");
		Clientes= new JMenuItem("Clientes");
		Calculadora= new JMenuItem("Calculadora");
		Acerca= new JMenuItem("Acerca de...");
		
		//add
		Menu.add(Salir);
		Administracion.add(Producto);
		Administracion.add(TipoProducto);
		Administracion.add(ListaVentas);
		Ventas.add(RegistrarVenta);
		Ventas.add(Clientes);
		Calcular.add(Calculadora);
		Ayuda.add(Acerca);
	
		//Barra
		Barra= new JMenuBar();
		Barra.add(Menu);
		Barra.add(Administracion);
		Barra.add(Ventas);
		Barra.add(Calcular);
		Barra.add(Ayuda);
		frame.setJMenuBar(Barra);
		
		//frame
		frame.setSize(1000, 1000);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Button1 = new JButton("Productos");
		Button1.setBounds(10, 10, 133, 37);
		frame.getContentPane().add(Button1);
		
		Button2 = new JButton("Clientes");
		Button2.setBounds(153, 10, 133, 37);
		frame.getContentPane().add(Button2);
		
		Button3 = new JButton("Generar Venta");
		Button3.setBounds(296, 10, 133, 37);
		frame.getContentPane().add(Button3);
		
		
	}
}
