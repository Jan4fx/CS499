import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import javax.swing.*;
import java.awt.Color;

public class GUI extends JDialog implements ActionListener {
    
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;
   JButton button;

   public GUI(){
      prepareGUI();
   }

   public static void main(String[] args){
      GUI  swingControlDemo = new GUI();  
      swingControlDemo.showButtonDemo();      
   }

   private void prepareGUI(){
      mainFrame = new Frame("FREE MONEY NOT A SCAM");
      mainFrame.setSize(800,800);
      //Text color is Blue
      mainFrame.setForeground(Color.BLUE);
      mainFrame.setLayout(new GridLayout(4, 3));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(500,250);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showButtonDemo(){
      headerLabel.setText("NOT A SCAM PLEASE DO NOT REPORT US"); 

      //Creating the Buttons
      Button helloWorldButton = new Button("Hello World");
      Button sendButton = new Button("Send");
      Button freeMoneyButton = new Button("FREE MONEY");

      setLayout(new GridLayout(3, 1));
      add(new Checkbox("one", null, true));

      helloWorldButton.setActionCommand("Hello World");
      sendButton.setActionCommand("Send");
      freeMoneyButton.setActionCommand("FREE MONEY");
      //Creating the Checkbox
      Checkbox signature = new Checkbox("By checking box you waive rights to sue or reports us :)");

      helloWorldButton.addActionListener(this);
      sendButton.addActionListener(this);
      freeMoneyButton.addActionListener(this);  

      //Adding buttons and checkbox to the panel
      controlPanel.add(helloWorldButton);
      controlPanel.add(sendButton);
      controlPanel.add(freeMoneyButton);
      controlPanel.add(signature);     



      mainFrame.setVisible(true);  
   }
   //Radio Buttons displaying text when clicked
   @Override
   public void actionPerformed(ActionEvent e) {
      String command = e.getActionCommand();  
      if( command.equals( "Hello World" ))  {
         statusLabel.setText("Hello World!");
      }
      else if( command.equals( "Send" ))  {
         statusLabel.setText("Sent!"); 
      }
      else  {
         statusLabel.setText("FREE MONEY");
      }  	
   }
}