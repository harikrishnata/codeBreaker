/**
 * This class is to initialise the program
 */
public class driver 
{

    public static GameGUI G;
    public static boolean done=false;
    public static boolean won=false;

    private static int codeLength;
    private static int numOfGuesses;
    private static int[] code;
    private static int currentGuess = 0;
    private static int currentElement = 0;

    /**
     * Main method of driver
    */    
    public static void main(String[] args) 
    {
        TitleScreen T = new TitleScreen();
    }


    public static void setCodeLength(int x){
        codeLength=x;
    }
    public static int getCodeLength(){
        return codeLength;
    }

    public static void setNumOfGuesses(int x){
        numOfGuesses=x;
    }
    public static int getNumOfGuesses(){
        return numOfGuesses;
    }   
    
    public static void setCurrentGuess(int x){
        currentGuess=x;
    }
    public static int getCurrentGuess(){
        return currentGuess;
    }  

    public static void setCurrentElement(int x){
        currentElement=x;
    }
    public static int getCurrentElement(){
        return currentElement;
    }

    public static void setCode(int[] x){
        code=x;
    }
    /**
     * Sets the element at a position in the code
     * @param position position of code
     * @param x element to set it to
    */    
    public static void setCodeElement(int position, int x){
        code[position]=x;
    }
    public static int[] getCode(){
        return code;
    }    
}