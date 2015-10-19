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
public class Calculator {
  private double amount;
  private double rate;
  private int years;
  
  public Calculator(){
    amount = 0;
    rate = 0;
    years = 0;
  }
  public Calculator(double amount, double rate, int years){
    this.amount = amount;
    this.rate = rate;
    this.years = years;
  }
  public void setAmount(double amount){
    if(amount >= 0){
      this.amount = amount;
      return;
    }
    this.amount = 0;
  }
  public double getAmount(){
    return this.amount;
  }
  public void setRate(double rate){
    if(rate >= 0 && rate <= 100){
      this.rate = rate;
      return;
    }
    this.rate = 0;
  }
  public double getRate(){
    return this.rate;
  }
  public void setYears(int years){
    if(years >= 0){
      this.years = years;
      return;
    }
    this.years = 0;
  }
  public int getYears(){
    return this.years;
  }
  
  public double calculate(){
    int intAmount;
    double newRate = rate/100;
    double newAmount = amount;
    for(int i = 1; i <= years; i++){
      newAmount += newAmount * newRate;
    }
    newAmount = newAmount * 100;
    intAmount = (int)newAmount;
    newAmount = (double)intAmount / 100;
    return newAmount;
  }
}
