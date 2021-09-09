//imports
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//objects
public class Window implements ActionListener{
	JLabel box;
	JButton button;
	JFrame frame;
	JPasswordField pass;
	JLabel box2;
	Window()
	{
		 //This is setting up all the contents of the frame
		 frame = new JFrame();
		 button = new JButton("Click me to start virus search");
		 box = new JLabel("                 Insert your password below to delete virus");
		 pass = new JPasswordField();
		 
		frame.add(pass);
		frame.add(box);
		frame.add(button);
		box.setBounds(0, 0, 300, 50);
		button.setBounds(50, 50, 300, 50);
		button.addActionListener(this);
		frame.setLayout(null);
		frame.setSize(400, 225);
		frame.setVisible(true);
		frame.setTitle("The Anti-Virus");
		pass.setBounds(50, 100, 300, 50);

	}
	
	//Action code making a cause and effect
	@Override
	public void actionPerformed(ActionEvent e)
	{
		box.setText("                                  HAHAHA you have a virus now!");
		button.setVisible(false);
		pass.setVisible(false);
		frame.getContentPane().setBackground(Color.red);
	}
}
