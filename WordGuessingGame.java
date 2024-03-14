/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
// Classe WordGuessingGame
public class WordGuessingGame {
    private InputReader reader; // Declaração do atributo reader da classe InputReader
    private String hiddenWord; // Palavra oculta que o jogador tem que adivinhar
    private String guessedWord; // Palavra adivinhada pelo jogador
    private int numberOfTries; // Número de tentativas realizadas pelo jogador
    private WordGenerator wordGenerator;

    // Construtor da classe WordGuessingGame
    public WordGuessingGame() {
        this.reader = new InputReader(); // Inicializa o leitor de entrada do teclado
        this.hiddenWord = "abc"; // Define a palavra oculta como "abc"
        this.guessedWord = "___"; // Define a palavra adivinhada inicialmente como "___"
        this.numberOfTries = 0; // Inicializa o número de tentativas como 0
        this.wordGenerator = wordGenerator;
    }

    // Métodos seletores

    // Método para obter a palavra oculta
    public String getHiddenWord() {
        return hiddenWord;
    }

    // Método para obter a palavra adivinhada
    public String getGuessedWord() {
        return guessedWord;
    }

    // Método para obter o número de tentativas
    public int getNumberOfTries() {
        return numberOfTries;
    }

    // Método para mostrar a palavra adivinhada
    public void showGuessedWord() {
        System.out.println("Guessed Word: " + guessedWord);
    }
    
    public void initializeGuessedWord(){
        guessedWord = "_".repeat(hiddenWord.length());
    }
    
    public void reset(){
        hiddenWord = wordGenerator.generateWord().toLowerCase();
        initializeGuessedWord();
        numberOfTries = 0;
    }

    // Método para jogar o jogo
    public void play() {
        showWelcome(); // Mostra a mensagem de boas-vindas

        while (!guessedWord.equals(hiddenWord)) { // Enquanto a palavra adivinhada for diferente da palavra oculta
            char guess = reader.getChar("Guess a letter: "); // Obtém o palpite do jogador
            if (guess(guess)) { // Se o palpite estiver correto
                System.out.println("Correct guess!"); // Exibe mensagem de palpite correto
            } else {
                System.out.println("Incorrect guess. Try again."); // Exibe mensagem de palpite incorreto
            }
            numberOfTries++; // Incrementa o número de tentativas
            showGuessedWord(); // Mostra a palavra adivinhada
        }

        showResult(); // Mostra o resultado do jogo
    }

    // Método para mostrar a mensagem de boas-vindas
    private void showWelcome() {
        System.out.println("Welcome to Word Guessing Game!");
        System.out.println("Try to guess the hidden word.");
        showGuessedWord();
    }

    // Método para verificar o palpite do jogador
    private boolean guess(char letter) {
        boolean found = false;
        for (int i = 0; i < hiddenWord.length(); i++) { // Percorre cada letra da palavra oculta
            if (hiddenWord.charAt(i) == letter && guessedWord.charAt(i) == '_') { // Se a letra fornecida estiver correta e ainda não tiver sido adivinhada
                guessedWord = guessedWord.substring(0, i) + letter + guessedWord.substring(i + 1); // Atualiza a palavra adivinhada com a letra correta
                found = true; // Marca como encontrada
            }
        }
        return found; // Retorna se a letra foi encontrada na palavra oculta
    }

    // Método para mostrar o resultado
    private void showResult() {
        System.out.println("Congratulations! You guessed the word '" + hiddenWord + "' in " + numberOfTries + " tries.");
    }

    public static void main(String[] args) {
        WordGuessingGame game = new WordGuessingGame();
        game.play();
    }
}
