import java.util.HashSet;
import java.util.Set;

public class Tournament {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            players.add(new Player(i, "Player" + i, true));
        }

        players.add(new Player(1, "Player1", true)); // Этот игрок не добавится снова

        System.out.println("Количество уникальных игроков: " + players.size());
    }
}