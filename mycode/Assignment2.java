package mycode;
import javax.swing.*;

public class Assignment2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Assignment 2 : ROLL NO 22EARAD118");
        frame.setSize(400, 300);
        
        ImageIcon img = new ImageIcon("Resources/picture.jpg");
		frame.setIconImage(img.getImage());

        JMenuBar menuBar = new JMenuBar();
        JMenu coursesMenu = new JMenu("Courses");
        
        JMenu btechSubMenu = new JMenu("B Tech");
        JMenuItem mtechItem = new JMenuItem("M Tech");
        JMenuItem mbaItem = new JMenuItem("MBA");
        JMenuItem bcaItem = new JMenuItem("BCA");
        JMenuItem mcaItem = new JMenuItem("MCA");
        coursesMenu.add(btechSubMenu);
        coursesMenu.add(mtechItem);
        coursesMenu.add(mbaItem);
        coursesMenu.add(bcaItem);
        coursesMenu.add(mcaItem);
        
        JMenuItem cseItem = new JMenuItem("CSE");
        JMenu aiSubMenu = new JMenu("AI & DS");
        JMenuItem itItem = new JMenuItem("IT");
        JMenuItem eceItem = new JMenuItem("ECE");
        JMenuItem meItem = new JMenuItem("ME");
        JMenuItem eeItem = new JMenuItem("EE");
        btechSubMenu.add(cseItem);
        btechSubMenu.add(aiSubMenu);
        btechSubMenu.add(itItem);
        btechSubMenu.add(eceItem);
        btechSubMenu.add(meItem);
        btechSubMenu.add(eeItem);
        
        JMenuItem firstItem = new JMenuItem("1st Year");
        JMenuItem secondItem = new JMenuItem("2nd Year");
        JMenu yearSubMenu = new JMenu("3rd Year");
        JMenuItem fourthItem = new JMenuItem("4th Year");
        aiSubMenu.add(firstItem);
        aiSubMenu.add(secondItem);
        aiSubMenu.add(yearSubMenu);
        aiSubMenu.add(fourthItem);
        
        JMenuItem oneItem = new JMenuItem("AI & DS - A");
        JMenu bSubMenu = new JMenu("AI & DS - B");
        yearSubMenu.add(oneItem);
        yearSubMenu.add(bSubMenu);
        
        JMenuItem bOneItem = new JMenuItem("B1");
        JMenuItem bTwoItem = new JMenuItem("B2");
        bSubMenu.add(bOneItem);
        bSubMenu.add(bTwoItem);

        menuBar.add(coursesMenu);
       
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}