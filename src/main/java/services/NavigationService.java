package services;

import enums.Direction;
import models.Lawn;
import models.Navigation;
import models.Position;

import java.util.List;

public class NavigationService {

    public Navigation createNavigation(Lawn lawn) {
        Position start = new Position(-1, -1);
        Navigation navigation = new Navigation(Direction.RIGHT, start, lawn);
        logPosition(navigation);
        navigation.setNextPosition(getNextPosition(navigation));

        return navigation;
    }

    public Position getNextPosition(Navigation navigation) {
        Position current = navigation.getCurrentPosition();
        int y = current.getyAxis(), x = current.getxAxis();
        int yMax = navigation.getLawn().getySide();
        int xMax = navigation.getLawn().getxSide();

        if (navigation.getCurrentDirection().getCode() == 3) {
            return nextPositionRight(navigation);
        } else {
            return nextPositionLeft(navigation);
        }
    }

    public Position nextPositionRight(Navigation navigation) {
        Position current = navigation.getCurrentPosition();
        int y = current.getyAxis(), x = current.getxAxis();
        int yMax = navigation.getLawn().getySide();
        int xMax = navigation.getLawn().getxSide();

        if (x == -1 && y == -1) {
            return new Position(0, 0);
        } else if (x + 1 < xMax){
            return new Position(y, x + 1);
        } else if (x + 1 == xMax && y + 1 < yMax) {
            navigation.setCurrentDirection(Direction.LEFT);
            return new Position(y + 1, xMax - 1);
        } else {
            return new Position(-2 , -2);
        }
    }

    public Position nextPositionLeft(Navigation navigation) {
        Position current = navigation.getCurrentPosition();
        int y = current.getyAxis(), x = current.getxAxis();
        int yMax = navigation.getLawn().getySide();
        int xMax = navigation.getLawn().getxSide();

        if (x == -1 && y == -1) {
            return new Position(0, xMax - 1);
        } else if (x - 1 > -1) {
            return new Position(y, x - 1);
        } else if (x - 1 == -1 && y + 1 < yMax) {
            navigation.setCurrentDirection(Direction.RIGHT);
            return new Position(y + 1, 0);
        } else {
            return new Position(-2 , -2);
        }
    }

    public void logPosition(Navigation navigation) {
        List<Position> positions = navigation.getPositionLog();
        positions.add(navigation.getCurrentPosition());
    }

    public void updatePosition(Navigation navigation) {
        if (navigation.getNextPosition().getyAxis() > -1) {
            navigation.setCurrentPosition(navigation.getNextPosition());
            navigation.setNextPosition(getNextPosition(navigation));
        }
    }
}
