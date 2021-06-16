package main;

public class UserRegistration {
	public static boolean firstName(String fname) {
		String regexFname = "^[A-Z]{1}[a-z]{2,}";

		if (fname.matches(regexFname) == true) {
			System.out.println("The first name " + fname + " is valid.");
		} else {
			System.out.println("The first name " + fname + " is invalid.");
		}
		return false;
	}

	public static boolean lastName(String lname) {

		String regexFname = "^[A-Z]{1}[A-Za-z]{2,}$";

		if (lname.matches(regexFname) == true) {
			System.out.println("The last name " + lname + " is valid.");
		} else {
			System.out.println("The last name " + lname + " is invalid.");
		}
		return false;
	}

	public static boolean eMail(String email) {

		String regexFname = "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}([.][A-Za-z]{2})*$";

		if (email.matches(regexFname) == true) {
			System.out.println("The eMail " + email + " is valid.");
		} else {
			System.out.println("The eMail " + email + " is invalid.");
		}
		return false;
	}

	public static boolean phoneNo(String phnum) {

		String regexFname = "^[+]{0,1}[0-9]{2,3}[: :][7-9]{1}[0-9]{9}$";

		if (phnum.matches(regexFname) == true) {
			System.out.println("The Ph. number " + phnum + " is valid.");
		} else {
			System.out.println("The Ph. number " + phnum + " is invalid.");
		}
		return false;
	}

	public static boolean pinCode(String pin) {

		String regexFname = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";

		if (pin.matches(regexFname) == true) {
			System.out.println("The Pincode " + pin + " is valid.");
		} else {
			System.out.println("The Pincode " + pin + " is invalid.");
		}
		return false;
	}

	public static boolean passWord(String pass) {

		String regexFname = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";

		if (pass.matches(regexFname) == true) {
			System.out.println("The password " + pass + " is valid.");
		} else {
			System.out.println("The password " + pass + " is invalid.");
		}
		return false;
	}
}
