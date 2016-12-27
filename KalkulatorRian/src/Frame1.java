import java.awt.*;
import javax.swing.* ;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Frame1 {
	
	private JLabel labelMessage;

	private JFrame frame;
	private JTextField inputText1;
	private JTextField textField;
	private JLabel label;
	private JButton btnNewButton ;
	private JLabel lblNewLabel_1;
	private JLabel lblNewUser;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		inputText1 = new JTextField();
		inputText1.setBounds(258, 39, 86, 20);
		frame.getContentPane().add(inputText1);
		inputText1.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//button di-clik, maka:
				JOptionPane.showMessageDialog(null,"Kalkulator sudah aktif!");
				labelMessage.setText("Calculator ON!");
				
				/* huskyin.com - Mengubah warna tulisan, 
				 sumur : lihat di http://www.otherwise.com/Lessons/ColorsInJava.html */
				labelMessage.setForeground(Color.green);
				btnNewButton.setText("OFF");
			}
		});
		btnNewButton.setBounds(359, 38, 65, 23);
		frame.getContentPane().add(btnNewButton);
		
		labelMessage = new JLabel("Calculator Off");
		labelMessage.setBounds(10, 70, 213, 14);
		frame.getContentPane().add(labelMessage);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(72, 39, 103, 20);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setBounds(193, 42, 65, 14);
		frame.getContentPane().add(lblNewLabel);
		
		label = new JLabel("username:");
		label.setBounds(10, 42, 65, 14);
		frame.getContentPane().add(label);
		
		lblNewLabel_1 = new JLabel("About");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
		/* huskyin.com - clickable Text:
		 * sumur: http://stackoverflow.com/questions/16131811/clickable-text-in-a-jtextpane
		 * 
		 * */
		 
				JOptionPane.showMessageDialog(null,"Aplikasi Kalkulator Sederhana \n"
						+ " Dilengkapi Password, buatan Rian Irawan Hariadi (www.rianhariadi.com)");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(Color.green);
				/*  huskyin.com - menset cursor
				 * sumur: http://stackoverflow.com/questions/7359189/how-to-change-the-mouse-cursor-in-java
				 */
				lblNewLabel_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(Color.black);
				lblNewLabel_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		lblNewLabel_1.setBounds(302, 14, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewUser = new JLabel("New User");
		lblNewUser.setBounds(345, 13, 79, 14);
		frame.getContentPane().add(lblNewUser);
		
		lblNewLabel_2 = new JLabel("Simple Calculator with Login System");
		lblNewLabel_2.setBounds(10, 14, 225, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		
	
	}
}
