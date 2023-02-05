import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.net.*;
import java.io.*;

public class URLClass implements ActionListener
{
   public int height;
   public int xpos;
   public int ypos;
   public Rectangle rec; 	
   public String text;

   public URLClass (String ptext,int pxpos, int pypos)
   {
      height = 1;
      text = ptext;
      xpos = pxpos;
      ypos = pypos;
      rec = new Rectangle(xpos, ypos, 150, 25);
   }
   
   public void  actionPerformed (ActionEvent e)
   { 
      
   }
}