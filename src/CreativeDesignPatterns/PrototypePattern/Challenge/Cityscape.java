package CreativeDesignPatterns.PrototypePattern.Challenge;

import java.util.List;

public class Cityscape {

    public static void main(String[] args) {

        BuildingType houseBuildingType = new BuildingType("House");
        Building house1 = new Building(120, houseBuildingType);
        Building house2 = new Building(120, houseBuildingType);
        Building house3 = new Building(120, houseBuildingType);
        Building house4 = new Building(120, houseBuildingType);
        Building house5 = new Building(120, houseBuildingType);
        houseBuildingType.setType("House with a yard");

        BuildingType skyscaperBuildingType = new BuildingType("Skyscraper");
        Building skyscaper1 = new Building(300, skyscaperBuildingType);
        Building skyscaper2 = new Building(300, skyscaperBuildingType);
        Building skyscaper3 = new Building(300, skyscaperBuildingType);
        Building skyscaper4 = new Building(300, skyscaperBuildingType);
        Building skyscaper5 = new Building(300, skyscaperBuildingType);

        List<Graphic> order = List.of(house1, house2, house3, house4, house5, skyscaper1, skyscaper2, skyscaper3, skyscaper4, skyscaper5);

        createCityscape(order);
    }

    private static void createCityscape(List<Graphic> order) {
        System.out.println("Creating cityscape...");
        order.forEach(System.out::println);
    }
}
