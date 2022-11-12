package models;

public class Position {

    private int xAxis;

    private int yAxis;

    private boolean isMowed;

    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public boolean isMowed() {
        return isMowed;
    }

    public void setMowed(boolean mowed) {
        isMowed = mowed;
    }
}
