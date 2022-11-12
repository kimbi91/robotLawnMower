package models;

public class Lawn {

    private int xSide;

    private int ySide;

    private Position[][] positions;

    public int getxSide() {
        return xSide;
    }

    public void setxSide(int xSide) {
        this.xSide = xSide;
    }

    public int getySide() {
        return ySide;
    }

    public void setySide(int ySide) {
        this.ySide = ySide;
    }

    public Position[][] getPositions() {
        return positions;
    }

    public void setPositions(Position[][] positions) {
        this.positions = positions;
    }
}
