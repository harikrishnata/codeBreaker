import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessCheck extends JPanel{
    JLabel[] guessCheckUnit;

    public GuessCheck(int codeLength)
    {
        Picture p1 = new Picture("Empty.png");
        guessCheckUnit = new JLabel[codeLength];

        GridLayout guessCheckLayout = new GridLayout(2,(codeLength/2));
        this.setLayout(guessCheckLayout);

        for(int i = 0;i<codeLength;i++)
        {
            guessCheckUnit[i]=new JLabel(p1);
            this.add(guessCheckUnit[i]);
        }
       
    }
}
