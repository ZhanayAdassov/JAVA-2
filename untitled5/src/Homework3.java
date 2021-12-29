import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;

public class Homework3 {
    static final String FILE_NAME1= "C://JAVA/Java2Lesson3Homework3.txt";
    static final String FILE_NAME2= "Java2Lesson3Homework3.txt";

    public static void main (String[] args){
        List<String> wordArray = new ArrayList<String>();
        wordArray = ArrayOperation.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        wordArray.clear();
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME2);
        } catch (IOException e) {
            System.out.println("Не удалось заполнить массив из файла!\n");
        }
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME1);
        } catch (IOException e) {
            System.out.println("Не удалось заполнить массив из файла!\n");
        }
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);


        Phonebook phonebook = new Phonebook();

        phonebook.add(1936452, "Adassov");
        phonebook.add(4264125, "Adassov");
        phonebook.add(5589783, "Aleksey");
        phonebook.add(3656278, "Zanin");
        phonebook.add(6325053, "Zanin");
        phonebook.add(8545893, "Zanin");

        phonebook.get("Adassov");
        phonebook.get("Aleksey");
        phonebook.get("Zanin");
        phonebook.get("Rulevoi");
    }
}
