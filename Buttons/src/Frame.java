import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtHierBitteText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1500, 200, 430, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dieser Text soll ver\u00E4ndert werden");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(21, 11, 383, 14);
		contentPane.add(lblNewLabel);
		contentPane.setBackground(new Color(0xeeeeee));
		JLabel lblNewLabel_1 = new JLabel("Aufgabe 1: Hintergrund ver\u00E4ndern");
		lblNewLabel_1.setBounds(21, 50, 204, 14);
		contentPane.add(lblNewLabel_1);
		
		//button Rot
		JButton btnNewButton = new JButton("Rot");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});
		btnNewButton.setBounds(21, 75, 96, 23);
		contentPane.add(btnNewButton);
		
		//button Grün
		JButton btnNewButton_1 = new JButton("Gr\u00FCn");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.GREEN);
			}
		});
		btnNewButton_1.setBounds(127, 75, 128, 23);
		contentPane.add(btnNewButton_1);
		
		//button Blau
		JButton btnNewButton_2 = new JButton("Blau");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.BLUE);
			}
		});
		btnNewButton_2.setBounds(265, 75, 139, 23);
		contentPane.add(btnNewButton_2);
		
		//button Gelb
		JButton btnNewButton_3 = new JButton("Gelb");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.YELLOW);
			}
		});
		btnNewButton_3.setBounds(21, 109, 96, 23);
		contentPane.add(btnNewButton_3);
		
		//button Standard
		JButton btnNewButton_4 = new JButton("Standardfarbe");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(new Color(0xeeeeee));
			}
		});
		btnNewButton_4.setBounds(127, 109, 128, 23);
		contentPane.add(btnNewButton_4);
		
		//button ?
		JButton btnNewButton_5 = new JButton("Farbe Wählen");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});
		btnNewButton_5.setBounds(265, 109, 139, 23);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_2 = new JLabel("Aufgabe 2: Text Formatieren");
		lblNewLabel_2.setBounds(21, 143, 383, 14);
		contentPane.add(lblNewLabel_2);
		
		
		//button arial
		JButton btnNewButton_6 = new JButton("Arial");
		btnNewButton_6.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
			}
		});
		btnNewButton_6.setBounds(21, 168, 69, 23);
		contentPane.add(btnNewButton_6);
		
		//button Comic Sans
		JButton btnNewButton_7 = new JButton("Comic Sans MS");
		btnNewButton_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
			}
		});
		btnNewButton_7.setBounds(100, 168, 155, 23);
		contentPane.add(btnNewButton_7);
		
		//button Curiur new
		JButton btnNewButton_8 = new JButton("Courier New");
		btnNewButton_8.setFont(new Font("Courier New", Font.PLAIN, 11));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setFont(new Font("Courier New", Font.PLAIN, 11));
			}
		});
		btnNewButton_8.setBounds(265, 168, 139, 23);
		contentPane.add(btnNewButton_8);
		
		txtHierBitteText = new JTextField();
		txtHierBitteText.setText("Hier bitte Text eingaben");
		txtHierBitteText.setBounds(21, 196, 383, 20);
		contentPane.add(txtHierBitteText);
		txtHierBitteText.setColumns(10);
		
		JButton btnNewButton_9 = new JButton("Ins Label Schreiben");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(txtHierBitteText.getText());
			}
		});
		btnNewButton_9.setBounds(21, 227, 161, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Text im label L\u00F6schen");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(null);
			}
		});
		btnNewButton_10.setBounds(192, 227, 212, 23);
		contentPane.add(btnNewButton_10);
		
		JLabel lblNewLabel_3 = new JLabel("Aufgabe 3: Textfarbe \u00C4ndern");
		lblNewLabel_3.setBounds(21, 261, 383, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_11 = new JButton("Rot");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setForeground(Color.RED);
			}
		});
		btnNewButton_11.setBounds(21, 286, 89, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Blau");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setForeground(Color.BLUE);
			}
		});
		btnNewButton_12.setBounds(127, 286, 128, 23);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Schwarz");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setForeground(Color.BLACK);
			}
		});
		btnNewButton_13.setBounds(265, 286, 139, 23);
		contentPane.add(btnNewButton_13);
		
		JLabel lblNewLabel_4 = new JLabel("Aufgabe 4: Schriftgr\u00F6\u00DFe ver\u00E4ndern");
		lblNewLabel_4.setBounds(21, 320, 383, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_14 = new JButton("+");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = lblNewLabel.getFont().getSize();
				lblNewLabel.setFont(new Font(lblNewLabel.getFont().getFamily(), Font.PLAIN, a+1));
			}
		});
		btnNewButton_14.setBounds(21, 345, 189, 23);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("-");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = lblNewLabel.getFont().getSize();
				lblNewLabel.setFont(new Font(lblNewLabel.getFont().getFamily(), Font.PLAIN, a-1));
			}
		});
		btnNewButton_15.setBounds(220, 345, 184, 23);
		contentPane.add(btnNewButton_15);
		
		JLabel lblNewLabel_5 = new JLabel(" Aufgabe 5 Textausrichtung");
		lblNewLabel_5.setBounds(21, 379, 383, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_16 = new JButton("Linksb\u00FCndig");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
			}
		});
		btnNewButton_16.setBounds(21, 404, 121, 23);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("Zentriert");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			}
		});
		btnNewButton_17.setBounds(152, 404, 114, 23);
		contentPane.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("Rechtsb\u00FCndig");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			}
		});
		btnNewButton_18.setBounds(276, 404, 128, 23);
		contentPane.add(btnNewButton_18);
	}
}
