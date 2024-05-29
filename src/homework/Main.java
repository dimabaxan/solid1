package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserPersister persister = new ConsoleUserPersister();
        UserReporter reporter = new ConsoleUserReporter();

        UserService userService = new UserService(persister, reporter);

        userService.saveUser(user);
        userService.reportUser(user);
    }
}