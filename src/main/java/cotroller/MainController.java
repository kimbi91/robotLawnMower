package cotroller;

import models.Lawn;
import models.Navigation;
import models.Position;
import services.LawnService;
import services.NavigationService;

public class MainController {
    public static void main(String[] args) {
        LawnService lawnService = new LawnService();
        Lawn lawn = lawnService.createLawn(5, 5);

        Position[][] positions = lawn.getPositions();

        NavigationService navigationService = new NavigationService();
        Navigation navigation = navigationService.createNavigation(lawn);

        for (int i = 0; i < 27; i++) {
            System.out.println(navigation);
            navigationService.updatePosition(navigation);
            navigationService.logPosition(navigation);
        }
    }
}
