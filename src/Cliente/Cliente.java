package Cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Cliente extends JFrame {

	private JPanel contentPane;
	private JLabel Label1;
	private JPanel panel, panel_1;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850,600 );
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 846, 52);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label1 = new JLabel("Clientes");
		Label1.setFont(new Font("Tahoma", Font.BOLD, 26));
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setBounds(10, 10, 826, 32);
		panel.add(Label1);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 62, 826, 202);
		contentPane.add(panel_1);
		
		
	
	
	}
}
