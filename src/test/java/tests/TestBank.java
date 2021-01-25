package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Bank;
import model.BankLogic;

public class TestBank {
	BankLogic bankLogic = new BankLogic();
	Bank bank = new Bank("Erica");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateTotalAmount() {
		bank.setCheckingsAmount(3145.50);
		bank.setSavingsAmount(18235.60);
		double total = bankLogic.calculateTotalAmount(bank);
		assertEquals(21381.1, total, 0.0);
		
	}
	
	@Test
	public void testDetermineAccountTypeStudent() {
		bank.setAge(19);
		assertTrue(bankLogic.determineAccountTypeIsStudent(bank));
		
	}
	
	@Test
	public void testDetermineAccountTypeAdult() {
		bank.setAge(39);
		assertFalse(bankLogic.determineAccountTypeIsStudent(bank));
		
	}

}
