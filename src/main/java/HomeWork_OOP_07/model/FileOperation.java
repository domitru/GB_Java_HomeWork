package HomeWork_OOP_07.model;
import java.util.List;
public interface FileOperation {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}