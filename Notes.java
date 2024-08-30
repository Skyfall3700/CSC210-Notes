/* File: Notes.java
 * Author: Matthew Nguyen
 * Purpose: This file holds the notes taken during the CSC 210 Fall 2024 course
 */

class ReadingNotes {
	/* 1.5 Java Language Elements
	"/*" can be used to open comments, including multi-line comments, while the reverse can be used to close comments
	"//" turns the rest of the line into a comment
	Multi-line comments cannot be nested in another multi-line comment
	
	Beginning and Ending braces should be aligned for clarity, and end braces should have comments annotating them
	
	There are 50 defined keywords, all written in lower-case
	Java names are case sensitive, and there are two style conventions for classes, variables, and methods
	Class names begin with a capital letter, and use capital letters to distinguish words (HelloWorld)
	Variable and method names begin with lower-case letters, but also use capital letters to distinguish words (getInput())
	Descriptive identifiers should be chosen for class, variable, and method names to make programs readable
	
	Every piece of data is classified according to data type
	There are two categories of data: objects and primitive data types
	Objects include built-types like String and PrintStream
	Primitive types use keywords like int for integers, double for floats, and boolean
	Variables are named storage locations that can store a value of a particular type, but only that type
	Literal values are actual values that occur in a program. the string "Hello, World!" is a string literal
		following, the number 45.2 is a double literal, and -72 is an int literal
		
	Statements end with semicolons, else java outputs a syntax error
	Variables must be declared before they can be used, else syntax error
		declarations begin with the variable's type, followed by the name, ending with a semicolon:
			Type VariableName;
		declarations can also include an assignment
			Type VariableName = Value;
		declarations are used to tell java to set aside memory for that variable
	Assignment statements are statements that assign values to a variable using the assignment operator (=)
		simplest form uses the syntax above, variable = value;
	When printing to console, you can concatenate ints and strings
	Method calls are also statements, because calling a method executes the code written inside
	
	Data manipulation is done with expressions
		This uses operators, such as +, =, <, ==, etc.
	Expressions cannot occur on their own
	Expressions have a type that depend on the data being manipulated. 
		Adding ints outputs another int, while comparing them outputs a boolean

	Java programs consist of one or more class definitions.
		You cannot have a java program that does not include a class, as the main() function is created within these classes
	Java also has predetermined classes, such as Object, String, and System, which can be used in any program
	Class definitions have two parts, a class header and class body
		A class header is written as follows:
			public class HelloWorld extends Object
				This header gives the class its name (HelloWorld), 
				identifies its accessibility (public or private),
				and describes where it fits into Java class hierarchy (extension of Object class)
				extends Object is not necessary, however, as Java auto assumes that the class is a subclass of Object
		The class body is within the braces {} and contains declarations and definitions of attributes and methods
	
	Instance variables are variables that belong to each object/instance of the class
	I.e., each instance of a class has its own copies of the instance variables
	In general, an instance variable declaration has the syntax:
		[Modifiers] Type VariableName [InitializerExpression]
			where Modifiers include public/private
				private meaning that it can only be accessed within the class, and not by other classes
			Type refers the the type of variable, being int, string, or some other keyword/Object
			VariableName refers to the name of the variable
			and InitializerExpression, and optional component that can be used to assign a value
	
	In java classes, methods correspond to the Object's behaviors or actions
	Defining a method consists of two parts, a method header and body
		Where the header looks like
			[Modifiers] ReturnType MethodName ([ParameterList])
				 where modifiers refers to public/private,
				 ReturnType refers to the type of value (if any) that is returned. 
				 	If the function will not return anything, then they will have a return type void, 
				 	meaning they don't return anything
				 	These methods just execute statements in their bodies
				 MethodName is the name of the method
				 ParameterList is an optional list of any parameters that may be used within the method
				 	If the method does not call any external variables/is not passed any info, then a parameter list is not needed.
		And the body within the braces {} that contains the executable statements
	
	The HelloWorld program is a java application program, or a java application for short
	This refers to a stand-alone program, in the sense that it does not depend on any other program
		(Such as a web browser)
	Every application must contain a main() method, where execution begins when the program is ran
	For programs with multiple classes, the programmer decides which holds the main function
	Because of its unique role, the header for the main method must be declared as such:
		public static void main(String args[])
			public allows it to be accessed outside the class
			static means that the method is associated with the class, not with the objects or instances
				As such, the method can be called before the program has created any instances (or objects) of that class
			void means that the method does not return anything
			String args[] allows us to pass an array of string arguments to the program on startup
	
	In order to use a class, we must first create an object
	In order to create an object, we must first declare a variable
	We can then assign that variable to a class object, by calling the class constructor
		The constructor has the same name as the class and just creates an object of the class.
			It looks like: public ClassName() {		}
	Creating an object is called object instantiation because you are creating an instance of the object
	Now that you have creating a class instance, you can use it to call class methods.
	Creating the object uses the syntax
		ObjectType VariableName [InitializerExpression]
			where ObjectType is typically the class name, as this statement will be called within the class
			VariableName is the name of your variable
			and InitializerExpression is an optional component that gives your variable a value
				(a new instance of the class)
	The HelloWorld may only have one user created object, but it is still a collection of interacting objects
	Besides the variable we create, there also exists the greeting object which is a string, 
	and the system.out object, a special java system object for printing
	
	Java can run programs in JFrames, so the output and interactions occur in a window or frame.
	This means that instead of outputting in the console, it can output on a window
	Much like HelloWorld, HelloWorldCanvas (a java program that uses JFrames) contains a single method
		paint(), which contains one executable statement:
			g.drawString("Hello, World!", 10, 10);
	This statement displays the message directly in a window. 
	The drawString() method is one of the methods defined within the graphics class, referred to here as g
	
	Packages are collections of inter-related classes in the Java class library
		for example, java.lang contains classes like object, string, and system, which are central to the Java language
	All java classes belong to some package, including those that are programmer defined.
	To assign classes to packages, you would provide a package statement as the first statement in the file that contains the class def.
	If you omit package statements, java places the class in an unnamed default package
	Thus, java class full names include the package they are contained in
		i.e., the system class is java.lang.system
	The full name for a java class takes the form "package.class"
	Only java.lang classes can be referred to without the package name
	
	the "import" statement makes java classes available to programs under abbreviated names
	import does not load classes into the program, it just makes abbreviated names available
		This is different from python, which also executes imported files
	import statements takes two possible forms:
		import package.class
		import package.*
	The first form allows for abbreviation of classes
	The asterisk allows all the classes in the package to be known by their abbreviation
	
	Qualified names are names that are separated into parts using java's dot notation
		This includes package names (java.awt), class names (java.swing.JFrame), and method names (helloworld.greet())
	The meaning of a name within a java program depends on context
		helloworld.greet() refers to the greet() method, which belongs to the HellowWorld class
		If used in within the class, quantifying the name is unnecessary. 
		Referring to greet() would be clear as to what method is being called.
			It is the same logic as using the first name, 
			but using the full name when just the first name would be too vague or ambiguous
	
	By convention, class names in Java begin with an upper-case letter
	When referenced as part of a package, the class name is the last part of the name
	*/
	
	/* 2.4 Class Definition
	A class definition encapsulates its objects data and behavior. Once a class
	
	
	*/
}

public class Notes {
	// In class notes
	
	/*
	
	
	*/
}
