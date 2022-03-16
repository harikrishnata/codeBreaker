import javax.swing.*;
import java.awt.*;


public class Guess extends JPanel
{

    public JLabel[] guessUnit; 
    
    public Guess()
    {
        ImageIcon p1 = new ImageIcon("Empty.png");
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
}