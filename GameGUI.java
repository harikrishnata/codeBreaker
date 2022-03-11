import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameGUI extends JFrame{ //implements ActionListener {

    int codeLength;
    int numOfGuesses;

    JLabel[] guess;
    JLabel[] guessCheck;

    JButton[] colourSelect = new JButton[6];

    JPanel guessPanel;
    JPanel guessCheckPanel;

    JPanel colourSelectPanel;

    JFrame frame;

    public GameGUI(int difficulty)
    {
        switch(difficulty)
        {
            case 0:
                codeLength=4;
                numOfGuesses=6;
                break;
            case 1:
                codeLength=4;
                numOfGuesses=6;
                break;
            case 2:
                codeLength=4;
                numOfGuesses=6;
                break;
        }

        GridLayout guessPanelLayout = new GridLayout(codeLength,1);
        guessPanel.setLayout(guessPanelLayout);

        Picture p1 = new Picture("Empty.png");
        JLabel l1 = new JLabel(p1);

        guess = new JLabel[codeLength];
        for(int i = 0;i<codeLength;i++){
            guess[i]=l1;
            guessPanel.add(guess[i]);
        }

        frame.setContentPane(guessPanel);

        frame.setSize(400,125);
        frame.setTitle("Code Breaker");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JPanel[] guessPanel = ;

    }
}
