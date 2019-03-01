/**
 * 
 * @author jeremy
 * Period 6
 *
 */
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Window extends JFrame implements KeyListener
{
	
	Man man;
	int x;
	int y;
	
	boolean up, down, left, right;

	public Window()
	{
		x = 300;
		y = 200;
		
		man = new Man(x, y);
		
		setLayout(null);
		setBounds(200, 100, 400, 600);
		setBackground(Color.BLUE);
		add(man);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		addKeyListener(this);
	}
	
	Timer timer = new Timer(100, new ActionListener()
	{
		
	});
	
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W)
		{
			
			if(y >= 5)
			{
				this.y -= 5;
				man.setLocation(x, y);
				repaint();
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			if(y <= 525)
			{
				y += 5;
				man.setLocation(x, y);
				repaint();
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			if(x >= 0)
			{
				x -= 5;
				man.setLocation(x, y);
				repaint();
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			if(x <= 350)
			{
				x += 5;
				man.setLocation(x, y);
				repaint();
			}
		}
		
	}
	
	public void keyTyped(KeyEvent e)
	{
		
	}
	
	public void keyReleased(KeyEvent e)
	{
		
	}
	public static void main(String[] args)
	{
		new Window();
	}
}
