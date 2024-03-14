import java.util.ArrayList;
import java.util.Random;

/**
 * Escreva uma descrição da classe WordGenerator aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGenerator
{
    ArrayList<String> words = new ArrayList<String>();
    String randomWord;

    private void fillArray(){
        words.add("boolean");
        words.add("int");
        words.add("string");  
        words.add("class");
        words.add("else");
    }
    
    public String generateWord(){
        for (int i = 0; i < words.size(); i++){ 
            // generating the index using Math.random() 
            int index = (int)(Math.random() * words.size()); 
            randomWord= words.get(index);
  
        } 
        return randomWord;
    }
    
    public void addWord(String newWord){
        words.add(newWord);
    }
}