import java.awt.*;

public class HalesCanvas extends Canvas
{
   public Color c;
   public int height=20;
   public int width=20;
   public String word[] = new String [100];
   public int xpos;
   public int ypos;
   public int x = 0;
   public int wordCount = 0;

   //public URLClass strings[] = new URLClass [100];


   public void paint(Graphics g)
   {
      System.out.println("paint canvas");
      g.setColor(c);
      for(int x = 0; x<wordCount; x++)
      {
         g.drawString(word[x],10, 20*x+10);
      }
   	//g.fillRect(100,20,height,width);
   }


   public void setColor(Color co)
   {
      c = co;
   }


   public void setHeight(int h)
   {
      height = height + h;
   }

   public void setText(String s,int pxpos, int pypos)
   {
      xpos = pxpos;
      ypos = pypos;
      word[wordCount]=s;
      wordCount++;
      repaint();
   }
   public void setWidth(int w)
   {
      width = width + w;
   }
}