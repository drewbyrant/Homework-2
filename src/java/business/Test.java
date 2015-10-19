/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author drewbryant
 */
public class Test {
  public static void main(String[] args){
    Calculator calc = new Calculator(1000, 5, 10);
    double result = calc.calculate();
    System.out.println(result);
  }
}
