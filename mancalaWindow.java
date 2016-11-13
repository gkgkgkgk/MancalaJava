import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class mancalaWindow extends JFrame{
  Graphics graphics;
  public static String whoseTurnIsIt = "One";
  public static String status  = "";
  public static String[] numbers =  new String[12];
  public static int P1Score = 0;
  public static int P2Score = 0;
  private JButton button;
  public mancalaWindow(){
    setLayout(null);
    setTitle("Mancala");
 
    setContentPane(new DrawPane());
    setSize(800, 600);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
   setVisible(true); 
  }
  class DrawPane extends JPanel{
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      setBackground(Color.BLACK);
      g.setColor(Color.white);
      g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
      g.drawString("MANCALA", 0, 50);
       g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
      g.drawString("It is player "+whoseTurnIsIt+"'s turn!", 0, 75);
      g.fillRect(100, 100, 600, 400);
      g.setColor(Color.RED);
      //making pits. Board starts at approximately 100. the end pits are 350 tall, 100 wide.
      // pits start at x: 100. y = 600/2, 300 - 175 = 125
      g.fillRect(100, 125, 100, 350);
      // END PIT RIGHT: x = 700-100=600
      g.fillRect(600, 125, 100, 350);
      //dividers (optional)
      /*g.setColor(Color.BLACK);
      g.fillRect(380, 100, 1, 400);
      g.fillRect(420, 100, 1, 400);*/
      //the regular pits have from 200 to 600. there are six on top and bottom.
      //pits are in between 200 and 600, and two sections. So, section one is 200 to 380, and 420 to 600.
      //each pit will have 60, so the pit will be 40 by 40 with 20 px spaces in between
      g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
      g.drawString("Player One",0, 125);
      g.drawString("Player Two",700, 475);
      g.setFont(new Font("TimesRoman", Font.PLAIN, 15));
      g.drawString(status,0, 550);
      //draw scores:
      g.setColor(Color.WHITE);
      g.drawString("1: "+P1Score,100, 300);
      g.drawString("2: "+P2Score,600, 300);
      g.setColor(Color.RED);
      //top row
      for(int i = 0; i < 3; i++){
        g.fillRect(220+(i*60), 125, 40, 40);
      }
      for(int i = 0; i < 3; i++){
        g.fillRect(420+(i*60), 125, 40, 40);
      }
      //bottom row
      for(int i = 0; i < 3; i++){
        g.fillRect(220+(i*60), 435, 40, 40);
      }
      for(int i = 0; i < 3; i++){
        g.fillRect(420+(i*60), 435, 40, 40);
      }
      //for the numbers in the pits:
      g.setColor(Color.BLACK);
      g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
      //top 0,1,2,3,4,5 (l to r)
      for(int i = 0; i<3; i++){
      g.drawString(numbers[i],220+(i*60), 150);
      }
      for(int i = 3; i<6; i++){
      g.drawString(numbers[i],420+((i-3)*60), 150);
      }
      //bottom 6,7,8,9,10,11 (l to r)
      for(int i = 6; i<9; i++){
      g.drawString(numbers[i],220+((i-6)*60), 460);
      }
      for(int i = 9; i<12; i++){
      g.drawString(numbers[i],420+((i-9)*60), 460);
      }
 
    }
  }
 
}
