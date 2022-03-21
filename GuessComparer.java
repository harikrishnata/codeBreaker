import javax.swing.*;
import java.util.Arrays;

/**
 * This class compares the user input to the actual code and changes the labels in a Guess Check panel accordingly
 */
public class GuessComparer
{

    private int correctColour=0;                                            //variables to keep track of how many elements of user guess are in correct colour and how many are in correct colour and position
    private int correctColourPosition=0;

    private ImageIcon colourPosition=new ImageIcon("Score_"+0+".png");      //image icons to give user feedback
    private ImageIcon onlyColour=new ImageIcon("Score_"+1+".png");
    /**
     * This method finds number of common elements between two arrays and returns it
     * @param c array 1
     * @param d array 2
     */
    private int commonElements(int c[], int d[])                            //method to find number of common elements between two arrays
    {
        int x=0;
        int i = 0;
        int j = 0;
        int a[]=c.clone();
        int b[]=d.clone();
        Arrays.sort(a);
        Arrays.sort(b);
        while (i < a.length && j < b.length) 
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
    /**
     * Constructor This method finds number of common elements between two arrays and returns it
     * @param codeGuess guess made by the user
     * @param guessChecks panel containing all Guess Checks
     */    
    public GuessComparer(int[] codeGuess,GuessCheck[] guessChecks)
    {

        for(int i=0;i<(driver.getCodeLength());i++)          //checks how many elemts are correct in user guess are in correct colour and position
        {
            if((driver.getCode())[i]==codeGuess[i])
            {
                correctColourPosition++;
            }

        }

        correctColour=commonElements(codeGuess, driver.getCode());             //checks how many elemts are correct in user guess are in correct colour 
        correctColour=correctColour-correctColourPosition;              //subtracts them to find elements with right colour but wrong position

        if(correctColourPosition==driver.getCodeLength())        //if user guess is same as code
        {
            //driver.done=true;
            driver.won=true;
        }

        int counter=0;
        for(int x=0;x<correctColourPosition;x++)                                               //gives user feedback based on how many elements they got of right colour and right position by changing the icon of labels
        {
            guessChecks[driver.getCurrentGuess()].changeGuessCheckUnit(counter,colourPosition);
            counter++;
        }
        for(int x=0;x<correctColour;x++)
        {
            guessChecks[driver.getCurrentGuess()].changeGuessCheckUnit(counter,onlyColour);
            counter++;
        }       
    }
}