package homework;

public class ConsoleUserPersister implements UserPersister {
    @Override
    public void save(User user) {
        System.out.println(" Save User : " + user.getName());
    }
}

