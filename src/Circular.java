public class Circular {
  Circle bottom;
  double height;
  Circular(Circle c, double h) {
    bottom = c;
    height = h;
  }
  double getVolume() {
    return  (bottom.getArea() * height)/3;
  }
  double getBottomRadius() {
    return bottom.getRadius();
  }
  public void setBottomRadius(double r) {
    bottom.setRadius(r);
  }
}
