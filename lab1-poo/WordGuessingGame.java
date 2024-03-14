
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int nunberOfTries;
    
    public WordGuessingGame(){
        hiddenWord="abc";
        guessedWord="___";
        
    }
    
    public String getHiddenWord(){
        return hiddenWord;
    }
    
    public String getguessedWord(){
        return guessedWord;
    }
    
    public int getnunberOfTries(){
        return nunberOfTries;
    }
    
    public void setnunberOfTries(int nunberOfTries){
        this.nunberOfTries=nunberOfTries;
    }
    
     public void sethiddenWord(String hiddenWord){
        this.hiddenWord=hiddenWord;
    }
    
     public void setguessedWord(String guessedWord){
        this.guessedWord=guessedWord;
    }
    
    public void showGuessedWords(){
    System.out.println("palavra advinhada: " + guessedWord);
    }
}
