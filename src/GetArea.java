public class GetArea {
  public static void main(String[] args) {
    Lader lader = new Lader();
    Rect rect = new Rect();
    lader.top = 10;
    Lader.bottom = 20;
    lader.height = 5;
    System.out.println("Lader's bottom:"+ lader.getBottom());
    System.out.println("Lader's area:"+ lader.getArea());

    rect.width = 15;
    rect.height = 15;
    System.out.println("rect's area:" + rect.getArea());
  }
}
