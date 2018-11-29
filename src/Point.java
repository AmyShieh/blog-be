public class Point {
  int x;
  int y;

  Point() {
    x = 1;
    y = 1;
  }
  Point(int a, int b) {
    x = a;
    y = b;
  }
}

class Test {
  public static void main(String[] args) {
    Point point1, point2;
    point1 = new Point();
    point2 = new Point(3,5);
    System.out.println(point1.x);
    System.out.println(point2.y);
  }
}
