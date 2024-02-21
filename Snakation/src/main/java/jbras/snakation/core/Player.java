package jbras.snakation.core;

public class Player {
    private String id;
    private int latest_score;
    private int highest_score;
    public Player(String id, int latest_score)
    {
        this.id = id;
        this.latest_score = latest_score;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLatest_score() {
        return latest_score;
    }

    public void setLatest_score(int latest_score) {
        this.latest_score = latest_score;
    }
}
