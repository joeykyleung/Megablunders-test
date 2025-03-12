import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.net.*;
import java.io.*;

/**
 * A class that represents a URL link with its associated properties and rendering information.
 * This class stores both the URL text and its visual representation coordinates for
 * rendering in the GUI.
 */
public class URLClass implements ActionListener
{
   /**
    * Properties for storing URL information and rendering details
    */
   public int height;
   public int xpos;
   public int ypos;
   public Rectangle rec; 	
   public String text;

   /**
    * Constructor that initializes a new URL object with position and text
    * @param ptext The URL text to display
    * @param pxpos The x-coordinate position for rendering
    * @param pypos The y-coordinate position for rendering
    */
   public URLClass (String ptext,int pxpos, int pypos)
   {
      height = 1;
      text = ptext;
      xpos = pxpos;
      ypos = pypos;
      rec = new Rectangle(xpos, ypos, 150, 25);
   }
   
   /**
    * Handles action events (currently unused)
    * @param e The action event to handle
    */
   public void  actionPerformed (ActionEvent e)
   { 
      
   }
}