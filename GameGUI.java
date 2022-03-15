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
                codeLength=7;
                numOfGuesses=8;
                break;
        }
        driver.code = new int[codeLength];
        for(int i = 0;i<codeLength;i++){
            driver.code[i]=(int)(Math.random() * 7);
            System.out.println(driver.code[i]);
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
            guesses[i].setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
            allGuessesPanel.add(guesses[i]);
            guessChecks[i]=new GuessCheck();
            allGuessChecksPanel.add(guessChecks[i]);
            guessChecks[i].setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
        }

        guessInput = new GuessInput(guesses,guessChecks);


        outerPanel.setLayout(null);

        outerPanel.add(allGuessesPanel);
        allGuessesPanel.setSize(codeLength*85, numOfGuesses*84);
        allGuessesPanel.setLocation(0,0);

        outerPanel.add(allGuessChecksPanel);
        allGuessChecksPanel.setSize(codeLength*85/2, numOfGuesses*84);
        allGuessChecksPanel.setLocation(codeLength*85,0);  
        allGuessChecksPanel.setBackground(Color.ORANGE);
      

        //allGuessChecksPanel.setBackground(Color.ORANGE);
        //allGuessesPanel.setBackground(Color.ORANGE);
        guessInput.setBackground(new Color(146, 101, 0));

        outerPanel.add(guessInput);
        guessInput.setSize(4*85*3/2,84);
        guessInput.setLocation(0,numOfGuesses*85); 

        outerPanel.setBackground(new Color(146, 101, 0));

        this.setContentPane(outerPanel);


        if(codeLength>4)
        {
            this.setSize(codeLength*85*3/2,(numOfGuesses+1)*85+30);
        }
        else
        {
            this.setSize(4*85*3/2,(numOfGuesses+1)*85+30);    
        }



        this.setBackground(new Color(146, 101, 0));
        this.setTitle("Code Breaker");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
