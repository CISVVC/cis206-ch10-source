import javax.swing.JFrame;

/**
   This program demonstrates how to install an action listener
   as an inner class.
*/
public class Main
{  
   public static void main(String[] args)
   {  
      JFrame frame = new ButtonFrame2();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
