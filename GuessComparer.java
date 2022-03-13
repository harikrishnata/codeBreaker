import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessComparer{
    int[] code = new int[GameGUI.codeLength];
    //int[] codeGuess = new int[GameGUI.codeLength]
    int correctColour;
    int correctColourPosition;
    ImageIcon colourPosition=new ImageIcon("Score_"+0+".png");
    ImageIcon onlyColour=new ImageIcon("Score_"+1+".png");


    public boolean contains(int[] array, int key) 
    {
        for (int i=0;i<array.length;i++) 
        {
            if (array[i] == key) 
            {
            return true;
            }
        }
        return false;
    }

    public GuessComparer(int[] codeGuess,GuessCheck[] guessChecks)
    {
        //driver.currentGuess++;
        //driver.currentElement=0;
        //this.codeGuess
        for(int i=0;i<(GameGUI.codeLength);i++)
        {
            if(contains((driver.code),codeGuess[i]))
            {
                if((driver.code)[i]==codeGuess[i])
                {
                    correctColourPosition++;
                }
                else
                {
                    correctColour++;
                }
            }
        }
        System.out.println(correctColour);
        System.out.println(correctColourPosition);

        //int counter=GameGUI.codeLength-correctColourPosition-correctColour;
        int counter=0;
        for(int x=0;x<correctColourPosition;x++){
            guessChecks[driver.currentGuess].guessCheckUnit[counter].setIcon(colourPosition);
            counter++;
        }
        for(int x=0;x<correctColour;x++){
            guessChecks[driver.currentGuess].guessCheckUnit[counter].setIcon(onlyColour);
            counter++;
        }       

        //driver.currentGuess=0;

    }
}