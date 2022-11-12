package models;

public class LawnMower {

    private Lawn lawn;

    private Navigation navigation;

    private boolean isDone;

    public LawnMower(Lawn lawn, Navigation navigation) {
        this.lawn = lawn;
        this.navigation = navigation;
        this.isDone = false;
    }

    public Lawn getLawn() {
        return lawn;
    }

    public void setLawn(Lawn lawn) {
        this.lawn = lawn;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
