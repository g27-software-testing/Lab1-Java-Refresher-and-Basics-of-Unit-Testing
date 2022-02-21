package tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Account;
import model.Transaction;
import model.User;

public class UserTest {
	
	public static void main (String[] args) throws ParseException {
		
/*
		 OLD: Manual Testing
		 * 
		User testUser = new User("mike@gmail.com", "my_passwd", "Mike", "Smith", "07771234567");
		System.out.println(testUser.toString());
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);		
		Date accountOpening = simpleDateFormat.parse("2022-01-01");
	
		Account testAccount = new Account("12345", "mike@gmail.com", "Standard", accountOpening);
		System.out.println(testAccount.toString());		
		
		Date transactionDate = simpleDateFormat.parse("2022-01-05");
		Transaction testTransaction = new Transaction("12345", 1000.00, transactionDate);
		System.out.println(testTransaction.toString());
		
*/

		
		//Automated testing
		
		// 1-Setup the object and test data, initialise
		// See the four steps in:
		String testUsername = "mike";
		String testPassword = "my_passwd";
		String testFirstName = "Mike";
		String testLastName = "Smith";
		String testMobileNumber = "07771234567";
		
		// 2-Exercise, run the object under test
		User testUser = new User(testUsername, testPassword, testFirstName,
				testLastName, testMobileNumber);
		
		// 3-Verify (Assert)
		
		Boolean passed = true;
		
		if(testUser.getUsername() != testUsername) {
			System.out.println("TC1 failed: username did not match");
			passed = false;
		}
		if (testUser.getPassword() != testPassword) {
			System.out.println("TC2 failed: password did not match");
			passed = false;
		}
		
		/* TODO1: DO THREE OTHER IF-CODE BLOCKS JUST LIKE THE ABOVE TWO,
		 * TO VERIFY THEOTHER THREE FIELDS OF THE CLASS */
		
		if (testUser.getFirstName() != testFirstName) {
			System.out.println("TC3 failed: first name did not match");
			passed = false;
		}
		if (testUser.getLastName() != testLastName) {
			System.out.println("TC4 failed: last name did not match");
			passed = false;
		}
		if (testUser.getMobileNumber() != testMobileNumber) {
			System.out.println("TC5 failed: mobile number did not match");
			passed = false;
		}
		 
		if (passed)
			System.out.println("All TC's passed.");
		
		//Using asserts
		
		assert testUser.getUsername() == testUsername;
		
		//assert 1==2;
		/* TODO2: add the other assertions like the above one.
		  to verify the other four fields of the class  */
		
		
		assert testUser.getPassword() == testPassword;
		assert testUser.getFirstName() == testFirstName;
		assert testUser.getLastName() == testLastName;
		assert testUser.getMobileNumber() == testMobileNumber;
		System.out.println("All Java assertions in the test suite passed (none failed)");

		
	}
	

}
