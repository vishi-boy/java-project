package mycode;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class loginform implements ActionListener{
	JFrame f;
	ImageIcon image;
	JLabel title, username, password;
	JButton login, reset;
	JTextField inuser;
	JPasswordField inpass;
	JCheckBox cb;
	
	loginform(){
		f=new JFrame("Login Authentication Page by ROLL NO 22EARAD118");
		title=new JLabel("User Login by ROLL NO 22EARAD118");
		username=new JLabel("Username:");
		password=new JLabel("Password:");
		inuser=new JTextField();
		inpass=new JPasswordField();
		cb=new JCheckBox("Show password");
		login=new JButton("Login");
		reset=new JButton("Reset");
		
		ImageIcon image = new ImageIcon("Resources/blacklock.png");
		f.setIconImage(image.getImage());
        
		title.setBounds(120, 30, 250, 20);
		title.setFont(new Font("Times New Roman", Font.BOLD, 20));
		username.setBounds(80, 62, 70, 50);
		password.setBounds(80, 104, 70, 50);
		inuser.setBounds(150, 80, 200, 20);
		inpass.setBounds(150, 120, 200, 20);
		cb.setBounds(160, 160, 200, 20);
		login.setBounds(100, 210, 80, 20);
		reset.setBounds(250, 210, 80, 20);
		
		f.add(title);
		f.add(username);
		f.add(password);
		f.add(inuser);
		f.add(inpass);
		f.add(cb);
		f.add(reset);
		f.add(login);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		login.addActionListener(this);
		reset.addActionListener(this);
		cb.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login) {
			if(inuser.getText().equals("vishal") && inpass.getText().equals("12345678")) {
				JOptionPane.showMessageDialog(f, "Login Successful.");
			}
			else {
				JOptionPane.showMessageDialog(f, "Wrong Credential. Try again.");
			}
		}
		if(e.getSource()==reset) {
			inuser.setText(null);
			inpass.setText(null);
		}
		if(e.getSource()==cb) {
			if(cb.isSelected()) 
				inpass.setEchoChar('\u0000');	
			else 
				inpass.setEchoChar('*');
		}
	}

	public static void main(String[] args) {
		new loginform();	
	}
}