package application;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import com.sun.javafx.tk.Toolkit;

public class CustomerDemographicInformation {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerDemographicInformation window = new CustomerDemographicInformation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public CustomerDemographicInformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JRadioButton rdbtnSmall = new JRadioButton("male");
		rdbtnSmall.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSmall.setSelected(true);
		panel.add(rdbtnSmall);
		
		JRadioButton rdbtnMedium = new JRadioButton("famale");
		rdbtnMedium.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(rdbtnMedium);
	}
		
	
	    private static final long serialVersionUID = 1L;
		protected static JLabel LbName;
		protected static JTextField txtInputName;
	    protected static JLabel LbDescription;
		protected static JTextField txtInputDescription;
		static JButton btnSubmit;


		LbName = new JLabel("Last Name:");
		txtInputName = new JTextField(50);
		        
		LbName = new JLabel("Middle:");
		txtInputName = new JTextField(1);
		        
		LbName = new JLabel("First Name:");
		txtInputName = new JTextField(50);
		
		btnSubmit = new JButton("Clear");
        btnSubmit.addActionListener(this);
        
        btnSubmit = new JButton("Save");
        btnSubmit.addActionListener(this);

	}
}