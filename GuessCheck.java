import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessCheck extends JPanel{
    JLabel[] guessCheckUnit;

    public GuessCheck()
    {
        Picture p1 = new Picture("Empty.png");
        guessCheckUnit = new JLabel[GameGUI.codeLength];

        GridLayout guessCheckLayout = new GridLayout(2,(GameGUI.codeLength/2));
        this.setLayout(guessCheckLayout);
        this.setBackground(new Color(146, 101, 0));

        for(int i = 0;i<GameGUI.codeLength;i++)
        {
            guessCheckUnit[i]=new JLabel(p1);
            //(guessCheckUnit[i]).setPreferredSize(new Dimension(100,100));
            this.add(guessCheckUnit[i]);
        }
       
    }

}
