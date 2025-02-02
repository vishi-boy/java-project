package mycode;
import java.awt.event.*;
import javax.swing.*;

public class code implements ActionListener {

	JFrame f;
	JButton contentPane;
	JTextField textField;
	JCheckBox cb;
	
	code() {
	
	f=new JFrame("");
	cb=new JCheckBox("");
	contentPane=new JButton("Apply");
	textField=new JTextField("");
	
	cb.setBounds(250,100,50,20);
	contentPane.setBounds(300,100,100,20);
	textField.setBounds(100,100,100,20);
	
	f.add(contentPane);
	f.add(cb);
	f.add(textField);
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
	contentPane.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)  {
		if(e.getSource()==contentPane) {
			if(textField.getText().equals("22EARAD118")) {
				JOptionPane.showMessageDialog(f,"Submit Successfully");
			}
			else 
				JOptionPane.showMessageDialog(f,"Wrong");
		}
	}

	public static void main(String[] args) {
		new code();
	}
	
	}
