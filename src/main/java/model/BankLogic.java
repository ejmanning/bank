package model;

public class BankLogic {
	
	public double calculateTotalAmount(Bank bank) {
		double total = 0;
		total = bank.getCheckingsAmount() + bank.getSavingsAmount();
		return total;
	}
	
	public double calculatePercentInSavings(Bank bank) {
		double percentInSavings = 0;
		double total = calculateTotalAmount(bank);
		percentInSavings = (bank.getSavingsAmount() / total) * 100;
		return percentInSavings;
	}
	
	public double calculatePercentInCheckings(Bank bank) {
		double percentInCheckings = 0;
		double total = calculateTotalAmount(bank);
		percentInCheckings = (bank.getCheckingsAmount() / total) * 100;
		return percentInCheckings;
	}
	
	public boolean determineAccountTypeIsStudent(Bank bank) {
		if (bank.getAge() < 22) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
