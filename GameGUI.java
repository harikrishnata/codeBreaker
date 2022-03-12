import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameGUI extends JFrame{ //implements ActionListener {

    int codeLength;
    int numOfGuesses;

    Guess[] guesses;
    GuessCheck[] guessChecks;

    //JLabel[] guess;
    //JLabel[] guessCheck;

    //JButton[] colourSelect = new JButton[6];

    //JPanel guessPanel = new JPanel();
    //JPanel guessCheckPanel = new JPanel();
    //JPanel totalGuessPanel = new JPanel();

    //JPanel[] guessPanel;
    //JPanel[] guessCheckPanel;
    //JPanel[] totalGuessPanel;


    JPanel allGuessesPanel = new JPanel();


    //JPanel colourSelectPanel = new JPanel();


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
                numOfGuesses=10;
                break;
        }

        /*GridLayout guessPanelLayout = new GridLayout(1,codeLength);
        guessPanel.setLayout(guessPanelLayout);

        Picture p1 = new Picture("Empty.png");

        guess = new JLabel[codeLength];
        for(int i = 0;i<codeLength;i++){
            guess[i]=new JLabel(p1);
            guessPanel.add(guess[i]);
        }


        GridLayout guessCheckPanelLayout = new GridLayout(2,(codeLength/2));
        guessCheckPanel.setLayout(guessCheckPanelLayout);

        guessCheck = new JLabel[codeLength];
        for(int i = 0;i<codeLength;i++){
            guessCheck[i]=new JLabel(p1);
            guessCheckPanel.add(guessCheck[i]);
        }

        JPanel totalGuessPanel = new JPanel();

        GridLayout totalGuessPanelLayout = new GridLayout(1,2);
        totalGuessPanel.setLayout(totalGuessPanelLayout);
        totalGuessPanel.setBackground(Color.red);

        totalGuessPanel.add(guessPanel);
        totalGuessPanel.add(guessCheckPanel);*/

        //guessPanel = new JPanel[numOfGuesses];
        //guessCheckPanel = new JPanel[numOfGuesses];
        //totalGuessPanel = new JPanel[numOfGuesses]; 



        //totalGuess(0);
        //totalGuess(1);

        GridLayout allGuessesPanelLayout = new GridLayout(numOfGuesses,2);
        allGuessesPanel.setLayout(allGuessesPanelLayout);

        guesses = new Guess[numOfGuesses];
        guessChecks = new GuessCheck[numOfGuesses];
        //allGuessesPanel.add(totalGuessPanel[0]);
        //allGuessesPanel.add(totalGuessPanel[1]);

        //Guess g1 = new Guess(codeLength);

        for(int i = 0;i<numOfGuesses;i++)
        {
            guesses[i]=new Guess(codeLength);
            allGuessesPanel.add(guesses[i]);
            guessChecks[i]=new GuessCheck(codeLength);
            allGuessesPanel.add(guessChecks[i]);
        }

        //Guess g1 = new Guess(codeLength);
        //allGuessesPanel.add(g1);

        this.setContentPane(allGuessesPanel);

        this.setSize(400,125);
        this.setTitle("Code Breaker");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JPanel[] guessPanel = ;

    }
    /*
    public void totalGuess(int guessNo){
        
        GridLayout guessPanelLayout = new GridLayout(1,codeLength);
        (guessPanel[guessNo]).setLayout(guessPanelLayout);

        Picture p1 = new Picture("Empty.png");

        guess = new JLabel[codeLength];
        for(int i = 0;i<codeLength;i++){
            guess[i]=new JLabel(p1);
            (guessPanel[guessNo]).add(guess[i]);
        }


        GridLayout guessCheckPanelLayout = new GridLayout(2,(codeLength/2));
        (guessCheckPanel[guessNo]).setLayout(guessCheckPanelLayout);

        guessCheck = new JLabel[codeLength];
        for(int i = 0;i<codeLength;i++){
            guessCheck[i]=new JLabel(p1);
            (guessCheckPanel[guessNo]).add(guessCheck[i]);
        }


        GridLayout totalGuessPanelLayout = new GridLayout(1,2);
        (totalGuessPanel[guessNo]).setLayout(totalGuessPanelLayout);
        (totalGuessPanel[guessNo]).setBackground(Color.red);

        (totalGuessPanel[guessNo]).add(guessPanel[guessNo] );
        (totalGuessPanel[guessNo]).add((guessCheckPanel[guessNo]));


    }
    */
}
