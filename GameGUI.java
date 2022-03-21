import javax.swing.*;
import java.awt.*;

/**
 * This class is the main screen of the game
 */
public class GameGUI extends JFrame
{
    /**
     * Constructor for main screen based on difficulty
     * @param difficulty the difficulty the game
    */
    public GameGUI(int difficulty)
    {
        switch(difficulty)              //choosing code length and number of guesses based on difficulty
        {
            case 0:
                 driver.setCodeLength(3);
                 driver.setNumOfGuesses(6);
                 break;
             case 1:
                 driver.setCodeLength(4);
                 driver.setNumOfGuesses(6);
                 break;
             case 2:
                 driver.setCodeLength(7);
                 driver.setNumOfGuesses(8);
                 break;
        }
        driver.setCode(new int[driver.getCodeLength()]);     //generates random code which the user has to guess
        for(int i = 0;i<(driver.getCodeLength());i++)
        {
            driver.setCodeElement(i,(int)(Math.random() * 7));
            //System.out.println(driver.getCode()[i]);
        }

        JPanel allGuessesPanel = new JPanel();      //initalising elements of GameGUI 
        JPanel allGuessChecksPanel = new JPanel();
        JPanel outerPanel = new JPanel();
        GridLayout allGuessesPanelLayout = new GridLayout((driver.getNumOfGuesses()),1);
        allGuessesPanel.setLayout(allGuessesPanelLayout);
        allGuessChecksPanel.setLayout(allGuessesPanelLayout);

        Guess[] guesses = new Guess[(driver.getNumOfGuesses())];     //creating an array of guesses and guess checkers based on number of guesses and adding it to the GameGUI
        GuessCheck[] guessChecks = new GuessCheck[(driver.getNumOfGuesses())];
        for(int i = 0;i<(driver.getNumOfGuesses());i++)
        {
            guesses[i]=new Guess();
            guesses[i].setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
            allGuessesPanel.add(guesses[i]);
            guessChecks[i]=new GuessCheck();
            allGuessChecksPanel.add(guessChecks[i]);
            guessChecks[i].setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
        }
        GuessInput guessInput = new GuessInput(guesses,guessChecks);    

        outerPanel.setLayout(null);                                     //setting elements of GameGUI based on number of guesses and length of guesses
        outerPanel.setBackground(new Color(146, 101, 0));
        outerPanel.add(allGuessesPanel);
        allGuessesPanel.setSize(driver.getCodeLength()*85, driver.getNumOfGuesses()*84);
        allGuessesPanel.setLocation(0,0);
        outerPanel.add(allGuessChecksPanel);
        allGuessChecksPanel.setSize((driver.getCodeLength())*85/2, (driver.getNumOfGuesses())*84);
        allGuessChecksPanel.setLocation(driver.getCodeLength()*85,0);  
        outerPanel.add(guessInput);
        guessInput.setBackground(new Color(146, 101, 0));
        guessInput.setSize(4*85*3/2,84);
        guessInput.setLocation(0,driver.getNumOfGuesses()*85); 
        this.setContentPane(outerPanel);
        if(driver.getCodeLength()>4)             
        {
            this.setSize(driver.getCodeLength()*85*3/2,(driver.getNumOfGuesses()+1)*85+30);
                
        }
        else
        {
            this.setSize(4*85*3/2,(driver.getNumOfGuesses()+1)*85+30);   
        }
        this.setBackground(new Color(146, 101, 0));
        this.setTitle("Code Breaker");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
