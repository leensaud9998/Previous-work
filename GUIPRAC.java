package GUI;
import javax.swing.*;
import java.awt.*;

public class GUIPRAC {
	
	private JFrame frame = new JFrame();// initialize the frame  (السفرة)
	private JPanel panel1 = new JPanel();//initialize the panel 1 (الصحن الاول)
	private JPanel panel2 = new JPanel();//initialize the panel 2 (الصحن الثاني)
	
	private JLabel label1 = new JLabel("label ");//initialize the components in panel 1 (الاكل داخل الصحن الاول)
	private JTextField feild1 = new JTextField("text");//initialize the components in panel 1 (الاكل داخل الصحن الاول)
	
	private JButton button1 = new JButton("button 1");///initialize the components in panel 2 (الاكل داخل الصحن الثاني)
	private JButton button2 = new JButton("button 2");///initialize the components in panel 2 (الاكل داخل الصحن الثاني)
	private JButton button3 = new JButton("button 3");///initialize the components in panel 2 (الاكل داخل الصحن الثاني)
	
	public GUIPRAC() {  // all my work is in  the constructor,, we can also put it in a method,but we have to call the method

		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		
		
		panel1.setLayout(flow);
		panel2.setLayout(flow);
		
		
	
		panel1.add(label1);
		panel1.add(feild1);
		
	
		
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		
		frame.add(panel1);
		frame.add(panel2);
		
		frame.setTitle("my GUI");
		
		frame.setSize(320,120);
		
		frame.setVisible(true);
		
	}
	

}
  // we can put the main here instead of creating a new class for the main
