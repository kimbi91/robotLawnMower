package models;

public class Lawn {

    private int xSide;

    private int ySide;

    private Position[][] positions;

    public Lawn(int xSide, int ySide) {
        this.xSide = xSide;
        this.ySide = ySide;
        this.positions = new Position[ySide][xSide];
    }

    public Position getPosition(int xSide, int ySide) {
        return positions[ySide][xSide];
    }

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
