public class Pet {
    // ATTRIBUTES
    int age;
    String name;
    Person owner;

    // CONSTRUCTORS
    Pet(String petName,int petAge,Person ownerName){

        this.age = petAge;
        this.name = petName;
        this.owner = ownerName;

    }
    // METHOD
    void showOwner() {

        System.out.print("My name is " + this.name + ". I am " + this.age + " . My owner's name is " + owner.name + ".");

    }
}
