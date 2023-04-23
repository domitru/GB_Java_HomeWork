package HomeWork_OOP_06.path2PhoneBook;

import java.io.*;
import java.util.ArrayList;

public class FileMenu {
    String FILE_PATH = "C:\\SchoolGeekBrains\\GB_Java_HomeWork\\src\\main\\java\\HomeWork_OOP_05\\path2PhoneBook\\";
    String FILE_NAME_EXPORT = "export.txt";
    String FILE_PATH_FULL = FILE_PATH + FILE_NAME_EXPORT;

    ArrayList<PhoneBook> phb = new ArrayList<>();

    public void ExportFile(ArrayList<PhoneBook> pb) {
        try (FileWriter writer = new FileWriter(FILE_PATH_FULL,false))
        {
            for (PhoneBook i : pb) {
                String text = i.getName() + ";" + i.getPhone() + ";" + i.getCity();
                writer.write(text);
                writer.append('\n');
            }

            writer.flush();
        }
          catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<PhoneBook> ImportFile() {
        try {
            File file = new File(FILE_PATH_FULL);
            FileReader fr = new FileReader(file);
            ArrayList<PhoneBook> result = new ArrayList<>();
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while (line != null) {
               // System.out.println(line);
                String[] tmp = line.split(";");
                phb.add(new PhoneBook(tmp[0], tmp[1], tmp[2]));
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  phb;
    }
}
