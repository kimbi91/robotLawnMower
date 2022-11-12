package models;

import enums.Direction;

import java.util.List;

public class Navigation {

    private Direction currentDirection;

    private Position currentPosition;

    private Position nextPosition;

    private List<Position> positionLog;

    public Direction getCurrentDirection() {
        return currentDirection;
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
}
