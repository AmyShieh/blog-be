public class UseRadio {
  public static void main(String[] args) {
    Radio radio = new Radio();
    Battery battery = new Battery(100);
    System.out.println(battery.electricityAmount);
    radio.openRadio(battery);
    System.out.println(battery.electricityAmount);
  }
}
