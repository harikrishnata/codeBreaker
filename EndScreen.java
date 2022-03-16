import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EndScreen extends JFrame implements ActionListener 
{

    private JButton b1=new JButton("PLAY AGAIN");
    private JButton b2=new JButton("QUIT");

    public EndScreen(int i)
    {
        JTextField t;
        if(i==1)
        {
            t = new JTextField("YAY YOU GUESSED CORRECTLY USING "+((driver.currentGuess)+1)+" GUESSES");
        }
        else
        {
            t = new JTextField("SORRY YOU COULDN'T GUESS THE CODE");
        }
        JPanel outer = new JPanel();
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
    public void actionPerformed(ActionEvent e)
    {
        this.dispose();
        driver.G.dispose();
        if(e.getSource()==b1)
        {
            driver.currentElement=0;
            driver.currentGuess=0;
            driver.done=false;
            driver.won=false;
            TitleScreen T = new TitleScreen();
        }
    }   
}
