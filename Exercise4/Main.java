public class App1 {

    public static void main (String []args ) throws Exception {

        // PERSON
        Person Me =  new Person("Amiel", 20);

        Person Friend = new Person("Saja", 20);

        Me.addFriend(Friend);

        // PET OBJECT
        Pet Dog = new Pet("Tabby", 3, Me);

        System.out.println();

        Dog.showOwner();

        System.out.println();

        // CLASSMATE OBJECT
        Person Classmate1 = new Person("Renz", 0);
        Person Classmate2 = new Person("Earl",0);
        Person Classmate3= new Person("Maxine", 0);

        Me.addClassmates(Classmate1,Classmate2,Classmate3);
       
        // CAR OBJECT
         Car sportsCar = new Car("Audi R8", "Gray", Me);

         System.out.println();

         sportsCar.carOwner();

    }



    
    
}