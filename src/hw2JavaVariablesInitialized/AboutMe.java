package hw2JavaVariablesInitialized;

public class AboutMe {
	// now initializing String ,int, float , char ,long ,byte ,double and boolean
	// type variables to describe myself
	public String myName;
	public int myAge;
	public float myHeight;
	public char myGender;
	public boolean fullTimeStudent;

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
