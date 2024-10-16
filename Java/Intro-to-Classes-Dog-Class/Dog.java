public class Dog {

  //instance variables
  private int age;
  private String breed;
  private double weight;
  private boolean sitting;

  public Dog(int a, String b, double w, boolean s) {
  age = a;
  breed = b;
  weight = w;
  sitting = s;
  }

  public int dogAge(){
    return age;
  }
  public String getBreed(){
    return breed;
  }
  public double dogSize(){
    return weight;
  }
  public String bark(int num) {
   String sound = "";
   for(int i = 0; i < num; i++) {
      sound += "woof ";
   }
   return sound;
  }
  public String sit() {
    if(sitting)
      return "is sitting";
    else
      return "is not sitting";
  }
}