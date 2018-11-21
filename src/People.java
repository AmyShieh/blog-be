public class People {
  int height;
  String eye;
  void speak(String sentence) {
    System.out.println(sentence);
  }
}

class person {
  public static void main(String[] args) {
    People amy;
    amy = new People();
    amy.height = 158;
    amy.eye = "blink";
    System.out.println("身高"+amy.height);
    System.out.println("眼睛"+amy.eye);
    amy.speak("I'm brave, and alive");
  }
}




