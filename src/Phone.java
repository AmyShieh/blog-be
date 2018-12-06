public class Phone {
  public static void main(String[] args) {
    Mobile mob = new Mobile();
    mob.setSIM(new SIM(18080000000L));
    System.out.println(mob.lookNumber());
    mob.setSIM(new SIM(15708430000L));
    System.out.println(mob.lookNumber());
  }
}
