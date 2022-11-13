package controller;

import models.Lawn;
import models.LawnMower;
import models.Navigation;
import models.Position;
import services.LawnMowerService;
import services.LawnService;
import services.NavigationService;

public class MainController {
    public static void main(String[] args) {
        LawnService lawnService = new LawnService();
        Lawn lawn = lawnService.createLawn(5, 5);

        NavigationService navigationService = new NavigationService();
        Navigation navigation = navigationService.createNavigation(lawn);

        LawnMower lawnMower = new LawnMower(lawn, navigation);
        LawnMowerService lawnMowerService = new LawnMowerService(lawnMower, navigationService);

        System.out.println("Original lawn positions:");
        for (Position[] value : lawn.getPositions()) {
            for (Position position : value) {
                System.out.println(position);
            }
        }

        while (!lawnMowerService.isDone()) {
            lawnMowerService.mowe();
        }

        System.out.println("\nLawn mower log:");
        System.out.println(lawnMower.getNavigation().getPositionLog());

        System.out.println("\nAfter the lawn mower finished");
        for (Position[] value : lawn.getPositions()) {
            for (Position position : value) {
                System.out.println(position);
            }
        }
    }
}
