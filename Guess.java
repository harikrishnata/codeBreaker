import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guess extends JPanel{

    JLabel[] guessUnit; 
    
    public Guess()
    {
        Picture p1 = new Picture("Empty.png");
        guessUnit = new JLabel[GameGUI.codeLength];

        GridLayout guessLayout = new GridLayout(0,GameGUI.codeLength);
        this.setLayout(guessLayout);



        for(int i = 0;i<GameGUI.codeLength;i++)
        {
            guessUnit[i]=new JLabel(p1);
            //(guessUnit[i]).setPreferredSize(new Dimension(100,100));
            this.add(guessUnit[i]);

        }
       
    }




}