import javax.swing.*;
import java.awt.*;

/**
 * This class is the panel of feedback from a single guess
 */
public class GuessCheck extends JPanel
{

    private JLabel[] guessCheckUnit;
    /**
     * Constructor for the panel of feedback from a single guess
    */
    public GuessCheck()
    {
        ImageIcon p1 = new ImageIcon("Empty.png");                                  //creates icons for each element of guess and adds it to panel with grid layout
        guessCheckUnit = new JLabel[driver.getCodeLength()];
        GridLayout guessCheckLayout = new GridLayout(2,(driver.getCodeLength()/2));
        this.setLayout(guessCheckLayout);
        this.setBackground(new Color(146, 101, 0));
        for(int i = 0;i<driver.getCodeLength();i++)
        {
            guessCheckUnit[i]=new JLabel(p1);
            this.add(guessCheckUnit[i]);
        }
    }
    /**
     * Method to change a single panel of the feedback from a single guess
     * @param i which panel to change
     * @param p what icon to change the panel to
    */
    public void changeGuessCheckUnit(int i, ImageIcon p)
    {
        guessCheckUnit[i].setIcon(p);
    }
}
