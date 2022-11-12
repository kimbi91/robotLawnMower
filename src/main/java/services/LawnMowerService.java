package services;

import models.LawnMower;
import models.Position;

public class LawnMowerService {

    private LawnMower lawnMower;

    private NavigationService navigationService;

    public LawnMowerService(LawnMower lawnMower, NavigationService navigationService) {
        this.lawnMower = lawnMower;
        this.navigationService = navigationService;
    }

    public void mowe() {
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

    public void moveToNextPosition() {
        navigationService.updatePosition(lawnMower.getNavigation());
        navigationService.logPosition(lawnMower.getNavigation());
    }

    public boolean isDone() {
        Position[][] positions = lawnMower.getLawn().getPositions();

        //TODO
        //ciklussal végig menni a tömbön és ha van olyan mező amin nincs lenyírva return false ha nincs return true
    }
}
