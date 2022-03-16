import javax.swing.*;
import java.awt.*;


public class GameGUI extends JFrame
{

    public GameGUI(int difficulty)
    {
        switch(difficulty)
        {
            case 0:
                driver.codeLength=3;
                driver.numOfGuesses=6;
                break;
            case 1:
                driver.codeLength=4;
                driver.numOfGuesses=6;
                break;
            case 2:
                driver.codeLength=7;
                driver.numOfGuesses=8;
                break;
        }

        driver.code = new int[driver.codeLength];
        for(int i = 0;i<driver.codeLength;i++)
        {
            driver.code[i]=(int)(Math.random() * 7);
            System.out.println(driver.code[i]);
        }

        JPanel allGuessesPanel = new JPanel();
        JPanel allGuessChecksPanel = new JPanel();
        JPanel outerPanel = new JPanel();
        GridLayout allGuessesPanelLayout = new GridLayout(driver.numOfGuesses,1);
        allGuessesPanel.setLayout(allGuessesPanelLayout);
        allGuessChecksPanel.setLayout(allGuessesPanelLayout);

        Guess[] guesses = new Guess[driver.numOfGuesses];
        GuessCheck[] guessChecks = new GuessCheck[driver.numOfGuesses];
        for(int i = 0;i<driver.numOfGuesses;i++)
        {
            guesses[i]=new Guess();
            guesses[i].setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
            allGuessesPanel.add(guesses[i]);
            guessChecks[i]=new GuessCheck();
            allGuessChecksPanel.add(guessChecks[i]);
            guessChecks[i].setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
        }
        GuessInput guessInput = new GuessInput(guesses,guessChecks);

        outerPanel.setLayout(null);
        outerPanel.setBackground(new Color(146, 101, 0));
        outerPanel.add(allGuessesPanel);
        allGuessesPanel.setSize(driver.codeLength*85, driver.numOfGuesses*84);
        allGuessesPanel.setLocation(0,0);
        outerPanel.add(allGuessChecksPanel);
        allGuessChecksPanel.setSize(driver.codeLength*85/2, driver.numOfGuesses*84);
        allGuessChecksPanel.setLocation(driver.codeLength*85,0);  
        outerPanel.add(guessInput);
        guessInput.setBackground(new Color(146, 101, 0));
        guessInput.setSize(4*85*3/2,84);
        guessInput.setLocation(0,driver.numOfGuesses*85); 
        this.setContentPane(outerPanel);
        if(driver.codeLength>4)
        {
            this.setSize(driver.codeLength*85*3/2,(driver.numOfGuesses+1)*85+30);
        }
        else
        {
            this.setSize(4*85*3/2,(driver.numOfGuesses+1)*85+30);    
        }
        this.setBackground(new Color(146, 101, 0));
        this.setTitle("Code Breaker");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
