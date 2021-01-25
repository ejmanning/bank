package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Bank;
import model.BankLogic;

public class TestBankPercent {
	BankLogic bankLogic = new BankLogic();
	Bank bank = new Bank("Erica");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculatePercentInSavings() {
		bank.setCheckingsAmount(3829.56);
		bank.setSavingsAmount(18000.00);
		double percent = bankLogic.calculatePercentInSavings(bank);
		assertEquals(82.45, percent, 0.1);
	}
	
	@Test
	public void testCalculatePercentInCheckings() {
		bank.setCheckingsAmount(3829.56);
		bank.setSavingsAmount(18000.00);
		double percent = bankLogic.calculatePercentInCheckings(bank);
		assertEquals(17.55, percent, 0.1);
	}

}
