package lab5label;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;

public class Lab5labelandbutton {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab5labelandbutton window = new Lab5labelandbutton();
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
	public Lab5labelandbutton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO LAB -5 ");
		lblNewLabel.setForeground(new Color(255, 99, 71));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(449, 40, 982, 121);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER YOUR NAME");
		lblNewLabel_1.setFont(new Font("Serif", Font.ITALIC, 23));
		lblNewLabel_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_1.setBounds(31, 231, 296, 67);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(309, 250, 312, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FAVOURATE COLOR");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 17));
		lblNewLabel_2.setForeground(new Color(218, 165, 32));
		lblNewLabel_2.setBounds(31, 336, 201, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CHOOSE COLOR ", "ORANGE", "PURPLE", "PINK"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setToolTipText("BULE, PURPLE, ORANGE");
		comboBox.setBounds(262, 346, 154, 29);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 19));
		btnNewButton.setForeground(new Color(210, 105, 30));
		btnNewButton.setBounds(149, 436, 148, 39);
		frame.getContentPane().add(btnNewButton);
		
	}
}
