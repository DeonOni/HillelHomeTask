import java.io.*;
import java.util.Scanner;

public class UserIService implements IService {
    @Override
    public boolean checkUser(MainEntity mainEntity) throws Exception {

        FileReader fr = new FileReader("src/UserData.txt");
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
    public void writeUserData(MainEntity mainEntity) {
         System.out.println("Not allowed");
    }
}
