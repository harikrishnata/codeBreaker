import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guess extends JPanel{
    /*
    public JLabel[] guessUnit;
    //public JLabel[] guessCheckUnit;
    int codeLength=4;


    public JPanel guessPanel = new JPanel();  
    public JPanel guessCheckPanel = new JPanel();
    public JPanel totalGuessPanel = new JPanel();

    /*
    public Guess(int codeLength)
    {
        guessUnit = JLabel[codeLength]; 
        codeLength = codeLength;
    }
   

    GridLayout guessPanelLayout = new GridLayout(1,codeLength);
    guessPanel.setLayout(guessPanelLayout);

    Picture p1 = new Picture("Empty.png");

    guessUnit = new JLabel[codeLength];
    for(int i = 0;i<codeLength;i++){
        guessUnit[i]=new JLabel(p1);
        guessPanel.add(guessUnit[i]);
    }
    */




    JLabel[] guessUnit; 


    //public JLabel[] guessCheckUnit;


    //public JPanel guessPanel = new JPanel();  

    //public JPanel guessCheckPanel = new JPanel();
    //public JPanel totalGuessPanel = new JPanel();

    /*
    public Guess(int codeLength)
    {
        guessUnit = JLabel[codeLength]; 
        codeLength = codeLength;
    }
    */



    //guessUnit = new JLabel[codeLength];


    public Guess(int codeLength)
    {
        Picture p1 = new Picture("Empty.png");
        guessUnit = new JLabel[codeLength];

        GridLayout guessLayout = new GridLayout(1,codeLength);
        this.setLayout(guessLayout);

        for(int i = 0;i<codeLength;i++)
        {
            guessUnit[i]=new JLabel(p1);
            (guessUnit[i]).setPreferredSize(new Dimension(100,100));
            this.add(guessUnit[i]);
        }
       
    }




}