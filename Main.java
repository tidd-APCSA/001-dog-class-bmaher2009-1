public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics. 

    Dog Jeff = new Dog("Jeff 🐶", "Beagle", 100.0, "brown", true);
    System.out.println(Jeff.getName());
    System.out.println(Jeff.getBreed());
    System.out.println(Jeff.getWeight());
    System.out.println(Jeff.getColor());
    System.out.println(Jeff.getHouseTrained());

    Dog Bob = new Dog("Bob 🐶", "Boxer", 150.1, "Black", false);
    System.out.println(Bob.getName());
    System.out.println(Bob.getBreed());
    System.out.println(Bob.getWeight());
    System.out.println(Bob.getColor());
    System.out.println(Bob.getHouseTrained());

    Dog Jim = new Dog("Jim 🐶", "Labrador", 80.5, "Blonde", false);
    System.out.println(Jim.getName());
    System.out.println(Jim.getBreed());
    System.out.println(Jim.getWeight());
    System.out.println(Jim.getColor());
    System.out.println(Jim.getHouseTrained());

  }
}