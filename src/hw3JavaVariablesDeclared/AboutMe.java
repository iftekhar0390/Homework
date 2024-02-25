package hw3JavaVariablesDeclared;

public class AboutMe {

	public String myCountry; // variable Declared

// now initializing String ,int, float , char and boolean type variables to describe myself
	public String myName = "Iftekhar";
	public int myAge = 99;
	public float myHeight = 5.1100f;
	public char myGender = 'f';
	public boolean fullTimeStudent = true;

//Declare a default Constructor 
	public AboutMe() {
		System.out.println(": ------------ This is all about Myself ------------:");
	}

// Step 6 : Implement a void type method 

	public void aboutMe() {

		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Height: " + myHeight + "\nMy Gender: "
				+ myGender + "\nI Am a Full Time Student: " + fullTimeStudent);

	}

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // Instantiate AboutMe/default constructor initialized here
		aboutMe.aboutMe(); // (object called aboutMe) method initialized
	}

}
