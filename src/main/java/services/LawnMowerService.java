package services;

import models.LawnMower;
import models.Position;

public class LawnMowerService {

    private final LawnMower lawnMower;

    private final NavigationService navigationService;

    public LawnMowerService(LawnMower lawnMower, NavigationService navigationService) {
        this.lawnMower = lawnMower;
        this.navigationService = navigationService;
    }

    public void mowe() {
        if (lawnMower.getNavigation().getCurrentPosition().getyAxis() != -1) {
            lawnMower
                    .getLawn()
                    .getPosition(
                            lawnMower.getNavigation()
                                    .getCurrentPosition()
                                    .getxAxis(),
                            lawnMower.getNavigation()
                                    .getCurrentPosition()
                                    .getyAxis())
                    .setMowed(true);
        }
        lawnMower.getNavigation().getCurrentPosition().setMowed(true);
        moveToNextPosition();
    }

    public void moveToNextPosition() {
        navigationService.updatePosition(lawnMower.getNavigation());
        navigationService.logPosition(lawnMower.getNavigation());
    }

    public boolean isDone() {
        Position[][] positions = lawnMower.getLawn().getPositions();

        for (Position[] positionArray : positions) {
            for (Position position : positionArray) {
                if (!position.isMowed()) {
                    return false;
                }
            }
        }

        return true;
    }
}
