import javax.swing.*;
import java.awt.*;


public class GuessCheck extends JPanel
{

    private JLabel[] guessCheckUnit;

    public GuessCheck()
    {
        ImageIcon p1 = new ImageIcon("Empty.png");                                  //creates icons for each element of guess and adds it to panel
        guessCheckUnit = new JLabel[driver.codeLength];
        GridLayout guessCheckLayout = new GridLayout(2,(driver.codeLength/2));
        this.setLayout(guessCheckLayout);
        this.setBackground(new Color(146, 101, 0));
        for(int i = 0;i<driver.codeLength;i++)
        {
            guessCheckUnit[i]=new JLabel(p1);
            this.add(guessCheckUnit[i]);
        }
    }
    public void changeGuessCheckUnit(int i, ImageIcon p)
    {
        guessCheckUnit[i].setIcon(p);
    }
}
