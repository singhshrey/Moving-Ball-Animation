import java.awt.*;
import java.applet.*;
import java.lang.Thread;
import java.lang.*;

public class Animation extends Applet 
{
	Thread t;
	int i;
	int x=80,y=80,dx=20,dy=40;

	public void init()
	{
		t=new Thread();
	}
	public void paint(Graphics g)
	{
		for(i=0;i<2;i++)
		{
			g.fillOval(x,y,40,40); 
			g.setColor(Color.red);
 			if(y >= 500 || y <= 0)
			{
				dy=-dy;
			}
			if(x >= 500 || x <= 0)
			{
				dx=-dx;
			}
			y=y-dy;	
			x=x-dx;
			repaint();

			try
			{
				t.sleep(100);
			}
			catch(Exception e)
			{}
		}
	}

	public static void main(String args[])
	{
		Animation mb=new Animation();
	}
}