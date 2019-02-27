/**
 * 
 * @author jeremy
 * Period 6
 *
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class Man extends JComponent
{
	private Ellipse2D.Double head;
	private Rectangle leftArm, rightArm, leftLeg, rightLeg, torso;
	
	public Man(int x, int y)
	{
		this.setLocation(x, y);
		this.setSize(31, 56);
		
		head = new Ellipse2D.Double(10, 0, 10, 10);
		torso = new Rectangle(12, 10, 5, 10);
		leftArm = new Rectangle(5, 10, 5, 5);
		rightArm = new Rectangle(20, 10, 5, 5);
		rightLeg = new Rectangle(17, 20, 2, 5);
		leftLeg = new Rectangle(10, 20, 2, 5);
	}
	
	public void drawShapes(Graphics2D g2, Shape ...s)
	{
		for(Shape currentShape : s)
		{
			g2.fill(currentShape);
			g2.draw(currentShape);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		drawShapes(g2, head, torso, leftArm, rightArm, rightLeg, leftLeg);
	}
}
