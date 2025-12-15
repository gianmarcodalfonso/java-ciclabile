package org.lessons.java;

public class CiclaInteri {
  private int[] numsArray;
  private int currentIndex = 0;

  // costruttore
  public CiclaInteri(int[] numeri) {
    this.numsArray = numeri;
  }

  public int getElementoSuccessivo() {
    int currentElement = numsArray[currentIndex];
    currentIndex++;
    return currentElement;
  }

  public boolean hasAncoraElementi() {
    return currentIndex < numsArray.length;
  }
}
