import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * This class is the end screen of the game
 */
public class EndScreen extends JFrame implements ActionListener 
{

    private JButton b1=new JButton("PLAY AGAIN");       //buttons in end screen
    private JButton b2=new JButton("QUIT");
    /**
     * Constructor for the end screen
    */
    public EndScreen()
    {
        JTextField t;
        if(driver.won)                                                  //chooses what to display on end screen depending on if the user has won or not
        {
            t = new JTextField("YAY YOU GUESSED CORRECTLY USING "+((driver.getCurrentGuess())+1)+" GUESSES"); 
        }
        else
        {
            t = new JTextField("SORRY YOU COULDN'T GUESS THE CODE");
        }
        JPanel outer = new JPanel();                                     //setting elements of end screen
        JPanel inner = new JPanel();
        Font font1 = new Font("Big Carlson", Font.BOLD, 35);
        t.setFont(font1);
        t.setEditable(false);
        t.setHorizontalAlignment(JTextField.CENTER);
        Font font2 = new Font("Big Carlson",Font.PLAIN, 20);
        b1.setFont(font2);
        b2.setFont(font2);
        BorderLayout outLayout = new BorderLayout();
        outer.setLayout(outLayout);
        FlowLayout inLayout = new FlowLayout();
        inner.setLayout(inLayout);
        inner.add(b1);
        inner.add(b2);  
        b1.addActionListener(this);
        b2.addActionListener(this);
        outer.add("South",inner);
        outer.add("North",t);
        this.setContentPane(outer);
        this.setSize(1000,125);
        this.setTitle("Code Breaker");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    /**
     * Determines what the buttons do when they are pressed
    */    
    public void actionPerformed(ActionEvent e)
    {
        this.dispose();                                                   //closes end scrren and game gui
        driver.G.dispose();
        if(e.getSource()==b1)                                             //opens a new game if the user wants to 
        {
            driver.setCurrentElement(0);                                  //resets the current guess and current element of the guess
            driver.setCurrentGuess(0);
            driver.done=false;                                            //resets booleans to determine if the game is over
            driver.won=false;
            TitleScreen T = new TitleScreen();
        }
    }   
}
