import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JComboBox;

import java.io.*;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;

public class ComboBox {

	private JFrame frame;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JComboBox<String> comboBox = new JComboBox<String>();
	private static JTextArea textArea; 
	private static String lname;
	private static String fname;
	private static String carrier;
	private static String number;
	private static String usern;
	private static String passw;
	private String message;
	static Writer write = new Writer();

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox window = new ComboBox();
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
	public ComboBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()  {
		try
		{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 153, 255));
		frame.setBounds(100, 100, 797, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		comboBox.setBounds(297, 280, 188, 20);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(297, 187, 188, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		lname = textField.getText();
		
		textField_1 = new JTextField();
		textField_1.setBounds(297, 93, 188, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		fname = textField_1.getText();
		
		textField_2 = new JTextField();
		textField_2.setBounds(297, 374, 188, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		number = textField_2.getText();
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(297, 81, 133, 14);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(297, 175, 133, 14);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblSelectCarrier = new JLabel("Select Carrier");
		lblSelectCarrier.setBounds(297, 266, 116, 14);
		frame.getContentPane().add(lblSelectCarrier);
		
		
		JLabel lblCellPhone = new JLabel("Cell Phone #");
		lblCellPhone.setBounds(297, 361, 116, 14);
		frame.getContentPane().add(lblCellPhone);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.setBounds(341, 418, 89, 23);
		frame.getContentPane().add(btnSubmit);
		btnSubmit.addActionListener(new Action());
		
		
		JLabel lblAddRecipiant = new JLabel("Add Recipient");
		lblAddRecipiant.setBounds(357, 38, 89, 14);
		frame.getContentPane().add(lblAddRecipiant);
		
		textField_3 = new JTextField();
		textField_3.setBounds(25, 93, 188, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		usern = textField_3.getText();
		
		JLabel lblGmail = new JLabel("Gmail");
		lblGmail.setBounds(25, 81, 108, 14);
		frame.getContentPane().add(lblGmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(25, 175, 95, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(103, 38, 76, 14);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblMessage = new JLabel("Message");
		lblMessage.setBounds(616, 38, 142, 14);
		frame.getContentPane().add(lblMessage);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(589, 418, 89, 23);
		frame.getContentPane().add(btnSend);
		btnSend.addActionListener(new Action3());
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(74, 218, 89, 23);
		frame.getContentPane().add(btnLogin);
		btnLogin.addActionListener(new Action2());
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(529, 91, 215, 303);
		frame.getContentPane().add(textArea);
		
		textField_4 = new JTextField();
		textField_4.setBounds(25, 187, 188, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblBingSmsMesenger = new JLabel("SMS Mesenger");
		lblBingSmsMesenger.setForeground(Color.WHITE);
		lblBingSmsMesenger.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBingSmsMesenger.setBounds(332, 0, 215, 33);
		frame.getContentPane().add(lblBingSmsMesenger);
		passw = textField_4.getText();
		
		
		//change the parameters of the filereader to the path for where you put the list of providers
		FileReader file = new FileReader("src/Provider Names.txt");
		BufferedReader reader = new BufferedReader(file);
		String text = "";
		String line = reader.readLine();
		while (line != null)
		{
			text = line;
			comboBox.addItem(text);
			line = reader.readLine();
		}
		reader.close();
		carrier = comboBox.getSelectedItem().toString();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());	
		}
	}
	
	static class Action implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("clicked submit");
			lname = textField_1.getText();
			fname = textField.getText();
			carrier = comboBox.getSelectedItem().toString();
			number = textField_2.getText();
			System.out.println("lname: " + lname);
			System.out.println("fname: " + fname);
			System.out.println("carrier: " + carrier);
			System.out.println("number: " + number);
			Person p = new Person(lname, fname, carrier, number);
			write.write(p);
		}
	}
	
	static class Action2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("clicked login");
			usern = textField_3.getText();
			passw = textField_4.getText();
			System.out.println("user: " + usern);
			System.out.println("pass: " + passw);
			SendEmail.user = usern;
			SendEmail.pass = passw;
		}
	}
	
	static class Action3 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("clicked send");
			SendEmail.msg = textArea.getText();
			SendEmail.Send();
		}
	}
}

