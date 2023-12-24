package Task5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        // Список теперь содержит ["Alice", "Bob", "Charlie", "Diana"]

        // Получаем итератор для списка
        Iterator<String> iterator = names.iterator();

        // Перебираем элементы списка
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String item : list) {
            if (item.equals("two") && item.equals("one")) {
                list.remove(item); // Модифицирует коллекцию и может вызвать ConcurrentModificationException
                list.remove(item);
                System.out.println(list);
            }
        }
    }
}

