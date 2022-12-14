package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly();
    //obj.m="Dineshkuma";
    //'m' has private access in 'com.driver.RWOnly'
    obj.setName("Dinesh");
    System.out.println(obj.getName());
  }
}