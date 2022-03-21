import javax.swing.*;
import java.awt.*;

/**
 * This class is the panel of a single guess
 */
public class Guess extends JPanel
{

    private JLabel[] guessUnit; 
    /**
    * Constructor for the panel of a single guess
    */   
    public Guess()
    {
        ImageIcon p1 = new ImageIcon("Empty.png");                      //creates icons for each element of guess and adds it to panel with grid layout
        guessUnit = new JLabel[driver.getCodeLength()];
        GridLayout guessLayout = new GridLayout(0,driver.getCodeLength());
        this.setLayout(guessLayout);
        this.setBackground(new Color(146, 101, 0));
        for(int i = 0;i<driver.getCodeLength();i++)
        {
            guessUnit[i]=new JLabel(p1);
            this.add(guessUnit[i]);

        }
    }
    /**
     * Method to change a single panel of the feedback from a single guess
     * @param i which panel to change
     * @param p what icon to change the panel to
    */
    public void changeGuessUnit(int i, ImageIcon p)
    {
        guessUnit[i].setIcon(p);
    }
}