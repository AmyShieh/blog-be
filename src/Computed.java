class Comoute {
  int sum(int x, int y) {
    return x+y;
  }
}

public class Computed {
  public static void main(String[] args) {
    Comoute sumEntity = new Comoute();
    float sum = sumEntity.sum(10, 20);
    System.out.println(sum);
  }
}
