import java.awt.*;

/**
 * Custom Canvas implementation for rendering URL links and text content.
 * This class extends Canvas to provide specialized rendering capabilities
 * for the URL link extractor application.
 */
public class HalesCanvas extends Canvas
{
   /**
    * Properties for storing rendering state
    */
   public Color c;
   public int height=20;
   public int width=20;
   public String word[] = new String [100];
   public int xpos;
   public int ypos;
   public int x = 0;
   public int wordCount = 0;

   //public URLClass strings[] = new URLClass [100];

   /**
    * Overridden paint method to handle custom rendering
    * @param g Graphics context for rendering
    */
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

   /**
    * Sets the color for rendering
    * @param co Color to use for rendering
    */
   public void setColor(Color co)
   {
      c = co;
   }

   /**
    * Adjusts the height of the rendering area
    * @param h Amount to adjust height by
    */
   public void setHeight(int h)
   {
      height = height + h;
   }

   /**
    * Sets text to be rendered at specified coordinates
    * @param s Text to render
    * @param pxpos X-coordinate for rendering
    * @param pypos Y-coordinate for rendering
    */
   public void setText(String s,int pxpos, int pypos)
   {
      xpos = pxpos;
      ypos = pypos;
      word[wordCount]=s;
      wordCount++;
      repaint();
   }

   /**
    * Adjusts the width of the rendering area
    * @param w Amount to adjust width by
    */
   public void setWidth(int w)
   {
      width = width + w;
   }
}