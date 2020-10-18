public class Main {

    public static void main(String[] args) {
        Information information = new Information();
        InitializationData initializationData = new InitializationData();
        initializationData.ProvidingAndFilling(information);
        System.out.println(information);
    }
}
