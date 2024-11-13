import java.util.*;

public class TournamentTable {
    public static void main(String[] args) {
        Map<Player, Integer> points = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            points.put(new Player(i, "Player" + i, true), 0);
        }

        points.put(new Player(4, "Player4", true), 10);
        points.put(new Player(7, "Player7", true), 12);
        points.put(new Player(8, "Player8", true), 11);
        points.put(new Player(9, "Player9", true), 13);
        points.put(new Player(10, "Player10", true), 5);

        points.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .forEach(entry -> System.out.println(entry.getKey() + " - очков: " + entry.getValue()));
    }
}