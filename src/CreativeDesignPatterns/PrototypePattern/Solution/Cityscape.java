package CreativeDesignPatterns.PrototypePattern.Solution;

import java.util.List;

public class Cityscape {

    public static void main(String[] args) {

        /*de clone methode wordt hier gebruikt om een kopie van house1 te maken. Dit werkt prima als de waarde van house1 niet verandert. Echter, als we de waarde van houseBuildingType veranderen, verandert deze ook voor alle gekloonde objecten omdat ze allemaal naar hetzelfde BuildingType object verwijzen.
        *
        * Om te voorkomen dat alles verandert wanneer je enkele wilt veranderen, hebben we een deep copy nodig*/
        BuildingType houseBuildingType = new BuildingType("House");
        Building house1 = new Building(120, houseBuildingType);
        Building house2 = house1.clone();
        Building house3 = house1.clone();
        Building house4 = house1.clone();
        Building house5 = house1.clone();
        houseBuildingType.setType("House with a yard");
        /*Wat er gebeurt wanneer je onderstaande regel uncomment, is afhankelijk van de clone methode in Building. Als je een shallow copy gebruikt, verandert het type van alle huizen naar "Apartment". Als je een deep copy gebruikt, blijven de gekloonde huizen "House with a yard" omdat ze elk hun eigen kopie van BuildingType hebben.*/

//        houseBuildingType.setType("Apartment");

        BuildingType skyscaperBuildingType = new BuildingType("Skyscraper");
        Building skyscaper1 = new Building(300, skyscaperBuildingType);
        Building skyscaper2 = skyscaper1.clone();
        Building skyscaper3 = skyscaper1.clone();
        Building skyscaper4 = skyscaper1.clone();
        Building skyscaper5 = skyscaper1.clone();

        List<Graphic> order = List.of(house1, house2, house3, house4, house5, skyscaper1, skyscaper2, skyscaper3, skyscaper4, skyscaper5);

        createCityscape(order);
    }

    private static void createCityscape(List<Graphic> order) {
        System.out.println("Creating cityscape...");
        order.forEach(System.out::println);
    }
}
