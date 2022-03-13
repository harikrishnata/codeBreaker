import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameGUI extends JFrame{

    static int codeLength;
    static int numOfGuesses;

    Guess[] guesses;
    GuessCheck[] guessChecks;
    GuessInput guessInput;

    JPanel allGuessesPanel = new JPanel();
    JPanel allGuessChecksPanel = new JPanel();


    JPanel outerPanel = new JPanel();


    public GameGUI(int difficulty)
    {
        switch(difficulty)
        {
            case 0:
                codeLength=3;
                numOfGuesses=6;
                break;
            case 1:
                codeLength=4;
                numOfGuesses=6;
                break;
            case 2:
                codeLength=6;
                numOfGuesses=8;
                break;
        }

        GridLayout allGuessesPanelLayout = new GridLayout(numOfGuesses,1);
        allGuessesPanel.setLayout(allGuessesPanelLayout);

        GridLayout allGuessChecksPanelLayout = new GridLayout(numOfGuesses,1);
        allGuessChecksPanel.setLayout(allGuessChecksPanelLayout);

        guesses = new Guess[numOfGuesses];
        guessChecks = new GuessCheck[numOfGuesses];

        for(int i = 0;i<numOfGuesses;i++)
        {
            guesses[i]=new Guess();
            allGuessesPanel.add(guesses[i]);
            guessChecks[i]=new GuessCheck();
            allGuessChecksPanel.add(guessChecks[i]);
        }

        guessInput = new GuessInput(guesses);


        outerPanel.setLayout(null);

        outerPanel.add(allGuessesPanel);
        allGuessesPanel.setSize(codeLength*85, numOfGuesses*85);
        allGuessesPanel.setLocation(0,0);

        outerPanel.add(allGuessChecksPanel);
        allGuessChecksPanel.setSize(codeLength*85/2, numOfGuesses*85);
        allGuessChecksPanel.setLocation(codeLength*85,0);        

        outerPanel.add(guessInput);
        guessInput.setSize(codeLength*85*3/2,85);
        guessInput.setLocation(0,numOfGuesses*85); 


        this.setContentPane(outerPanel);
        this.setSize(codeLength*85*3/2,(numOfGuesses+1)*85+30);
        this.setTitle("Code Breaker");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
