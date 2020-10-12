import java.io.*;
import java.util.Scanner;


public class AdminIService implements IService {
    @Override
    public boolean checkUser(MainEntity mainEntity) throws Exception {

        FileReader fr = new FileReader("src/AdminData.txt");
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            if (scan.nextLine().equals(mainEntity.getMail())) {
                return true;
            }
        }

        fr.close();
        return false;
    }

    @Override
    public void writeUserData(MainEntity mainEntity) throws Exception {
        FileWriter newFile = new FileWriter("clientData.txt");
        newFile.write(String.format("%d\n", mainEntity.getAge()));
        newFile.write(String.format("%s\n", mainEntity.getMail()));
        newFile.write(String.format("%s\n", mainEntity.getName()));
        newFile.write(String.format("%s\n", mainEntity.getPassword()));
        newFile.write(String.format("%s\n", mainEntity.getRole()));
        newFile.write(String.format("%s\n", mainEntity.getSurname()));
        newFile.close();
    }
}

