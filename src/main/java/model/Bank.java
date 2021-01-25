package model;

public class Bank {
	private String name;
	private double checkingsAmount;
	private double savingsAmount;
	private int age;
	
	public Bank() {
		
	}
	
	public Bank(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCheckingsAmount() {
		return checkingsAmount;
	}
	public void setCheckingsAmount(double checkingsAmount) {
		this.checkingsAmount = checkingsAmount;
	}
	public double getSavingsAmount() {
		return savingsAmount;
	}
	public void setSavingsAmount(double savingsAmount) {
		this.savingsAmount = savingsAmount;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
