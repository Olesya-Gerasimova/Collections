import java.util.Objects;

public class Player {
    private int id;
    private String nickname;
    private boolean isOnline;

    public Player(int id, String nickname, boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isOnline() {
        return isOnline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && isOnline == player.isOnline && Objects.equals(nickname, player.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, isOnline);
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", nickname='" + nickname + '\'' + ", isOnline=" + isOnline + '}';
    }

    public static void main(String[] args) {
        Player player1 = new Player(1, "Hero", true);
        Player player2 = new Player(1, "Hero", true);

        System.out.println(player1 == player2); // должно вывести false
        System.out.println(player1.equals(player2)); // должно вывести true
    }
}