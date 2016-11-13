import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
public class gameOverWIndow extends JFrame{
    public String winner = "";
    public gameOverWIndow(){
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setLayout(null);
    setTitle("Restart?");
    setContentPane(new DrawPane());
    setSize(300,200);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocation((screenSize.width/2)-150, (screenSize.height/2)-100);
    setResizable(false);
       setVisible(true);
       repaint();
 
  }
  /*public static void main(String[] args){
      gameOverWIndow one = new gameOverWIndow();
  }*/
  class DrawPane extends JPanel{
    public void paintComponent(Graphics g){
       g.drawString("Player "+ winner + " wins!", 50, 50);
  }


}
}