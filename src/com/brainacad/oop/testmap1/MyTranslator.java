package com.brainacad.oop.testmap1;

import java.util.HashMap;

public class MyTranslator {
  private HashMap<String,String> dictionary;

  public MyTranslator() {
    dictionary = new HashMap<>();
  }

  public void addNewWord(String en, String ru){
    dictionary.put(en, ru);
  }

  public String translate(String en){
    return dictionary.getOrDefault(en,"Not in the dictionary!");
  }
}
