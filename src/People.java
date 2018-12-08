public class People {
  int height;
  String eye;
  void speak(String sentence) {
    System.out.println(sentence);
  }
}

class Kernighan {
  public static void main(String[] args) {
    int sum = 0, i = 0, j = 100;
    for (i = 1; i <= j; i+=1) {
      sum += i;
    }
    System.out.println(sum);
  }
}

class Person {
  int leg;
  int hand;
  String name;

  public static void main(String[] args) {
    People amy;
    amy = new People();
    amy.height = 158;
    amy.eye = "blink";
    System.out.println("身高"+amy.height);
    System.out.println("眼睛"+amy.eye);
    amy.speak("I'm brave, and alive");
    Person alive = new Person("Alive");
  }

  Person(String name) {
    this.name = name;
    this.init();
    System.out.println(name+" has "+leg+" leg and " + hand + " hand");
  }

  void init() {
    leg = 2;
    hand = 2;
  }
}




