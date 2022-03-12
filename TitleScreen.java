import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TitleScreen extends JFrame implements ActionListener {
    JTextField t = new JTextField("CODE BREAKER");

    //JFrame frame = new JFrame();
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

            this.setContentPane(outer);

            this.setSize(400,125);
            this.setTitle("Code Breaker");
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
          System.out.println("4567");
          this.dispose();
          if(e.getSource()==b1){
            GameGUI G = new GameGUI(0);
          } 
          if(e.getSource()==b2){
            GameGUI G = new GameGUI(1);
          }    
          if(e.getSource()==b3){
            GameGUI G = new GameGUI(2);  
          }      
    }   

}
