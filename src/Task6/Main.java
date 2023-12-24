package Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 30));
        users.add(new User("Bob", 25));
        users.add(new User("Charlie", 35));

        // Компаратор для сортировки пользователей по возрасту
        Comparator<User> ageComparator = new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getName().compareTo(u2.getName());
            }
        };
//        Comparator<User> ageComparator = new Comparator<User>() {
//            @Override
//            public int compare(User u1, User u2) {
//                return Integer.compare(u1.getAge(), u2.getAge());
//            }
        Collections.sort(users, ageComparator);

        for (User user : users) {
            System.out.println(user);
        }
    }
}