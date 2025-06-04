public class person {
  int x = 5;

  public static void main(String[] args) {
    person myObj1 = new person();
    person myObj2 = new person();
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }
}
