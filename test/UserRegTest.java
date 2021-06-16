package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.UserRegistration;

public class UserRegTest {
	@Test
	public void testfirstName_shouldReturnTrue() {
		UserRegistration obj = new UserRegistration();
		String firstname = "Paresh";
		boolean isValidFirstName =UserRegistration.firstName(firstname);
		assertTrue(isValidFirstName);
	}	
	
	@Test
	public void testfirstName_shouldReturnFalse() {
		UserRegistration obj = new UserRegistration();
		String firstname = "paresh";
		boolean isValidFirstName =UserRegistration.firstName(firstname);
		assertFalse(isValidFirstName);
	}
	
	@Test
	public void testlastName_shouldReturnTrue() {
		UserRegistration obj = new UserRegistration();
		String lastname = "Baviskar";
		boolean isValidLastName =UserRegistration.lastName(lastname);
		assertTrue(isValidLastName);
	}	
	
	@Test
	public void testlastName_shouldReturnFalse() {
		UserRegistration obj = new UserRegistration();
		String lastname = "baviskar";
		boolean isValidLastName =UserRegistration.lastName(lastname);
		assertFalse(isValidLastName);
	}
	
	@Test
	public void testemail_shouldReturnTrue() {
		UserRegistration obj = new UserRegistration();
		String email = "paresh22kar@gmail.com";
		boolean isValidemail =UserRegistration.eMail(email);
		assertTrue(isValidemail);
	}	
	
	@Test
	public void testemail_shouldReturnFalse() {
		UserRegistration obj = new UserRegistration();
		String email = "paresh22kar@gmail#&.com";
		boolean isValidemail =UserRegistration.eMail(email);
		assertFalse(isValidemail);
	}
	
	@Test
	public void testphoneno_shouldReturnTrue() {
		UserRegistration obj = new UserRegistration();
		String phno = "91 8408095441";
		boolean isValidphoneno =UserRegistration.phoneNo(phno);
		assertTrue(isValidphoneno);
	}	
	
	@Test
	public void testphoneno_shouldReturnFalse() {
		UserRegistration obj = new UserRegistration();
		String phno = "91  8408095441";
		boolean isValidphoneno =UserRegistration.phoneNo(phno);
		assertFalse(isValidphoneno);
	}
	
	@Test
	public void testpincode_shouldReturnTrue() {
		UserRegistration obj = new UserRegistration();
		String pincode = "425 001";
		boolean isValidpincode =UserRegistration.pinCode(pincode);
		assertTrue(isValidpincode);
	}	
	
	@Test
	public void testpincode_shouldReturnFalse() {
		UserRegistration obj = new UserRegistration();
		String pincode = "4250011";
		boolean isValidpincode =UserRegistration.pinCode(pincode);
		assertFalse(isValidpincode);
	}
	
	@Test
	public void testpassword_shouldReturnTrue() {
		UserRegistration obj = new UserRegistration();
		String password = "Pareshsb@12345";
		boolean isValidpassword =UserRegistration.passWord(password);
		assertTrue(isValidpassword);
	}	
	
	@Test
	public void testpassword_shouldReturnFalse() {
		UserRegistration obj = new UserRegistration();
		String password = "paresh@12345";
		boolean isValidpassword =UserRegistration.passWord(password);
		assertFalse(isValidpassword);
	}
}
