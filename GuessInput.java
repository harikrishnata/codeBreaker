import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessInput extends JPanel{ //implements ActionListener{
    JButton[] colours = new JButton[7];
    public GuessInput(){
        GridLayout guessInputLayout = new GridLayout(1,7);
        this.setLayout(guessInputLayout);
        ImageIcon red = new ImageIcon("Colour_0.png");
        ImageIcon orange = new ImageIcon("Colour_1.png");
        ImageIcon yellow = new ImageIcon("Colour_2.png");
        ImageIcon green = new ImageIcon("Colour_3.png");
        ImageIcon blue = new ImageIcon("Colour_4.png");
        ImageIcon indigo = new ImageIcon("Colour_5.png");
        ImageIcon violet = new ImageIcon("Colour_6.png");
        colours[0] = new JButton(red);
        colours[1]= new JButton(orange);
        colours[2]=new JButton(yellow);
        colours[3]=new JButton(green);
        colours[4]=new JButton(blue);
        colours[5]=new JButton(indigo);
        colours[6]=new JButton(violet);
        for(int i=0;i<7;i++){
            (colours[i]).setPreferredSize(new Dimension(100,100));
            this.add(colours[i]);
        }

    }
}