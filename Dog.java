public class Dog {

  private String name;
  private String breed;
  private double weight; 
  private String color;
  private boolean houseTrained;


  public Dog(String dogName, String dogBreed, double dogWeight, String dogColor, boolean dogHouseTrained){
  name = dogName;
  breed = dogBreed;
  weight = dogWeight; 
  color = dogColor;
  houseTrained = dogHouseTrained;
  }
  public String getName(){
    return this.name;
  }
  public String getBreed(){
    return this.breed;
  }
  public double getWeight(){
    return this.weight;
  }
  public String getColor(){
    return this.color;
  }
  public boolean getHouseTrained(){
    return this.houseTrained; 
  }
}