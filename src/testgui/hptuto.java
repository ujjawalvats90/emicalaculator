package testgui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class hptuto extends JFrame {

	/**
	 * 
	 */
	float a,b;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hptuto frame = new hptuto();
					frame.setVisible(true);
					frame.setTitle("EMI CALCULATOR");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hptuto() {
		Font font = new Font("Arial",Font.BOLD,13);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheAmunt = new JLabel("Enter the amunt :-");
		lblEnterTheAmunt.setBounds(37, 62, 130, 25);
		contentPane.add(lblEnterTheAmunt);
		lblEnterTheAmunt.setFont(font);
		
		textField = new JTextField();
		textField.setBounds(205, 65, 152, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSelectTheDuration = new JLabel("Select the duration:-");
		lblSelectTheDuration.setBounds(37, 98, 130, 25);
		contentPane.add(lblSelectTheDuration);
		lblSelectTheDuration.setFont(font);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(205, 96, 152, 23);
		contentPane.add(comboBox);
		
		JLabel lblEmiCalculator = new JLabel("EMI CALCULATOR");
		lblEmiCalculator.setBounds(154, 11, 115, 25);
		contentPane.add(lblEmiCalculator);
		lblEmiCalculator.setFont(font);
		
		JLabel lblEmiIs = new JLabel("EMI IS:-");
		lblEmiIs.setBounds(74, 201, 93, 25);
		contentPane.add(lblEmiIs);
		
		
		JButton btnCalculate = new JButton("Calculate");
		JLabel label_1 = new JLabel("    ");
		label_1.setBounds(205, 201, 152, 25);
		contentPane.add(label_1);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==btnCalculate)
				{
				String test = textField.getText();
				if(test.length()==0)
				{
					
					JOptionPane.showMessageDialog(null, "EMI amount can not empty");
					
				}
				
				try {
				 a=Float.parseFloat(test);
				 a+=a/10;
				}catch(NumberFormatException ne)
				{
					
					JOptionPane.showMessageDialog(null, "EMI amount must be numeric");
					
				}
				b=a+a/10;
				label_1.setBounds(205, 201, 152, 25);
				contentPane.add(label_1);
				int i=comboBox.getSelectedIndex();
				if(i==0) {
					b=a/3;
				}
				if(i==1) {
					b=a/6;
				}
				if(i==2) {
					b=a/12;
				}
				if(i==3) {
					b=a/18;
				}
				if(i==4) {
					b=a/24;
				}
				if(i==5) {
					b=a/36;
				}
				label_1.setText(Float.toString(b));
				btnCalculate.setEnabled(false);
				textField.setEnabled(false);
				}
				
			}
		});
		btnCalculate.setBounds(152, 156, 89, 23);
		contentPane.add(btnCalculate);
		
		JLabel label = new JLabel("");
		label.setBounds(205, 206, 46, 14);
		contentPane.add(label);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnReset)
					label_1.setText("       ");
				btnCalculate.setEnabled(true);
				textField.setEnabled(true);
				textField.setText("");
			}
		});
		btnReset.setBounds(271, 156, 89, 23);
		contentPane.add(btnReset);
		
		JLabel lblMadeByUjjawal = new JLabel("Made By:- Ujjawal Vats");
		lblMadeByUjjawal.setBounds(292, 237, 132, 13);
		contentPane.add(lblMadeByUjjawal);
		
		
		comboBox.addItem("3 Months ");
		comboBox.addItem("6 Months ");
		comboBox.addItem("12 Months ");
		comboBox.addItem("18 Months ");
		comboBox.addItem("24 Months ");
		comboBox.addItem("36 Months ");
		
		
		
		
	}
	
}
