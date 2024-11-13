import java.util.ArrayList;
import java.util.List;

public class TodoList {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        tasks.add("Проверить почту");
        tasks.add("Сделать отчет");
        tasks.add("Пойти в спортзал");
        tasks.add("Купить продукты");
        tasks.add("Позвонить друзьям");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Задача " + (i + 1) + ": " + tasks.get(i));
        }
    }
}
