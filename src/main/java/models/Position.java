package models;

public class Position {

    private int yAxis;

    private int xAxis;

    private boolean isMowed;

    public Position(int yAxis, int xAxis) {
        this.yAxis = yAxis;
        this.xAxis = xAxis;

        this.isMowed = false;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public boolean isMowed() {
        return isMowed;
    }

    public void setMowed(boolean mowed) {
        isMowed = mowed;
    }

    @Override
    public String toString() {
        return "Position{" +
                "yAxis=" + yAxis +
                ", xAxis=" + xAxis +
                ", isMowed=" + isMowed +
                '}';
    }
}
