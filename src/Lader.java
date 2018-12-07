public class Lader {
  double top;
  static double bottom;
  double height;
  void setTop(double top) {
    this.top = top;
  }
  void setBottom(double bottom) {
    Lader.bottom = bottom;
  }

  double getTop() {
    return top;
  }

  double getBottom() {
    return bottom;
  }

  double getArea() {
    return (top + height) * height / 2;
  }
}
