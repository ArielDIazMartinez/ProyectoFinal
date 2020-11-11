package PaqueteFarmacia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

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
		setTitle("Inc.Farmacia");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 801, 754);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Administracion");
		menuBar.add(mnNewMenu_1);
		
		JButton btnNewButton_1 = new JButton(" Producto            ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			/*	
				Productos products = new Productos();
				products.setVisible(true);
				this.dispose();
				*/
				
				
				
			}
		});
		mnNewMenu_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Tipo de Producto");
		mnNewMenu_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Lista de Ventas   ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu_1.add(btnNewButton_3);
		
		JMenu mnNewMenu_2 = new JMenu("Ventas ");
		menuBar.add(mnNewMenu_2);
		
		JButton btnNewButton_4 = new JButton("Registrar ventas");
		mnNewMenu_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Clientes              ");
		mnNewMenu_2.add(btnNewButton_5);
		
		JMenu mnNewMenu_3 = new JMenu("Calcular");
		menuBar.add(mnNewMenu_3);
		
		JButton btnNewButton_6 = new JButton("Calculadora");
		mnNewMenu_3.add(btnNewButton_6);
		
		JMenu mnNewMenu_4 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_4);
		
		JButton btnNewButton_7 = new JButton("Acerca de....");
		mnNewMenu_4.add(btnNewButton_7);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("PRODUCTOS");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*	
				Productos products = new Productos();
				products.setVisible(true);
				this.dispose();
				*/
				
				
			}
		});
		btnNewButton_8.setBounds(29, 38, 120, 45);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("CLIENTES");
		btnNewButton_9.setBounds(215, 38, 112, 45);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("GENERAR VENTA");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(372, 38, 138, 45);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(722, 11, 53, 45);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
	}

}
