public class Circle {
  double radius;
  double area;
  double pi = 3.14;
  Circle(double r) {
    radius = r;
  }
  void setRadius(double r) {
    radius = r;
  }
  double getRadius() {
    return radius;
  }
  double getArea() {
    return pi * radius * radius;
  }
}
