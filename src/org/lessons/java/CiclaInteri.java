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

  // bonus

  public CiclaInteri() {
    this.numsArray = new int[0];
  }

  public void addElemento(int newElement){
    int[] newArray = new int[this.numsArray.length + 1];
    for (int i = 0; i < this.numsArray.length; i++) {
      newArray[i] = this.numsArray[i];
    }
    newArray[newArray.length - 1] = newElement;
    this.numsArray = newArray;
  }
}
