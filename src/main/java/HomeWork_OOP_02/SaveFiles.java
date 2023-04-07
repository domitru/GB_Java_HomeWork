package HomeWork_OOP_02;

import java.io.FileWriter;
import java.io.IOException;

public interface SaveFiles {
    default void saveFile(String string) {
        try (FileWriter file = new FileWriter("filePerson.txt")){
            file.append(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}