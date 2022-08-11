package vadpol.models;


public class Player {
   private String name;
    private int win;
    private int lost;
    private int ties;

public Player(String name){
    this.name = name;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", win=" + win +
                ", lost=" + lost +
                ", ties=" + ties +
                '}';
    }
}
