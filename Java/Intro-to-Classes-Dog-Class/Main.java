class Main {
  public static void main(String[] args) {
    Dog d1 = new Dog(6, "German Shepherd", 7.5, true);
    System.out.println("\nDog #1\nAge: "+d1.dogAge());
    System.out.println("Breed: "+d1.getBreed());
    System.out.println("Weight: "+d1.dogSize());
    System.out.println(d1.bark(2));
    System.out.println("Dog #1 "+d1.sit());

    Dog d2 = new Dog(10, "Labrador Retriever", 1.4, false);
    System.out.println("\nDog #2\nAge: "+d2.dogAge());
    System.out.println("Breed: "+d2.getBreed());
    System.out.println("Weight: "+d2.dogSize());
    System.out.println(d1.bark(5));
    System.out.println("Dog #2 "+d2.sit());
  }
}