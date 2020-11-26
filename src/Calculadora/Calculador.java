package Calculadora;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.SwingConstants;

public class Calculador extends JFrame {

	
	
	
	private JPanel contentPane;
	 


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculador frame = new Calculador();
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
	
	public float primernumero;
	public float segundonumero;
	public String Operador;
	
	
	public String efecero(float result) {
		String restorn = "";
		
		restorn = Float.toString(result);
		
		if (result % 1 == 0) {
			restorn = restorn.substring(0, restorn.length()- 2);
		}
		
		
		
		
		return restorn;
		
	}
	
	
	public Calculador() {
		
		

		
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 325, 414);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 255));
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel caja = new JLabel("");
		caja.setOpaque(true);
		caja.setFont(new Font("Tahoma", Font.BOLD, 13));
		caja.setBackground(new Color(255, 255, 255));
		caja.setForeground(new Color(0, 0, 0));
		caja.setBounds(10, 11, 286, 29);
		contentPane.add(caja);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 49, 286, 321);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				caja.setText("");
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(10, 11, 57, 46);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    caja.setText(caja.getText() +"7");

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(10, 67, 57, 46);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    caja.setText(caja.getText() +"4");

			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(10, 124, 57, 46);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    caja.setText(caja.getText() +"1");

			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(10, 181, 57, 46);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("0");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		    caja.setText(caja.getText() +"0");
				 	
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setBounds(10, 238, 124, 46);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_3_1 = new JButton("2");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    caja.setText(caja.getText() +"2");

			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3_1.setBounds(77, 181, 57, 46);
		panel.add(btnNewButton_3_1);
		
		JButton btnNewButton_2_1 = new JButton("5");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    caja.setText(caja.getText() +"5");

			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2_1.setBounds(77, 124, 57, 46);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1 = new JButton("8");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    caja.setText(caja.getText() +"8");

			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(77, 67, 57, 46);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_5 = new JButton("/");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primernumero = Float.parseFloat(caja.getText());
				Operador = "/";
				caja.setText("");
				
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.setBounds(77, 11, 57, 46);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_3_2 = new JButton("3");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    caja.setText(caja.getText() +"3");

			}
		});
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3_2.setBounds(148, 181, 57, 46);
		panel.add(btnNewButton_3_2);
		
		JButton btnNewButton_4_2 = new JButton(".");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!(caja.getText().contains("."))) {
					
					  caja.setText(caja.getText() +"."); 
					
				}
			}
			
		});
		
		


		
		
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4_2.setBounds(148, 238, 57, 46);
		panel.add(btnNewButton_4_2);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    caja.setText(caja.getText() +"6");

			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2_2.setBounds(148, 124, 57, 46);
		panel.add(btnNewButton_2_2);
		
		JButton btnNewButton_1_2 = new JButton("9");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    caja.setText(caja.getText() +"9");

			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_2.setBounds(148, 67, 57, 46);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_6 = new JButton("*");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primernumero = Float.parseFloat(caja.getText());
				Operador = "*";
				caja.setText("");
				
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_6.setBounds(148, 11, 57, 46);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_4_3 = new JButton("=");
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				segundonumero = Float.parseFloat(caja.getText());
				
				switch (Operador) {
				case "+": caja.setText(efecero(primernumero + segundonumero)); break;
				case "-": caja.setText(efecero(primernumero - segundonumero)); break;
				case "*": caja.setText(efecero(primernumero * segundonumero)); break;
				case "/": caja.setText(efecero(primernumero / segundonumero)); break;

				}
				
				
			}
		});
		btnNewButton_4_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4_3.setBounds(215, 181, 61, 103);
		panel.add(btnNewButton_4_3);
		
		JButton btnNewButton_2_3 = new JButton("+");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primernumero = Float.parseFloat(caja.getText());
				Operador = "+";
				caja.setText("");
				
			}
		});
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2_3.setBounds(215, 67, 57, 103);
		panel.add(btnNewButton_2_3);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primernumero = Float.parseFloat(caja.getText());
				Operador = "-";
				caja.setText("");	
				
				
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_7.setBounds(215, 11, 57, 46);
		panel.add(btnNewButton_7);
	}
}
