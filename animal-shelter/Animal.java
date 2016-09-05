class Animal {
  public String mName;
  public int mAge;
  public String mBreed;
  public String mAnimalType;
  public String mColor;
  public int mPrice;
  public boolean mAdopted;

  Public Animal(String name, int age, String breed, String animalType, String color, int price, boolean adopted) {
    mName = name;
    mAge = age;
    mBreed = breed;
    mAnimalType = animalType;
    mColor = color;
    mPrice = price;
    mAdopted = false;
  }

  public boolean worthAge(int maxAge){
    return(mAge < maxAge);
  }
  public boolean worthAdopted(){
    mAdopted = true;
    return mAdopted;
  }

}
