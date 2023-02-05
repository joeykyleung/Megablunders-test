import java.awt.*;

public class HalesCanvas extends Canvas
{
	public Color c;
	public int height=20;
	public int width=20;
   public String word= "this is cool";


	public void paint(Graphics g)
	{
		System.out.println("paint canvas");
		g.setColor(c);
      g.drawString(word,10,10);
		g.fillRect(100,20,height,width);
	}


	public void setColor(Color co)
	{
		c = co;
	}


	public void setHeight(int h)
	{
		height = height + h;
	}

   public void setText(String s)
   {
      word=s;
   }
	public void setWidth(int w)
	{
		width = width + w;
	}
}