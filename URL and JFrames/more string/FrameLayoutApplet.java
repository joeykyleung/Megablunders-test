import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameLayoutApplet extends JFrame implements ActionListener
{
   private JButton red = new JButton("Red");
   private JButton green = new JButton("Green");
   private JButton yellow = new JButton("Yellow");
   private JButton black = new JButton("Black");
   private JButton blue = new JButton("Blue");
   private JButton gray = new JButton("Gray");
   private JLabel  label = new JLabel("   ");
   private JButton bigger = new JButton("bigger");
   private JButton smaller = new JButton("smaller");
   public HalesCanvas canvas = new HalesCanvas();
   
   public JMenuBar menubar = new JMenuBar();			// make a MenuBar wich is a bar that go's across the to of an aplication
   public JMenu filemenu = new JMenu("File", true);
   public JMenuItem get = new JMenuItem("get");
   public JMenuItem put = new JMenuItem("put");
   
   public JTextField text= new JTextField("this is a test");

   
 
   

   public static void main(String args[])
   {
   
      FrameLayoutApplet application = new FrameLayoutApplet("personal info");		// construct a get
      application.resize(600, 600);					// resize the frame
      application.show();								// show the frame
   }


   public  FrameLayoutApplet( String title)
   {
      super(title);
       
     
          // Construct Panels
      JPanel southernPanel = new JPanel();
      JPanel easternPanel = new JPanel();
      JPanel westernPanel = new JPanel();
      JPanel centerPanel = new JPanel();
      JPanel centerPanelA = new JPanel();
      JPanel ceterPanelB =new JPanel();
      JPanel northPanel = new JPanel();
   
   // Setup Action Listener to the  Buttons
      red.addActionListener(this);
      green.addActionListener(this);
      yellow.addActionListener(this);
      black.addActionListener(this);
      blue.addActionListener(this);
      gray.addActionListener(this);
      bigger.addActionListener(this);
      smaller.addActionListener(this);
   
   // Setup Center PanelA
      centerPanelA.setLayout(new GridLayout(2, 3));
      centerPanelA.add(red);
      centerPanelA.add(green);
      centerPanelA.add(yellow);
      centerPanelA.add(black);
      centerPanelA.add(blue);
      centerPanelA.add(gray);
   
   // Setup Center Panel B
      ceterPanelB.setLayout(new GridLayout(1,1));
      canvas.setBackground(Color.white);
      ceterPanelB.add(canvas);
   
   // Setup Center Panel
      centerPanel.setLayout(new GridLayout(2,1));
      centerPanel.add(centerPanelA);
      centerPanel.add(ceterPanelB);
   
   // Setup North Panel
      northPanel.setLayout(new GridLayout(2,1));
      northPanel.add(label);
      label.setText("Black");
      label.setBackground(Color.white);
      northPanel.add(text);
   
   
   // Setup westernPanel
      westernPanel.setLayout(new GridLayout(1,1));
      westernPanel.add(smaller);
   
   // Setup easternPanel
      easternPanel.setLayout(new GridLayout(1,1));
      easternPanel.add(bigger);
   
   //  Finaly put all the panels onto the Applet panel.
      setLayout(new BorderLayout());
      add ("Center", centerPanel);
      add ("North", northPanel);
      add("South",southernPanel);
      add("East",easternPanel);
      add("West",westernPanel);
      get.addActionListener(this);
   
      filemenu.add(get);					// add get to menu
      filemenu.add(put);					// add put to menu
      menubar.add(filemenu);				// add the menu filemenu to the menubar
      setJMenuBar(menubar);
      filemenu.addActionListener(this);
      	
   
   
           
   }


   public void  actionPerformed (ActionEvent e)
   {
      if(e.getSource() == red)
      {
         label.setText("Red");
         canvas.setColor(Color.red);
         canvas.repaint();
         red.hide();
         gray.show();
         blue.show();
         black.show();
         yellow.show();
         green.show();
      }
   
      if(e.getSource() == green)
      {
         label.setText("Green");
         canvas.setColor(Color.green);
         canvas.repaint();
         green.hide();
         gray.show();
         blue.show();
         black.show();
         yellow.show();
         red.show();
      }
   
      if(e.getSource() == yellow)
      {
         label.setText("Yellow");
         canvas.setColor(Color.yellow);
         canvas.repaint();
         yellow.hide();
         gray.show();
         blue.show();
         black.show();
         green.show();
         red.show();
      }
   
      if(e.getSource() == black)
      {
         label.setText("Black");
         canvas.setColor(Color.black);
         canvas.repaint();
         black.hide();
         gray.show();
         blue.show();
         yellow.show();
         green.show();
         red.show();
      }
   
      if (e.getSource() == blue)
      {
         label.setText("Blue");
         canvas.setColor(Color.blue);
         canvas.repaint();
         blue.hide();
         gray.show();
         black.show();
         yellow.show();
         green.show();
         red.show();
      }
   
      if(e.getSource() == gray)
      {
         label.setText("Gray");
         canvas.setColor(Color.gray);
         canvas.repaint();
         gray.hide();
         blue.show();
         black.show();
         yellow.show();
         green.show();
         red.show();
      }
   
      if(e.getSource() == smaller)
      {
         System.out.println("hide");
         canvas.setHeight(-20);
         canvas.setWidth(-20);
         canvas.repaint();
      }
   
      if(e.getSource() == bigger)
      {
         System.out.println("show");
         canvas.setHeight(20);
         canvas.setWidth(20);
         canvas.repaint();
      }
      System.out.println("test");
      if((e.getActionCommand()).equals("get"))
      {
         canvas.setText(text.getText());
         canvas.repaint();
         System.out.println(text.getText());		// get the text from the textfield and print it
      }
   
   }   // end of Action Performed



}  // End of Class
