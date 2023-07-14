package GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener{
	
	private JFrame frame = new JFrame();
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	String s = "c<+7894561230-/.*=";
	String num =" ";
	
	private JTextField txt = new JTextField(18);
	//JLabel on = new JLabel("on");
	//JLabel off = new JLabel("off");
	
	
	private JRadioButton r1 = new JRadioButton("on");
	private JRadioButton r2 = new JRadioButton("off");
	ButtonGroup r3 =  new ButtonGroup();
	//private JButton arrow = new JButton();
	private JButton c = new JButton("3");
	
	
	//private JButton plus = new JButton("+");
	//private JButton seven = new JButton("7");
	//private JButton eight = new JButton("8");
	//private JButton nine = new JButton("9");
	//private JButton minus = new JButton("-");
	
	
	//private JButton four = new JButton("4");
	//private JButton five = new JButton("5");
	//private JButton six = new JButton("6");
	//private JButton multiply = new JButton("*");
	
	
	//private JButton one = new JButton("1");
	//private JButton two = new JButton("2");
	//private JButton three = new JButton("3");
	//private JButton div = new JButton("/");
	
	//private JButton zero = new JButton("0");
	//private JButton dot = new JButton(".");
	//private JButton equals = new JButton("=");
	
	
	
	@SuppressWarnings("static-access")
	public calculator() {
		
		setLayout(new BorderLayout());
		p2.setLayout(new FlowLayout());
		//txt.setEditable(false);
		p1.add(txt);
		r3.add(r1);
		r3.add(r2);
		p2.add(c);
	   c.addActionListener(this);

		add(p1,BorderLayout.NORTH);
		p2.add(r1);
		r1.addActionListener(this);
	    
		
		p2.add(r2);
		r2.addActionListener(this);
		
		
		for(int i = 0 ; i < s.length(); i++) {
			JButton b = new JButton( " " + s.charAt(i));
		    
			b.addActionListener(this);
			p2.add(b);
			
		}
		
		add(p2,BorderLayout.CENTER);
		setTitle("my calculator");
		setVisible(true);
		setResizable(false);
		setSize(260,350);
		
	}



	



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("off")) {
			c.setEnabled(false);}
			
			if(e.getActionCommand().equals("on")) {
				c.setEnabled(false);
			
		}
		JButton b = (JButton) e.getSource();
		 num+=b.getText();
		b.addActionListener(this);
		
			
			
		
	}

	

	public static void main(String [] args) {
		calculator c = new calculator();
	}


	
	

}
