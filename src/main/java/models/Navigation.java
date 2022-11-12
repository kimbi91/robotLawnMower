package models;

import enums.Direction;

import java.util.ArrayList;
import java.util.List;

public class Navigation {

    private Direction currentDirection;

    private Position currentPosition;

    private Position nextPosition;

    private List<Position> positionLog;

    private Lawn lawn;

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public Navigation(Direction currentDirection, Position currentPosition, Lawn lawn) {
        this.currentDirection = currentDirection;
        this.currentPosition = currentPosition;
        this.lawn = lawn;
        this.positionLog = new ArrayList<>();
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Position getNextPosition() {
        return nextPosition;
    }

    public void setNextPosition(Position nextPosition) {
        this.nextPosition = nextPosition;
    }

    public List<Position> getPositionLog() {
        return positionLog;
    }

    public void setPositionLog(List<Position> positionLog) {
        this.positionLog = positionLog;
    }

    public Lawn getLawn() {
        return lawn;
    }

    public void setLawn(Lawn lawn) {
        this.lawn = lawn;
    }

    @Override
    public String toString() {
        return "Navigation{" +
                "currentDirection=" + currentDirection +
                ", currentPosition=" + currentPosition +
                ", nextPosition=" + nextPosition +
                ", positionLog=" + positionLog +
                '}';
    }
}
