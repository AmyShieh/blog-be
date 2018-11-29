public class Radio {
  int openRadio(Battery battery) {
    return battery.electricityAmount -= 10;
  }
}
