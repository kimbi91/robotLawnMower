package cotroller;

import models.Lawn;
import models.Position;
import services.LawnService;

public class MainController {
    public static void main(String[] args) {
        LawnService lawnService = new LawnService();
        Lawn lawn = lawnService.createLawn(5, 5);

        Position[][] positions = lawn.getPositions();

        for (Position[] value : positions) {
            for (Position position : value) {
                System.out.println(position);
            }
        }
    }
}
