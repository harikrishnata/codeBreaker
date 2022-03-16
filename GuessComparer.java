import javax.swing.*;
import java.util.Arrays;


public class GuessComparer{

    private int correctColour=0;
    private int correctColourPosition=0;
    private ImageIcon colourPosition=new ImageIcon("Score_"+0+".png");
    private ImageIcon onlyColour=new ImageIcon("Score_"+1+".png");

    private void commonElements(int c[], int d[])
    {
        int i = 0;
        int j = 0;
        int a[]=c.clone();
        int b[]=d.clone();
        Arrays.sort(a);
        Arrays.sort(b);
        while (i < driver.codeLength && j < driver.codeLength) 
        {
 
            if (a[i] > b[j]) 
            {
                j++;
            }
            else if (b[j] > a[i])
            {
                i++;
            }
            else 
            {
                correctColour++;
                i++;
                j++;
            }
        }
    }
    public GuessComparer(int[] codeGuess,GuessCheck[] guessChecks)
    {

        for(int i=0;i<(driver.codeLength);i++)
        {
            if((driver.code)[i]==codeGuess[i])
            {
                correctColourPosition++;
            }

        }
        if(correctColourPosition==driver.codeLength)
        {
            driver.done=true;
            driver.won=true;
        }
        commonElements(codeGuess, driver.code);
        correctColour=correctColour-correctColourPosition;

        int counter=0;
        for(int x=0;x<correctColourPosition;x++)
        {
            guessChecks[driver.currentGuess].guessCheckUnit[counter].setIcon(colourPosition);
            counter++;
        }
        for(int x=0;x<correctColour;x++)
        {
            guessChecks[driver.currentGuess].guessCheckUnit[counter].setIcon(onlyColour);
            counter++;
        }       
    }
}