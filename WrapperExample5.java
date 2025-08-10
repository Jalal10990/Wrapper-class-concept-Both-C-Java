class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Player: " + name);
    }
}

class Team {
    private Player player; // Aggregation

    public Team(Player player) {
        this.player = player;
    }

    public void showPlayer() {
        player.display();
    }
}

public class WrapperExample5 {

    public static void main(String[] args) {
        int x=6;

        Player p = new Player("John"); // Player created outside
        Team t = new Team(p); // Passed into Team

        t.showPlayer(); // Works fine

        // Even if team is gone, player still exists

    }

}
