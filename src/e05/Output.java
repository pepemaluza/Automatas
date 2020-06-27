package e05;

public class Output {
    private String description;

    private int timer;

    public Output(String description, int timer) {
        this.description = description;
        this.timer = timer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
}
