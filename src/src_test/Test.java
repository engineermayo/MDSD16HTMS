package src_test;

import javax.swing.JOptionPane;
import javax.xml.soap.SOAPException;

public class Test {
	
	public void noUsed() {
		
		// BankingAdministrationRequires interface
		try {
			// Acquire AdministratorRequires object
			se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires bankingAdmin = se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
					.instance();
/*			
			// Add new credit card
			if (bankingAdmin.addCreditCard("00000000", "000", 11, 16, "Peter",
					"Pan")) {
				System.out.println("Successfully added credit card.");
			} else {
				System.out.println("Error while adding credit card.");
			}

			// Get current Balance
			double resultBalance = bankingAdmin.getBalance("00000000", "000",
					11, 16, "Peter", "Pan");
			if (resultBalance != -1.0) {
				System.out.println("Balance: " + resultBalance);
			} else {
				System.out.println("Error while checking Balance.");
			}

			// Make a deposit
			resultBalance = bankingAdmin.makeDeposit("00000000", "000", 11, 16,
					"Peter", "Pan", 25.50);
			if (resultBalance != -1.0) {
				System.out.println("Successfully made a deposit: "
						+ resultBalance);
			} else {
				System.out.println("Error while making deposit.");
			}
			
			// Remove an existing credit card
			if (bankingAdmin.removeCreditCard("00000000", "000", 11, 16, "Peter",
					"Pan")) {
				System.out.println("Successfully removed credit card.");
			} else {
				System.out.println("Error while removing credit card.");
			}
*/
		} catch (SOAPException e) {
			System.err
					.println("Error occurred while communicating with the bank administration");
			e.printStackTrace();
		}
	
	}
	
	public void addCard() {
		
		try {
			
			se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires bankingAdmin = se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
					.instance();
			
			if (bankingAdmin.addCreditCard("12121212", "888", 11, 16, "Jill",
					"Johnsson")) {
				System.out.println("Successfully added credit card.");
			} else {
				System.out.println("Error while adding credit card.");
			}
			
		} catch (SOAPException e) {
			System.err
					.println("Error occurred while communicating with the bank administration");
			e.printStackTrace();
		}
		
		
	}

}
