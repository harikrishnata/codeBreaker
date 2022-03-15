import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;


public class GuessComparer{
    int[] code = new int[GameGUI.codeLength];
    int correctColour=0;
    int correctColourPosition=0;
    ImageIcon colourPosition=new ImageIcon("Score_"+0+".png");
    ImageIcon onlyColour=new ImageIcon("Score_"+1+".png");

    public void numIntersection(int c[], int d[])
    {
        int i = 0;
        int j = 0;
        int a[]=c.clone();
        int b[]=d.clone();
        Arrays.sort(a);
        Arrays.sort(b);

        while (i < GameGUI.codeLength && j < GameGUI.codeLength) {
 
            if (a[i] > b[j]) {
                j++;
            }
 
            else if (b[j] > a[i]) {
                i++;
            }
            else {
                correctColour++;
                i++;
                j++;
            }
        }
    }

    public GuessComparer(int[] codeGuess,GuessCheck[] guessChecks)
    {

        for(int i=0;i<(GameGUI.codeLength);i++)
        {
            if((driver.code)[i]==codeGuess[i])
            {
                correctColourPosition++;
            }

        }
        numIntersection(codeGuess, driver.code);
        correctColour=correctColour-correctColourPosition;

        System.out.println(correctColour);
        System.out.println(correctColourPosition);

        int counter=0;
        for(int x=0;x<correctColourPosition;x++){
            guessChecks[driver.currentGuess].guessCheckUnit[counter].setIcon(colourPosition);
            counter++;
        }
        for(int x=0;x<correctColour;x++){
            guessChecks[driver.currentGuess].guessCheckUnit[counter].setIcon(onlyColour);
            counter++;
        }       


    }
}