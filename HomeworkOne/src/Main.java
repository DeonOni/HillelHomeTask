public class Main {

    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setName("Max");
        user.setSurname("Trush");
        user.setAge(19);
        user.setPassword("you shall not pass!!!");
        user.setMail("User.Example2@example.com");

        Admin admin = new Admin();
        admin.setName("Maximilian");
        admin.setSurname("Trush");
        admin.setAge(100);
        admin.setPassword("XxX0BmF0xXx");
        admin.setMail("AdminMail@example.com");

        UserIService userIService = new UserIService();
        AdminIService adminIService = new AdminIService();

        userIService.writeUserData(user);
        adminIService.writeUserData(user);
        adminIService.writeUserData(admin);
        userIService.checkUser(admin);
        adminIService.checkUser(user);
    }
}
