package CreativeDesignPatterns.PrototypePattern.Solution;

public class Building extends Graphic {
    private BuildingType buildingType;

    public Building(int heightInPixels, BuildingType buildingType) {
        super(heightInPixels);
        this.buildingType = buildingType;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    @Override
    public String toString() {
        return "Building{" +
                "heightInPixels=" + getheightInPixels() +
                ", buildingType=" + buildingType +
                '}';
    }


    //SHALLOW COPY
    @Override
    public Building clone() { //Omdat Building van Graphic erft, moet je hier de clone methode implementeren
        return new Building(this.getheightInPixels(), this.getBuildingType()); //Hier maak je een nieuwe instantie van Building aan met dezelfde eigenschappen als het huidige object
    }

    //DEEP COPY
//    @Override
//    public Building clone() { //Omdat Building van Graphic erft, moet je hier de clone methode implementeren
//        return new Building(this.getheightInPixels(), new BuildingType(this.getBuildingType().getType())); //Hier maak je een nieuwe instantie van Building aan met dezelfde eigenschappen als het huidige object
//    }
}
