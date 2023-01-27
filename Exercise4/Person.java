public class Person {

    String name;
    int age;

    Person(String personName, int personAge) {

        this.name = personName;
        this.age = personAge;

    }

    void addFriend(Person Friend) {
        System.out.print(this.name + " is friend with " + Friend.name + ". We are both " + Friend.age + " years old.");

    }

    void addClassmates(Person Classmate1, Person Classmate2, Person Classmate3) {

        System.out.print("I am friends with " + Classmate1.name + ", " + Classmate2.name + " and " + Classmate3.name + ".");
    }

}


