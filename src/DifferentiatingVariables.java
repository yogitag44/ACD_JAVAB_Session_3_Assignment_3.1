import java.io.*;    //Java package for file systems I/O
import java.util.Scanner;  //Java package to take input from user

public class DifferentiatingVariables {    //Main Class as there could be only one public class defined in the program

	
//Class level scope---------------------------------------
	//All variables defined directly inside a class are member variable
	
	int RollNumber = 40;    //Class level variable 
	public String Name;  //Class level variable
	
	
// Method Level Scope----------------------------------------------
	public void TestMethod(int Number) {
		// Variable inside a  method
		
		int MethodNumber;
		this.RollNumber = Number;    //"this" keyword differentiate between local and class variable 
									//RollNumber is class level variable and Number is method level Variable
		
		System.out.println("This is method level Scope of variable: "+Number);
		
//Block level Scope-----------------------------------------------		
		{
			int BlockVar  = 20;  			//int variable defined in the scope.
			System.out.println("This variable is inside a block: " + BlockVar);   //defined inside the blocks and can not be used outside these brackets. 
		}
		
		//Below statement will throw error as this variable is outside the blocks 
		// System.out.println(BlockVar);  
	
	}
	
	
	public static void main(String args[]) {    //Main method from where program will start.

		//Class variables can be referred through class name as well as object reference
		
		//Referring class variable through class name
		System.out.println("------Referring class variable through class name------");
		System.out.println(ClassVariable.ClassVar);   //Printing Class integer variable directly using class name.
		System.out.println(ClassVariable.StaticStr);  //Printing Class String variable directly using Class name.
		
		ClassVariable ClassVarObj = new ClassVariable();   //created object of Class ClassVariable

		//Referring class variable through object reference
		
		System.out.println("\n\n------Referring class variable through object reference------");
		System.out.println(ClassVarObj.ClassVar);   //Calling integer variables using object of the class
		System.out.println(ClassVarObj.StaticStr);  //calling string variable using the object of class.
		
		//Instance variables can be referred only through object reference.
		System.out.println("\n\n-----Instance variables can be referred only through object reference.-----");
		InstanceVariable InstVarObj = new InstanceVariable();   //Created object of instance variable 
		System.out.println(InstVarObj.InstanceVar);   //Calling Integer variable using object of class
		System.out.println(InstVarObj.InstanceString);  //calling String variable using object of class 
		
	
        //You can't refer instance variable through class name, you will get compile time error
         
        //System.out.println(A.i);
		
		System.out.println("\n\n----------Exmaple of Scope varibale: -------------");
		DifferentiatingVariables scopeobj = new DifferentiatingVariables();    //created object of main class
		scopeobj.TestMethod(100);    //calling method TestMethod with object of the classs
		
		System.out.println("This is inside a Class and class level scope: "+scopeobj.RollNumber);
	}
}


class ClassVariable{
	static int ClassVar = 20;				//static integer variable
	static String StaticStr = "This is class variable";		//static string variable
}


class InstanceVariable{
	int InstanceVar = 200;    //Instance variable
	String InstanceString = "This is instance variable";   //Instance variable without static keyword
}