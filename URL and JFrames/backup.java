import java.applet.Applet;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class backup extends Applet implements ActionListener
{
   Label prompt;
   Label question;
   TextField input;
   TextArea output;
   String DELIM=" ";
   private int count;
   private JButton word[];
   private String result[];
   private JButton go = new JButton("go");
   private String megablunder;
   private int wordCount=0;
 
   public void init(){
   
      megablunder = new String("Dr. Fernon is one of those professors who seem distracted most of the time.");
      prompt=new Label("MEGABLUNDERS");
      question = new Label(megablunder);
      input= new TextField(50);
      input.addActionListener(this);
      input.setText("Type correct word here");
      output = new TextArea(10,100);
      output.setEditable(false);
      setSize(950,600);
      
      go.addActionListener(this);
   
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
      textfield.add(go);
   
      setLayout(new GridLayout(3,1));
      add(northPanel);
      add(words);
      add(textfield);
   }

   public void actionPerformed(ActionEvent e)
   {     
      if(e.getSource() == go)
      {
         String stringToTokenize = megablunder;
         StringTokenizer tokens = new StringTokenizer( stringToTokenize,DELIM);
         output.setText("");
      
         while (tokens.hasMoreTokens())
         {
            output.append(tokens.nextToken()+"\n");
         }
      }
      
      for(int y=0; y<word.length; y++)
      {
         if(e.getSource() == word[y])
         {
            String temp = megablunder;
            temp = temp.replace(result[y]+" ",input.getText()+" ");
            output.append(temp);
            output.setText("");
         }
      }
      if(e.getSource() != word[8])
      {
         output.append("\n");
         output.append("WRONG, Try Again!");
      }
   }
}
