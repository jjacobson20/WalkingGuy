/**
 * 
 * @author jeremy
 * Period 6
 *
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Window extends JFrame implements KeyListener
{
	
	Man man;
	int dx;
	int dy;
	ArrayList<Bullet> bullets = new ArrayList<Bullet>();
	
	boolean up, down, left, right;

	public Window()
	{
		dx = 300;
		dy = 200;
		
		man = new Man(dx, dy);
		
		setLayout(null);
		setBounds(200, 100, 400, 600);
		add(man);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		timer.start();
		addKeyListener(this);
	}
	
	Timer timer = new Timer(2, new ActionListener()
	{	
		public void actionPerformed(ActionEvent e)
		{
			if(bullets.size() > 0)
			{
				for(Bullet bullet : bullets)
				{
					bullet.setLocation(5, 5);
				}
			}
			
			if(up)
			{
				if(dy >= 5)
				{
					dy -= 2;
				}
			}
			
			if(down)
			{
				if(dy <= 525)
				{
					dy += 2;
					
				}
			}
			
			if(left)
			{
				if(dx >= 0)
				{
					dx -= 2;
				}
			}
				
			if(right)
			{
				if(dx <= 350)
				{
					dx += 2;
				}
			}
			
			man.setLocation(dx, dy);
			repaint();
		}
	});
	
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_SPACE) 
		{
			bullets.add(new Bullet(dx, dy));
			
		}
		
		if(e.getKeyCode() == KeyEvent.VK_UP) up = true;

		if(e.getKeyCode() == KeyEvent.VK_DOWN) down = true;
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT) left = true;
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) right = true;
	}
	
	public void keyTyped(KeyEvent e)
	{
		
	}
	
	public void keyReleased(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_UP) up = false;
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN) down = false;
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT) left = false;
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) right = false;
	}
	
	public static void main(String[] args)
	{
		new Window();
	}
}
