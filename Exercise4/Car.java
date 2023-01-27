public class Car {

    String model;
    String color;
    Person owner;

    Car(String carModel, String carColor, Person ownerName) {

        this.model = carModel;
        this.color = carColor;
        this.owner = ownerName;

    }

    void carOwner() {

        System.out.print("The car model is " + this.model + ". It is color " + this.color + " and it is owned by " + owner.name + "");
    }
}