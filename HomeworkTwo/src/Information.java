import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Information {
    private ArrayList<String> nicknameList = new ArrayList<>();
    private HashSet<String> userMailSet = new HashSet<>();
    private HashMap<String, String> ratioUserMailMap = new HashMap<>();

    public ArrayList<String> getNicknameList() {
        return nicknameList;
    }

    public HashSet<String> getUserMailSet() {
        return userMailSet;
    }

    public HashMap<String, String> getRatioUserMailMap() {
        return ratioUserMailMap;
    }

    public void setNicknameList(ArrayList<String> nicknameList) {
        this.nicknameList = nicknameList;
    }

    public void setUserMailSet(HashSet<String> userMailSet) {
        this.userMailSet = userMailSet;
    }

    public void setRatioUserMailMap(HashMap<String, String> ratioUserMailMap) {
        this.ratioUserMailMap = ratioUserMailMap;
    }
}
