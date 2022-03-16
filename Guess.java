import javax.swing.*;
import java.awt.*;


public class Guess extends JPanel
{

    private JLabel[] guessUnit; 
    
    public Guess()
    {
        ImageIcon p1 = new ImageIcon("Empty.png");                      //creates icons for each element of guess and adds it to panel
        guessUnit = new JLabel[driver.codeLength];
        GridLayout guessLayout = new GridLayout(0,driver.codeLength);
        this.setLayout(guessLayout);
        this.setBackground(new Color(146, 101, 0));
        for(int i = 0;i<driver.codeLength;i++)
        {
            guessUnit[i]=new JLabel(p1);
            this.add(guessUnit[i]);

        }
    }

    public void changeGuessUnit(int i, ImageIcon p)
    {
        guessUnit[i].setIcon(p);
    }
}