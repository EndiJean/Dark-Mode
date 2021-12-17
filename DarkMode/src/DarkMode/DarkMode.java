package DarkMode;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class DarkMode extends JFrame implements ActionListener {

	JLabel text = new JLabel();
	JButton btnOn = new JButton();
	JButton btnOff = new JButton();
	JButton exit = new JButton();

	public DarkMode() {
		text.setText("Dark Mode");
		text.setBounds(70, 0, 100, 70);
		text.setHorizontalAlignment(SwingConstants.CENTER);

		btnOn.setText("ON");
		btnOn.setBounds(70, 50, 100, 30);
		btnOn.setBackground(Color.white);
		btnOn.setFocusable(false);
		btnOn.addActionListener(this);

		btnOff.setText("OFF");
		btnOff.setBounds(70, 100, 100, 30);
		btnOff.setBackground(Color.white);
		btnOff.setFocusable(false);
		btnOff.addActionListener(this);
		
		exit.setText("EXIT");
		exit.setBounds(70, 150, 100, 30);
		exit.setBackground(Color.white);
		exit.setFocusable(false);
		exit.addActionListener(this);

		this.setSize(250, 250);
		this.getContentPane().setBackground(Color.white);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setLayout(null);
		this.add(btnOff);
		this.add(btnOn);
		this.add(text);
		this.add(exit);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnOn) {
			this.getContentPane().setBackground(Color.black);
			text.setForeground(Color.white);
			btnOn.setBackground(Color.black);
			btnOn.setForeground(Color.white);
			btnOff.setBackground(Color.black);
			btnOff.setForeground(Color.white);
			exit.setBackground(Color.black);
			exit.setForeground(Color.white);
		}

		if (e.getSource() == btnOff) {
			this.getContentPane().setBackground(Color.white);
			text.setForeground(Color.black);
			btnOn.setBackground(Color.white);
			btnOn.setForeground(Color.black);
			btnOff.setBackground(Color.white);
			btnOff.setForeground(Color.black);
			exit.setBackground(Color.white);
			exit.setForeground(Color.black);
		}
		
		if (e.getSource() == exit) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new DarkMode();

	}

}
