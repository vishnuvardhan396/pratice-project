public class dogconstructor {
  int x;

  public dogconstructor(int y) {
    x = y;
  }

  public static void main(String[] args) {
	  dogconstructor myObj = new dogconstructor(5);
    System.out.println(myObj.x);
  }
}
