public class UseRadio {
  public static void main(String[] args) {
    Radio radio = new Radio();
    radio.openRadio(new Battery(100));
    System.out.println(new Battery(100).electricityAmount);
    System.out.println(radio.openRadio(new Battery(100)));
  }
}
