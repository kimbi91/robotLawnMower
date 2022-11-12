package services;

import models.Lawn;
import models.Position;

public class LawnService {

    public Lawn createLawn(int xSide, int ySide) {
        Lawn lawn = new Lawn(xSide, ySide);
        createPositions(lawn);

        return lawn;
    }

    private void createPositions(Lawn lawn) {
        Position[][] positions = lawn.getPositions();

        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < positions[i].length; j++) {
                positions[i][j] = new Position(i, j);
            }
        }
    }
}
