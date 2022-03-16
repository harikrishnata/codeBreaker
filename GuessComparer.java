import javax.swing.*;
import java.util.Arrays;


public class GuessComparer
{

    private int correctColour=0;                            //variables to keep track of how many elements of user guess are in correct colour and how many are in correct colour and position
    private int correctColourPosition=0;

    private ImageIcon colourPosition=new ImageIcon("Score_"+0+".png"); //image icons to give user feedback
    private ImageIcon onlyColour=new ImageIcon("Score_"+1+".png");

    private int commonElements(int c[], int d[])       //method to find number of common elements between two arrays
    {
        int x=0;
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
                x++;
                i++;
                j++;
            }
        }
        return x;
    }
    public GuessComparer(int[] codeGuess,GuessCheck[] guessChecks)
    {

        for(int i=0;i<(driver.codeLength);i++)          //checks how many elemts are correct in user guess are in correct colour and position
        {
            if((driver.code)[i]==codeGuess[i])
            {
                correctColourPosition++;
            }

        }

        correctColour=commonElements(codeGuess, driver.code);             //checks how many elemts are correct in user guess are in correct colour 
        correctColour=correctColour-correctColourPosition;  //subtracts them to find elements with right colour but wrong position

        if(correctColourPosition==driver.codeLength)        //if user guess is same as code
        {
            driver.done=true;
            driver.won=true;
        }

        int counter=0;
        for(int x=0;x<correctColourPosition;x++)                                               //gives user feedback based on how many elements they got of right colour and right position
        {
            guessChecks[driver.currentGuess].changeGuessCheckUnit(counter,colourPosition);
            counter++;
        }
        for(int x=0;x<correctColour;x++)
        {
            guessChecks[driver.currentGuess].changeGuessCheckUnit(counter,onlyColour);
            counter++;
        }       
    }
}