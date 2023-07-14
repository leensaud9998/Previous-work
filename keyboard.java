package GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class keyboard extends JFrame implements ActionListener {
	
	JFrame frame = new JFrame();
	
	JButton b = new JButton();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	
	//JButton e = new JButton("e");
	
	JLabel l1 = new JLabel("Please typein the text area.");
	JLabel l2 = new JLabel("note : clicking on the buttons will not input text. Use your keyboard");
	
   String s = ".1234567890-=QWERTYUIOP[]/ASDFGHJKL;'ZXCVBNM,.|";
    String num ="";
	JTextArea  txt = new JTextArea(15,80);
	JButton space = new JButton("         space        ");
	JButton bspace = new JButton("backspace");
	JButton cspace = new JButton("caps");
	JButton tspace = new JButton("tab");
	JButton espace = new JButton("enter");
	JButton sspace = new JButton("shift");
	
	public keyboard() {
		setLayout(new BorderLayout());
		//setLayout(new FlowLayout());
		
		frame.add(p1);
		frame.add(p2);
		
		frame.add(p3);
		p1.add(l1);
		p1.add(l2);
		p2.add(txt);
		p3.add(b);
		bspace.addActionListener(this);
		p3.add(space);
		p3.add(bspace);
		p3.add(cspace);
		p3.add(tspace);
		p3.add(espace);
		p3.add(espace);
		
		

		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);

		for(int i = 0 ; i < s.length(); i++) {
			JButton b = new JButton( " " + s.charAt(i));
			
			p2.add(b);
			b.addActionListener(this);
			
		}
	
		
		
		
		
		setVisible(true);
		setTitle("keyboard");
		setSize(900,550);

		setResizable(false);
		l1.setEnabled(false);
			
			
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		//if(e.getActionCommand().equals("backspace")) {
		//	txt.setText(txt.getText().substring(0,txt.getText().length()-1));
		//}
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("backspace")) {
			txt.setText(txt.getText().substring(0,txt.getText().length()-1));
		}
		else {
		
		num+=b.getText();
		txt.setText(num);}
		
		
		
	}
	public static void main(String [] args) {
		keyboard k = new keyboard();
	}
	
	

}
