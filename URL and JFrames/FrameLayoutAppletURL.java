import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.net.*;
import java.io.*;

/**
 * Main application class that implements a URL link extractor with a graphical interface.
 * This class provides functionality to fetch and display links from web pages using
 * Java Swing components and custom rendering.
 */
public class FrameLayoutAppletURL extends JFrame implements ActionListener, MouseMotionListener, MouseListener
{
   private JButton getlink = new JButton("Get Link");
   private JButton search = new JButton("Search");
   private JLabel  label = new JLabel("   ");
   private TextField input = new TextField(50);
   private TextField searchfield = new TextField(30);
   public HalesCanvas output = new HalesCanvas();
   //private TextArea output = new TextArea();
   
   private String links = new String(" ");

   private URLClass outputlinks[];
   private int outputlinkCount = 0;
   
   public JMenuBar menubar = new JMenuBar();
   public JMenu filemenu = new JMenu("File", true);
   public JMenuItem get = new JMenuItem("get");
   public JMenuItem put = new JMenuItem("put");

   public int x=0;

   /**
    * Main entry point for the application
    * @param args Command line arguments (not used)
    */
   public static void main(String args[])
   {
      FrameLayoutAppletURL application = new FrameLayoutAppletURL("personal info");
      application.resize(600, 600);
      application.show();
   }

   /**
    * Constructor that initializes the GUI components and sets up the layout
    * @param title The title of the application window
    */
   public  FrameLayoutAppletURL( String title)
   {
      super(title);
   
      JPanel panel1 = new JPanel();
      JPanel panel1a = new JPanel();
      JPanel panel1b = new JPanel();
   
      getlink.addActionListener(this);
      search.addActionListener(this);
   
      setLayout(new GridLayout(2,1));
     
      panel1.setLayout(new GridLayout(2,1));
      panel1a.add(input);
      input.setText("http://www.milton.edu");
      panel1a.add(getlink);
      panel1.add(panel1a);
      searchfield.setText("Search Input");
      panel1b.add(searchfield);
      panel1b.add(search);
      panel1.add(panel1b);
      
      output.setBackground(Color.white);
      
      
      add(panel1);
      add(output);
      
   
      filemenu.add(get);
      filemenu.add(put);
      menubar.add(filemenu);
      setJMenuBar(menubar);
      filemenu.addActionListener(this); 
   }

   /**
    * Reads and processes URLs from the input field.
    * Extracts links from the HTML content and displays them in the canvas.
    */
   public void readURL()
   {
      try {
         URL homeMilton = new URL(input.getText());
         DataInputStream dis = new DataInputStream(homeMilton.openStream());
      
         String line = dis.readLine();
         outputlinks = new URLClass [100];
               
         while (x<100)
         {
            x++;
            line = dis.readLine();
            
            if(line.indexOf("href") != -1)
            {
               //System.out.println((line.substring((line.indexOf("href")+6),(line.indexOf("/>")-2))+"\n"));
               links = line.substring((line.indexOf("href")+6),(line.indexOf("/>")-2));
               
               outputlinks[outputlinkCount]= new URLClass(links,10, 20*outputlinkCount+10);
               
               //System.out.println(outputlinks[outputlinkCount].text);
               
               output.setText(outputlinks[outputlinkCount].text,10, 20*outputlinkCount+10);
               outputlinkCount++;
               output.repaint();
            }         
         }
      }
      catch (Exception e)
      {
         System.out.println("Error:" + e.getMessage());
      }
   }
   
   /**
    * Handles action events from buttons and menu items
    * @param e The action event to handle
    */
   public void  actionPerformed (ActionEvent e)
   { 
      //output.repaint();
      
      if(e.getSource() == getlink)
      {
         readURL();
      }
      if(e.getSource() == search)
      {
         for(int x=0;x<outputlinkCount;x++)
         {
         
            System.out.println(outputlinks[x].xpos+"  "+outputlinks[x].ypos);
         
         }
      }
   } 
   
   // Mouse event handler implementations
   public void mouseMoved(MouseEvent e) {
   
   }

   public void mouseDragged(MouseEvent e) {
   
   }

   public void mouseReleased(MouseEvent e) {
   
   }

   public void mousePressed(MouseEvent e) {
   
   }

   public void mouseEntered(MouseEvent e) {
   
   }

   public void mouseExited(MouseEvent e) {
   
   }

   /**
    * Handles mouse click events on the canvas
    * Detects if a link was clicked and processes the interaction
    * @param e The mouse event containing click coordinates
    */
   public void mouseClicked(MouseEvent e) 
   {
      int mouseX = e.getX();
      int mouseY = e.getY();
      
      for(int x=0; x<outputlinkCount; x++)
      {
         if (outputlinks[x].rec.contains(mouseX, mouseY)) 
         {
            System.out.println("link clicked");
         }
      }
   }
} 
