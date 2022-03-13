import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessInput extends JPanel implements ActionListener{
    JButton[] colours = new JButton[7];
    ImageIcon[] colourIcons = new ImageIcon[7];
    Guess[] g;

    public GuessInput(Guess[] guesses){
        GridLayout guessInputLayout = new GridLayout(1,7);
        this.setLayout(guessInputLayout);
        for(int x=0;x<7;x++)
        {
            colourIcons[x]=new ImageIcon("Colour_"+x+".png");
            colours[x] = new JButton(colourIcons[x]);
        }
        for(int i=0;i<7;i++){
            (colours[i]).setPreferredSize(new Dimension(100,100));
            this.add(colours[i]);
            (colours[i]).addActionListener(this);
        }
        //codeLength=codeLengthL;
        g=guesses;

    }
    public void actionPerformed(ActionEvent e)
    {
        //System.out.println("4567");
            if(e.getSource()==colours[0])
            {
                g[driver.currentGuess].guessUnit[driver.currentElement].setIcon(colourIcons[0]);
            }
            if(e.getSource()==colours[1])
            {
                g[driver.currentGuess].guessUnit[driver.currentElement].setIcon(colourIcons[1]);
            }            
            if(e.getSource()==colours[2])
            {
                g[driver.currentGuess].guessUnit[driver.currentElement].setIcon(colourIcons[2]);
            }            
            if(e.getSource()==colours[3])
            {
                g[driver.currentGuess].guessUnit[driver.currentElement].setIcon(colourIcons[3]);
            }            
            if(e.getSource()==colours[4])
            {
                g[driver.currentGuess].guessUnit[driver.currentElement].setIcon(colourIcons[4]);
            }            
            if(e.getSource()==colours[5])
            {
                g[driver.currentGuess].guessUnit[driver.currentElement].setIcon(colourIcons[5]);
            }            
            if(e.getSource()==colours[6])
            {
                g[driver.currentGuess].guessUnit[driver.currentElement].setIcon(colourIcons[6]);
            }            
        (driver.currentElement)++;
        if(driver.currentElement==(GameGUI.codeLength))
        {
            //System.out.println("aaa");
            driver.currentGuess++;
            driver.currentElement=0;

        }


    }
}