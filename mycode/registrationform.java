package mycode;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;

public class registrationform implements ActionListener{
	JFrame f;
	JPanel p1, p2;
	ImageIcon image;
	JLabel title, name, fname, mname, gender, dob, mobile, mail, address, course, branch, doa;
	JTextField inuser, infather, inmother, inmobile, inmail;
	JComboBox<String> incourse, inbranch;
	JDateChooser indob, indoa;
	JTextArea inadd, display;
	JRadioButton male, female;
	JCheckBox terms;
	JButton submit, reset, exit;
	ButtonGroup radiogender;
	
	registrationform(){
		f=new JFrame("Application Form by Vishal Gupta");
		p1=new JPanel();
		p2=new JPanel();
		title=new JLabel("Student Registration Form by 22EARAD118");
		name=new JLabel("Student's Name:");
		fname=new JLabel("Father's Name:");
		mname=new JLabel("Mother's Name:");
		gender=new JLabel("Gender:");
		dob=new JLabel("Date of Birth:");
		mobile=new JLabel("Mobile Number:");
		mail=new JLabel("E-mail ID:");
		address=new JLabel("Address:");
		course=new JLabel("Course:");
		branch=new JLabel("Branch:");
		doa=new JLabel("Date of Admission:");
		inuser=new JTextField();
		infather=new JTextField();
		inmother=new JTextField();
		inmobile=new JTextField();
		inmail=new JTextField();
		indob=new JDateChooser();
		indob.setDateFormatString("dd-MM-yyyy");
		indoa=new JDateChooser();
		indoa.setDateFormatString("dd-MM-yyyy");
		inadd=new JTextArea();
		display=new JTextArea();
		terms=new JCheckBox("Please Accept Terms & Conditions");
		incourse=new JComboBox<>(new String[] {"Select Your Course", "B Tech", "M Tech", "BCA", "MCA", "MBA"});
		inbranch=new JComboBox<>(new String[] {"Select Your Branch", "AI&DS", "CSE", "EE", "ECE", "IT", "ME"});
		male=new JRadioButton("Male");
		female=new JRadioButton("Female");
		submit=new JButton("Submit");
		reset=new JButton("Reset");
		exit=new JButton("Exit");
		
		radiogender=new ButtonGroup();
		radiogender.add(male);
		radiogender.add(female);
		
		image = new ImageIcon("Resources/Picture.jpg");
		f.setIconImage(image.getImage());
		
		name.setBounds(20, 60, 150, 25);
		fname.setBounds(20, 100, 150, 25);
		mname.setBounds(20, 140, 150, 25);
		gender.setBounds(20, 180, 150, 25);
		dob.setBounds(20, 220, 150, 25);
		mobile.setBounds(20, 260, 150, 25);
		mail.setBounds(20, 300, 150, 25);
		address.setBounds(20, 360, 150, 25);
		course.setBounds(20, 480, 150, 25);
		branch.setBounds(20, 530, 150, 25);
		doa.setBounds(20, 580, 150, 25);
		inuser.setBounds(140, 60, 300, 25);
		infather.setBounds(140, 100, 300, 25);
		inmother.setBounds(140, 140, 300, 25);
		inmobile.setBounds(140, 260, 300, 25);
		inmail.setBounds(140, 300, 300, 25);
		incourse.setBounds(140, 480, 300, 30);
		inbranch.setBounds(140, 530, 300, 30);
		indob.setBounds(140, 220, 300, 25);
		indoa.setBounds(140, 580, 300, 25);
		inadd.setBounds(140, 360, 300, 100);
		inadd.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		male.setBounds(140, 180, 150, 25);
		female.setBounds(290, 180, 150, 25);
		male.setBackground(Color.WHITE);
		female.setBackground(Color.WHITE);
		submit.setBounds(60, 690, 90, 25);
		reset.setBounds(180, 690, 90, 25);
		exit.setBounds(300, 690, 90, 25);
		terms.setBounds(100, 650, 300, 25);
		terms.setBackground(Color.WHITE);
		title.setFont(new Font("Times New Roman", Font.BOLD, 20));
        title.setBounds(40, 20, 400, 30);
        title.setForeground(Color.BLUE);
        
        display.setBounds(20, 20, 250, 450);
       
        p1.add(title);
        p1.add(name);
        p1.add(fname);
        p1.add(mname);
        p1.add(gender);
        p1.add(dob);
        p1.add(mobile);
        p1.add(mail);
        p1.add(address);
        p1.add(course);
        p1.add(branch);
        p1.add(doa);
        p1.add(inuser);
        p1.add(infather);
        p1.add(inmother);
        p1.add(inmobile);
        p1.add(inmail);
        p1.add(incourse);
        p1.add(inbranch);
		p1.add(indob);
		p1.add(indoa);
		p1.add(inadd);
		p1.add(male);
		p1.add(female);
		p1.add(submit);
		p1.add(reset);
		p1.add(exit);
		p1.add(terms);
		
		p1.setLayout(null);
        p1.setBounds(10, 10, 460, 740);
        p1.setBackground(Color.WHITE);
        p1.setBorder(BorderFactory.createTitledBorder("Fill Registration Form"));
        
        p2.add(display);
        
        p2.setLayout(null);
        p2.setBounds(480, 10, 300, 500);
        p2.setBackground(Color.WHITE);
        p2.setBorder(BorderFactory.createTitledBorder("Student Database"));
        
        f.add(p1);
        f.add(p2);
		
		f.setSize(800, 950);
		f.setLayout(null);
		f.setVisible(true);
		
		submit.addActionListener(this);
		reset.addActionListener(this);
		exit.addActionListener(this);
		terms.addActionListener(this);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit) {
			if(terms.isSelected()) {
				String name=inuser.getText();
				String fname=infather.getText();
				String mname=inmother.getText();
				String mobile=inmobile.getText();
				String mail=inmail.getText();
				String address=inadd.getText();
				String course=(String)incourse.getSelectedItem();
				String branch=(String)inbranch.getSelectedItem();
				String gender=male.isSelected() ? "Male" : "Female";
				
				DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
				
				display.setText("Student's Name: "+name+"\nFather's Name: "+fname+"\nMother's Name: "+mname+"\nGender: "+gender+"\nDate of Birth: "+df.format(indob.getDate())+"\nMobile Number: "+mobile+"\nE-mail ID: "+mail+"\nAddress: "+address+"\nCourse: "+course+"\nBranch: "+branch+"\nDate of Admission: "+df.format(indoa.getDate()));
				display.setFont(new Font("Arial", Font.BOLD, 12));
			}
			else
				JOptionPane.showMessageDialog(f, "You must accept the Terms & Conditions to submit.");
		}
		if(e.getSource()==reset) {
			inuser.setText(null);
			infather.setText(null);
			inmother.setText(null);
			inmobile.setText(null);
			inmail.setText(null);
			inadd.setText(null);
			indob.setDate(null);
			indoa.setDate(null);
			incourse.setSelectedIndex(0);
			inbranch.setSelectedIndex(0);
			terms.setSelected(false);
		}
		if(e.getSource()==exit) {
			System.exit(0);
		}
	}


	public static void main(String[] args) {
		new registrationform();

	}

}