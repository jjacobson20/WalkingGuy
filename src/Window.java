/**
 * 
 * @author jeremy
 * Period 6
 *
 */
import java.awt.Color;
import javax.swing.JFrame;

public class Window extends JFrame
{
	public Window()
	{
		JFrame frame = new JFrame();
		Man man = new Man(300, 200);
		frame.setLayout(null);
		frame.setBounds(200, 100, 400, 600);
		frame.setBackground(Color.BLUE);
		frame.add(man);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Window();
	}
}
