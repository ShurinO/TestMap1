package com.brainacad.oop.testmap1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    MyTranslator translator = new MyTranslator();
    translator.addNewWord("cat","кот");
    translator.addNewWord("dog","собака");
    translator.addNewWord("mouse","мышь");
    translator.addNewWord("rat","крыса");
    Scanner scanner = new Scanner(System.in);
    String en = scanner.next();

    System.out.println(translator.translate(en));
  }
}
