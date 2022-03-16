import javax.swing.*;
import java.awt.*;


public class GameGUI extends JFrame
{

    public GameGUI(int difficulty)
    {
        switch(difficulty)              //choosing code length and number of guesses based on difficulty
        {
            case 0:
                setCodeLength(3);
                setNumOfGuesses(6);
                break;
            case 1:
                setCodeLength(4);
                setNumOfGuesses(6);
                break;
            case 2:
                setCodeLength(6);
                setNumOfGuesses(8);
                break;
        }

        driver.code = new int[getCodeLength()];     //generates random code which the user has to guess
        for(int i = 0;i<getCodeLength();i++)
        {
            driver.code[i]=(int)(Math.random() * 7);
            System.out.println(driver.code[i]);
        }

        JPanel allGuessesPanel = new JPanel();      //setting elements of GameGUI 
        JPanel allGuessChecksPanel = new JPanel();
        JPanel outerPanel = new JPanel();
        GridLayout allGuessesPanelLayout = new GridLayout(getNumOfGuesses(),1);
        allGuessesPanel.setLayout(allGuessesPanelLayout);
        allGuessChecksPanel.setLayout(allGuessesPanelLayout);

        Guess[] guesses = new Guess[getNumOfGuesses()];     //creating an array of guesses and guess checkers based on number of guesses and adding it to the GameGUI
        GuessCheck[] guessChecks = new GuessCheck[getNumOfGuesses()];
        for(int i = 0;i<getNumOfGuesses();i++)
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
        allGuessesPanel.setSize(driver.codeLength*85, getNumOfGuesses()*84);
        allGuessesPanel.setLocation(0,0);
        outerPanel.add(allGuessChecksPanel);
        allGuessChecksPanel.setSize(getCodeLength()*85/2, getNumOfGuesses()*84);
        allGuessChecksPanel.setLocation(getCodeLength()*85,0);  
        outerPanel.add(guessInput);
        guessInput.setBackground(new Color(146, 101, 0));
        guessInput.setSize(4*85*3/2,84);
        guessInput.setLocation(0,getNumOfGuesses()*85); 
        this.setContentPane(outerPanel);
        if(driver.codeLength>4)             
        {
            this.setSize(getCodeLength()*85*3/2,(getNumOfGuesses()+1)*85+30);
        }
        else
        {
            this.setSize(4*85*3/2,(getNumOfGuesses()+1)*85+30);    
        }
        this.setBackground(new Color(146, 101, 0));
        this.setTitle("Code Breaker");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void setCodeLength(int i)       //setter for code length
    {
        driver.codeLength=i;
    }
    private int getCodeLength()             //getter for code length
    {
        return driver.codeLength;
    } 
    private void setNumOfGuesses(int i)     //setter for number of guesses
    {
        driver.numOfGuesses=i;
    }
    private int getNumOfGuesses()           //setter for number of guesses
    {
        return driver.numOfGuesses;
    }  
}
