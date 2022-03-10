import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TitleScreen extends JFrame implements ActionListener {
    JTextField t = new JTextField("CODE BREAKER");

    JFrame frame;
    JPanel outer;
    JPanel inner;

    JButton b1=new JButton("EASY");
    JButton b2=new JButton("MEDIUM");
    JButton b3=new JButton("HARD");

    public TitleScreen()
    {
            Font font1 = new Font("Big Carlson", Font.BOLD, 35);
            t.setFont(font1);
            t.setEditable(false);
            t.setHorizontalAlignment(JTextField.CENTER);

            Font font2 = new Font("Big Carlson",Font.PLAIN, 20);
            b1.setFont(font2);
            b2.setFont(font2);
            b3.setFont(font2);


            JFrame frame = new JFrame();
            JPanel outer = new JPanel();
            JPanel inner = new JPanel();

            BorderLayout outLayout = new BorderLayout();
            outer.setLayout(outLayout);

            FlowLayout inLayout = new FlowLayout();
            inner.setLayout(inLayout);

            inner.add(b1);
            inner.add(b2);
            inner.add(b3);

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);

            outer.add("South",inner);
            outer.add("North",t);

            frame.setContentPane(outer);

            frame.setSize(400,125);
            frame.setTitle("Code Breaker");
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
          System.out.println("4567");
    }

}
