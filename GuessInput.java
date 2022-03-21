import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This class is the panel containing buttons of all colours to input the guess
 */
public class GuessInput extends JPanel implements ActionListener
{

    private JButton[] colours = new JButton[7];
    private ImageIcon[] colourIcons = new ImageIcon[7];
    private Guess[] g;
    private GuessCheck[] gc;
    private int[] guess=new int[driver.getCodeLength()];
    /**
     * Constructor for the panel containing buttons of all colours to input the guess
     * @param guesses panel containing all guesses
     * @param guessChecks panel containing feedback of all guesses
    */
    public GuessInput(Guess[] guesses, GuessCheck[] guessChecks)
    {
        GridLayout guessInputLayout = new GridLayout(1,7);
        this.setLayout(guessInputLayout);
        for(int x=0;x<7;x++)
        {
            colourIcons[x]=new ImageIcon("Colour_"+x+".png");
            colours[x] = new JButton();
            colours[x].setIcon(colourIcons[x]);
        }
        for(int i=0;i<7;i++)
        {
            (colours[i]).setPreferredSize(new Dimension(100,100));
            this.add(colours[i]);
            (colours[i]).addActionListener(this);
        }
        g=guesses;
        gc=guessChecks;

    }
    /**
     * Changes the current element label of the current guess in guesses panel to the colour of the button pushed by the user
    */    
    public void actionPerformed(ActionEvent e)
    {
        if(driver.done==false)
        {
            if(e.getSource()==colours[0])
            {
                g[driver.getCurrentGuess()].changeGuessUnit(driver.getCurrentElement(),(colourIcons[0]));
                guess[driver.getCurrentElement()]=0;
            }
            if(e.getSource()==colours[1])
            {
                g[driver.getCurrentGuess()].changeGuessUnit(driver.getCurrentElement(),(colourIcons[1]));
                guess[driver.getCurrentElement()]=1;
            }            
            if(e.getSource()==colours[2])
            {
                g[driver.getCurrentGuess()].changeGuessUnit(driver.getCurrentElement(),(colourIcons[2]));
                guess[driver.getCurrentElement()]=2;
            }            
            if(e.getSource()==colours[3])
            {
                g[driver.getCurrentGuess()].changeGuessUnit(driver.getCurrentElement(),(colourIcons[3]));
                guess[driver.getCurrentElement()]=3;
            }            
            if(e.getSource()==colours[4])
            {
                g[driver.getCurrentGuess()].changeGuessUnit(driver.getCurrentElement(),(colourIcons[4]));
                guess[driver.getCurrentElement()]=4;
            }            
            if(e.getSource()==colours[5])
            {
                g[driver.getCurrentGuess()].changeGuessUnit(driver.getCurrentElement(),(colourIcons[5]));
                guess[driver.getCurrentElement()]=5;
            }            
            if(e.getSource()==colours[6])
            {
                g[driver.getCurrentGuess()].changeGuessUnit(driver.getCurrentElement(),(colourIcons[6]));
                guess[driver.getCurrentElement()]=6;
            }            
            driver.setCurrentElement(driver.getCurrentElement()+1);                                              //increments the current element by one every time a button is pressed

            if(driver.getCurrentElement()==(driver.getCodeLength()))
            {
                GuessComparer userGuess = new GuessComparer(guess,gc);
                if(driver.getCurrentGuess()==((driver.getNumOfGuesses())-1)||driver.won==true)                   //checks if the game is over after every guess 
                {
                    driver.done=true;
                    EndScreen E = new EndScreen();
                }          
                driver.setCurrentGuess(driver.getCurrentGuess()+1);                                              //increments the current guess by one every if game is not over     
                driver.setCurrentElement(0);
            }
        }
    }
}