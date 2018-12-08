package com.alive.amy;

public class Student {
  int number;
  Student(int number) {
    this.number = number;
  }
  void speak() {
    System.out.println("我的学号是"+number);
  }
}
