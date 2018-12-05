public class GetCircular {
  public static void main(String[] args) {
    Circle circle = new Circle(10);
    Circular circular = new Circular(circle, 3);
    double circularVolume = circular.getVolume();
    System.out.println(circularVolume);
    circular.setBottomRadius(20);
    System.out.println(circular.getVolume());
    System.out.println(circular.getBottomRadius());
    System.out.println(circle.getRadius());
    circle = new Circle(1000);
    System.out.println(circular.getBottomRadius());
    System.out.println(circle.getRadius());
  }
}
