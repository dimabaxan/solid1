package homework;

public class ConsoleUserReporter implements UserReporter {
        @Override
        public void report(User user) {
            System.out.println(" User report : " + user.getName());
        }
    }
