package homework;

public class UserService { private final UserPersister persister;
    private final UserReporter reporter;

    public UserService(UserPersister persister, UserReporter reporter) {
        this.persister = persister;
        this.reporter = reporter;
    }

    public void saveUser(User user) {
        persister.save(user);
    }

    public void reportUser(User user) {
        reporter.report(user);
    }
}