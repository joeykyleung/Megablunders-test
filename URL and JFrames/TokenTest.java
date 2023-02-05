import java.applet.Applet;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

public class TokenTest extends Applet implements ActionListener
{
   Label prompt;
   Label question;
   TextField input;
   TextField megablunderinput;
   TextArea output;
   String DELIM=" ";
   private int count;
   private JButton word[];
   private String result[];
   private JButton go = new JButton("go");
   private String megablunder;
   private int wordCount=0;
 
   public void init(){
      
      setLayout(new GridLayout(3,1));
      
      megablunderinput = new TextField(50);
      megablunderinput.addActionListener(this);
      megablunderinput.setText("Type megablunder in here");
      
      go.addActionListener(this);
      add(megablunderinput);
      add(go);
   }

   public void actionPerformed(ActionEvent e)
   {     
      if(e.getSource() == go)
      {
         setLayout(new GridLayout(3,1));
         megablunder = new String(megablunderinput.getText());
         prompt=new Label("MEGABLUNDERS");
         question = new Label(megablunder);
         input= new TextField(50);
         input.addActionListener(this);
         input.setText("Type correct word here");
         output = new TextArea(10,50);
         output.setEditable(false);
         setSize(950,600);
      
         result = megablunder.split("\\s");
         word = new JButton[result.length];
         for(int x=0; x<word.length; x++)
         {
            word[x] = new JButton();
         }
         for (int x=0; x<result.length; x++)
         {
            word[wordCount] = new JButton(result[x]);
            word[wordCount].addActionListener(this);
            wordCount++;
         }
      
         JPanel northPanel = new JPanel();
         northPanel.setLayout(new GridLayout(3,1));
         northPanel.add(prompt);
         northPanel.add(question);
         northPanel.add(input);
      
         JPanel words = new JPanel();
         for(int x=0; x<word.length; x++)
         {
            words.add(word[x]);
         }
      
         JPanel textfield = new JPanel();
         textfield.add(output);
               
         add(northPanel);
         add(words);
         add(textfield);
      
         remove(megablunderinput);
         remove(go);
      }
      
      for(int y=0; y<word.length; y++)
      {
         if(e.getSource() == word[y])
         {
            String temp = megablunder;
            if(y == word.length-1)
            {
               temp = temp.replaceAll(result[y],input.getText());
            }
            else
            {
               temp = temp.replaceAll(result[y]+" ",input.getText()+" ");
            }
            output.append(temp);
            output.setText("");
         }
      }
   }
}
