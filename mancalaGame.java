//Import stuff
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import javax.swing.JButton;
//##=##=##=##=##=##=##=##=##=##=##=##=##=##=##=##=##=##=##=##=##//
public class mancalaGame extends JFrame {
 public static boolean gameOver = false; //checks if the game is over, controls the loop below
 // selectedPit is the variable to find which button was clicked.
 // When it is set to 1000, the loop doesnt run.
 // It is used to find selected pit AND control whether a player has selected something yet
 static int selectedPit = 1000;
 // checks whose turn it is, true means player one, false means player two
 public static boolean playerOneTurn = true;
 // scores
 public static int playerOneScore = 0;
 public static int playerTwoScore = 0;
 // keeps all the numbers of rocks in each pit
 public static int[] pitsNumbers = new int[12];
 // Declare the buttons!
 public static JButton button;
 public static JButton buttonTwo;
 public static JButton buttonThree;
 public static JButton buttonFour;
 public static JButton buttonFive;
 public static JButton buttonSix;
 public static JButton buttonSeven;
 public static JButton buttonEight;
 public static JButton buttonNine;
 public static JButton buttonTen;
 public static JButton buttonEleven;
 public static JButton buttonTwelve;
 public mancalaWindow one = new mancalaWindow(); // declare mancalaWindow (seperate class)
 // make a new game!
 public mancalaGame() {
   // set layout to null so i can assign coordinates to buttons when need be
   one.setLayout(null);
   // assign the buttons!
   button = new JButton("");
   buttonTwo = new JButton("");
   buttonThree = new JButton("");
   buttonFour = new JButton("");
   buttonFive = new JButton("");
   buttonSix = new JButton("");
   buttonSeven = new JButton("");
   buttonEight = new JButton("");
   buttonNine = new JButton("");
   buttonTen = new JButton("");
   buttonEleven = new JButton("");
   buttonTwelve = new JButton("");
   //assign button positions and sizes!
   button.setBounds(220, 85, 40, 40);
   buttonTwo.setBounds(280, 85, 40, 40);
   buttonThree.setBounds(340, 85, 40, 40);
   buttonFour.setBounds(420, 85, 40, 40);
   buttonFive.setBounds(480, 85, 40, 40);
   buttonSix.setBounds(540, 85, 40, 40);
   buttonSeven.setBounds(220, 475, 40, 40);
   buttonEight.setBounds(280, 475, 40, 40);
   buttonNine.setBounds(340, 475, 40, 40);
   buttonTen.setBounds(420, 475, 40, 40);
   buttonEleven.setBounds(480, 475, 40, 40);
   buttonTwelve.setBounds(540, 475, 40, 40);
   // add the buttons to the UI!
   one.add(button);
   one.add(buttonTwo);
   one.add(buttonThree);
   one.add(buttonFour);
   one.add(buttonFive);
   one.add(buttonSix);
   one.add(buttonSeven);
   one.add(buttonEight);
   one.add(buttonNine);
   one.add(buttonTen);
   one.add(buttonEleven);
   one.add(buttonTwelve);
   // declare events for each button
   event e = new event();
   eventTwo eTwo = new eventTwo();
   eventThree eThree = new eventThree();
   eventFour eFour = new eventFour();
   eventFive eFive = new eventFive();
   eventSix eSix = new eventSix();
   eventSeven eSeven = new eventSeven();
   eventEight eEight = new eventEight();
   eventNine eNine = new eventNine();
   eventTen eTen = new eventTen();
   eventEleven eEleven = new eventEleven();
   eventTwelve eTwelve = new eventTwelve();
   // set the action listener for each button using the different events
   button.addActionListener(e);
   buttonTwo.addActionListener(eTwo);
   buttonThree.addActionListener(eThree);
   buttonFour.addActionListener(eFour);
   buttonFive.addActionListener(eFive);
   buttonSix.addActionListener(eSix);
   buttonSeven.addActionListener(eSeven);
   buttonEight.addActionListener(eEight);
   buttonNine.addActionListener(eNine);
   buttonTen.addActionListener(eTen);
   buttonEleven.addActionListener(eEleven);
   buttonTwelve.addActionListener(eTwelve);
   // repains the mancala window so the buttons come up
   one.repaint();
  }
  //***** These are the action listeners for the buttons *****//
 public class event implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   if (playerOneTurn) {
    // this is a player one button, so check if it is player one's turn
    // play out the turn with the selected pit as 0 for this button
    playTurn(0);
    one.repaint();
    // repaint the stuff and then switch it to player two's turn
    playerOneTurn = !playerOneTurn;
   } else {
    //if it isnt player one's turn, then set the status string in the manclaWindow to:
    // "you are pressing the wrong button!" and then repaint so that string pops up
    mancalaWindow.status = "You are pressing the wrong button!";
    one.repaint();








   }
  }
 }
 public class eventTwo implements ActionListener {
  public void actionPerformed(ActionEvent eTwo) {
   if (playerOneTurn) {
    playTurn(1);
    one.repaint();
    playerOneTurn = !playerOneTurn;
   } else {
    mancalaWindow.status = "You are pressing the wrong button!";
    one.repaint();








   }
  }
 }
 public class eventThree implements ActionListener {
  public void actionPerformed(ActionEvent eThree) {
   if (playerOneTurn) {
    playTurn(2);
    one.repaint();
    playerOneTurn = !playerOneTurn;
   } else {
    mancalaWindow.status = "You are pressing the wrong button!";
    one.repaint();








   }
  }
 }
 public class eventFour implements ActionListener {
  public void actionPerformed(ActionEvent eFour) {
   if (playerOneTurn) {
    playTurn(3);
    one.repaint();
    playerOneTurn = !playerOneTurn;
   } else {
    mancalaWindow.status = "You are pressing the wrong button!";
    one.repaint();








   }
  }
 }
 public class eventFive implements ActionListener {
  public void actionPerformed(ActionEvent eFive) {
   if (playerOneTurn) {
    playTurn(4);
    one.repaint();
    playerOneTurn = !playerOneTurn;
   } else {
    mancalaWindow.status = "You are pressing the wrong button!";
    one.repaint();








   }
  }
 }
 public class eventSix implements ActionListener {
  public void actionPerformed(ActionEvent eSix) {
   if (playerOneTurn) {
    playTurn(5);
    one.repaint();
    playerOneTurn = !playerOneTurn;
   } else {
    mancalaWindow.status = "You are pressing the wrong button!";
    one.repaint();








   }
  }
 }
 public class eventSeven implements ActionListener {
  public void actionPerformed(ActionEvent eSeven) {
   if (!playerOneTurn) {
    playTurn(6);
    one.repaint();
    playerOneTurn = !playerOneTurn;
   } else {








    mancalaWindow.status = "You are pressing the wrong button!";
    one.repaint();








   }
  }
 }
 public class eventEight implements ActionListener {
  public void actionPerformed(ActionEvent eEight) {
   if (!playerOneTurn) {
    playTurn(7);
    one.repaint();
    playerOneTurn = !playerOneTurn;
   } else {
    mancalaWindow.status = "You are pressing the wrong button!";
    one.repaint();








   }
  }
 }
 public class eventNine implements ActionListener {
  public void actionPerformed(ActionEvent eNine) {
   if (!playerOneTurn) {
    playTurn(8);
    one.repaint();
    playerOneTurn = !playerOneTurn;
   } else {
    mancalaWindow.status = "You are pressing the wrong button!";
    one.repaint();








   }
  }
 }
 public class eventTen implements ActionListener {
  public void actionPerformed(ActionEvent eTen) {
   if (!playerOneTurn) {
    playTurn(9);
    one.repaint();
    playerOneTurn = !playerOneTurn;
   } else {
    mancalaWindow.status = "You are pressing the wrong button!";
    one.repaint();








   }
  }
 }
 public class eventEleven implements ActionListener {
  public void actionPerformed(ActionEvent eEleven) {
   if (!playerOneTurn) {
    playTurn(10);
    one.repaint();
    playerOneTurn = !playerOneTurn;
   } else {
    mancalaWindow.status = "You are pressing the wrong button!";
    one.repaint();








   }
  }
 }
 public class eventTwelve implements ActionListener {
  public void actionPerformed(ActionEvent eTwelve) {   
   /*
    if (eTwelve.getSource.equals(button1)) {


    } else if (eTwelve.getSource.equals(button2)) {


    }
    */
   if (!playerOneTurn) {
    playTurn(11);
    one.repaint();
    playerOneTurn = !playerOneTurn;
   } else {
    mancalaWindow.status = "You are pressing the wrong button!";
    one.repaint();








   }
  }
 }
 //***** END OF the action listeners for the buttons *****//
 //|||MAIN|||//
 public static void main(String[] args) {
   //at the start of the game, set all pits numbers to four to reset the game!
   for (int i = 0; i < 12; i++) {
    pitsNumbers[i] = 4;
   }
   // set the array that keeps track of the UI for the pit numbers equal to the pitsNumbers
   for (int i = 0; i < 12; i++) {
    // the numbers array in mancalaWindow is a string array, so convert from INT to string
    mancalaWindow.numbers[i] = Integer.toString(pitsNumbers[i]);
   }
   // make a new GAME
   mancalaGame one = new mancalaGame();








   for (int i = 0; i < 12; i++) {
    pitsNumbers[i] = 4;
   }
   for (int i = 0; i < 12; i++) {
    mancalaWindow.numbers[i] = Integer.toString(pitsNumbers[i]);
   }
   //once the game is set up, run a loop
   while (true) {
    //continuously replace the numbers with the new numbers and replace!
    for (int i = 0; i < 12; i++) {
     mancalaWindow.numbers[i] = Integer.toString(pitsNumbers[i]);
    }
    one.repaint();
   }








  }
  //the turn function, uses selectedPit as a parameter and is called by actionListeners that are attatched to buttons
 public void playTurn(int selectedPit) {
  //make sure the game isnt over
  if (!gameOver) {








   //move the moncala pieces here!
   //do player one stuff
   //--<<O>>--<<O>>--<<O>>--<<O>>-START OF PLAYER ONE TURN-<<O>>--<<O>>--<<O>>--<<O>>--//
   if (playerOneTurn == true) {
    int endPit = 6;
    //reset all numbers
    for (int i = 0; i < 12; i++) {
     pitsNumbers[i] = Integer.valueOf(mancalaWindow.numbers[i]);
    }
    //System.out.print(pitsNumbers[selectedPit]);
    //make a counter variable to keep track of and store the amount of rocks in the selectedPit
    int counter = pitsNumbers[selectedPit];
    //Empty the selectedPit
    pitsNumbers[selectedPit] = 0;
    // for player one, go left, so subtract from the selected pit and take away one from counter
    //also, add to the pits as it subtracts.
    //as long as i is more than or equal to 0, AKA if it is still in range of the pits (0-5), keep adding stuff
    for (int i = selectedPit - 1; i >= 0; i--) {
     //only run if there are rocks left, AKA if counter > 0
     if (counter > 0) {
      // add to the pit number one rock.
      pitsNumbers[i] += 1;
      if (counter == 1) {
       endPit = i;
      }
      counter -= 1;
     }
    }
    // now after it has reached the left side of the board, check if there are rocks left. if there are...
    if (counter > 0) {
     // add one to player score
     playerOneScore += 1;
     //add one to the p1 score in the Window class
     mancalaWindow.P1Score += 1;
     //take away a rock
     counter -= 1;
     if (counter == 0) {
      // NOW, if the players gets exactly enough rocks to get to the end, they are permitted another turn.
      // It switches the playerOneTurn varibale to player one, because it was switched after the button was pressed
      playerOneTurn = !playerOneTurn;
     }
    }
    // set a new temporary counter and set it to counter, even if it is just zero
    int tempcounter = counter;
    // if it is less than 6, then perform the simple action of going to the right on the bottom row.
    if (tempcounter < 6) {
     for (int i = 0; i < tempcounter; i++) {
      pitsNumbers[6 + i] += 1;
      counter -= 1;
     }
    }
    // if it is not less than six,
    else {
     // make a temp counter for the temp counter.
     int temptempcounter = tempcounter;
     // run the for loop until temptempcounter is exactly six, so it fills the bottom row.
     for (int i = 0; i < 100; i++) {
      if (temptempcounter > 6) {
       temptempcounter -= 1;
      }
     }
     // it fills the bottom row, start again with the remaining temptempcounter at the bottom row
     for (int i = 0; i < temptempcounter; i++) {
      pitsNumbers[6 + i] += 1;
      counter -= 1;
     }
    }
    // it subtracts from the original conter 6 times, and set temp counter to that.
    if (counter > 0) {
     tempcounter = counter;
     // run until tempcounter, and until counter runs out on THE TOP ROW
     for (int i = 0; i < tempcounter; i++) {
      pitsNumbers[5 - i] += 1;
      if (counter == 1) {
       endPit = i;
      }
      counter -= 1;
     }
    }
    // check that the pit was originally 0, and is now 1
    if (pitsNumbers[endPit] == 1 && endPit <= 5) {
     assignEndPit(endPit);
    }
    //--<<O>>--<<O>>--<<O>>--<<O>>-END OF PLAYER ONE TURN-<<O>>--<<O>>--<<O>>--<<O>>--//
    //.oOo.oOo.oOo.oOo.oOo.oOo.oOo.START OF PLAYER TWO TURN.oOo.oOo.oOo.oOo.oOo.oOo.oOo.//
   } else if (!playerOneTurn) {




    int endPitTwo = 0;
    int counterTwo = pitsNumbers[selectedPit];
    pitsNumbers[selectedPit] = 0;
    //from 6 until 11
    for (int i = selectedPit + 1; i <= 11; i++) {
     if (counterTwo > 0) {
      pitsNumbers[i] += 1;
      if (counterTwo == 1) {
       endPitTwo = i;
      }
      counterTwo -= 1;
     }
    }
    if (counterTwo > 0) {
     playerTwoScore += 1;
     mancalaWindow.P2Score += 1;
     counterTwo -= 1;
     if (counterTwo == 0) {
      playerOneTurn = !playerOneTurn;
     }
    }
    int tempcounterTwo = counterTwo;
    //from 5 to 0
    if (tempcounterTwo < 6) {
     for (int i = 0; i < tempcounterTwo; i++) {
      pitsNumbers[5 - i] += 1;
      counterTwo -= 1;
     }
    } else {








     int temptempcounterTwo = tempcounterTwo;
     for (int i = 0; i < 100; i++) {
      if (temptempcounterTwo > 6) {
       temptempcounterTwo -= 1;
      }
     }
     //from 5 to zero with excess to go around AGAIN
     for (int i = 0; i < temptempcounterTwo; i++) {
      pitsNumbers[5 - i] += 1;
      counterTwo -= 1;
     }
    }
    //dealing with excess here
    tempcounterTwo = counterTwo;
    for (int i = 0; i < tempcounterTwo; i++) {
     pitsNumbers[6 + i] += 1;
     if (counterTwo == 1) {
      endPitTwo = i;
     }
     counterTwo -= 1;
    }
    if (pitsNumbers[endPitTwo] == 1 && endPitTwo >= 6) {
     assignEndPit(endPitTwo);
    }
   }
   //.oOo.oOo.oOo.oOo.oOo.oOo.oOo.END OF PLAYER TWO TURN.oOo.oOo.oOo.oOo.oOo.oOo.oOo.//








   //RESET all the numbers
   for (int i = 0; i < 12; i++) {
    mancalaWindow.numbers[i] = Integer.toString(pitsNumbers[i]);
   }
   if (!playerOneTurn) {
    //send whose turn it is to display on the window
    mancalaWindow.whoseTurnIsIt = "One";
   } else {
    mancalaWindow.whoseTurnIsIt = "Two";
   }




  }
  //ending of turn
  //*** Reset all the numbers ***//
  for (int i = 0; i < 12; i++) {
   mancalaWindow.numbers[i] = Integer.toString(pitsNumbers[i]);
   System.out.print(pitsNumbers[i]);
  }
  for (int i = 0; i < 12; i++) {
   mancalaWindow.numbers[i] = Integer.toString(pitsNumbers[i]);
  }
  // check if game over is true with counter
  int gameOverCounter = 0;
  // go over each pit and check the amount of rocks in it. add one to counter if it is empty
  // if the gameOverCounter == 6, then everything added to 0 and the players side is empty.
  for (int i = 0; i < 6; i++) {
   if (pitsNumbers[i] == 0) {
    gameOverCounter += 1;
   }
  }
  if (gameOverCounter == 6) {
   gameOver = true; // gameOver is true for player 1, so player one sweeps and gets all the remaining points
   for (int i = 6; i < 12; i++) {
    mancalaWindow.P1Score += pitsNumbers[i];
   }
  } else {
   gameOverCounter = 0;
  }
  // check gameOver for player two positions
  for (int i = 6; i < 12; i++) {
   if (pitsNumbers[i] == 0) {
    gameOverCounter += 1;
   }
  }
  if (gameOverCounter == 6) {
   gameOver = true; // if player two finishes, player two sweeps
   for (int i = 6; i < 12; i++) {
    mancalaWindow.P2Score += pitsNumbers[i];
   }
  } else {
   gameOverCounter = 0;
  }
}
 public void assignEndPit(int x) {
  int alternateEndPit;
  if (x <= 5) { //aka from player One
   alternateEndPit = x + 6;
   pitsNumbers[x] = 0;
   mancalaWindow.P1Score += pitsNumbers[alternateEndPit] + 1;
   pitsNumbers[alternateEndPit] = 0;
  } else { //aka player Two
   alternateEndPit = x - 6;
   pitsNumbers[x] = 0;
   mancalaWindow.P2Score += pitsNumbers[alternateEndPit] + 1;
   pitsNumbers[alternateEndPit] = 0;
  }
 }
}