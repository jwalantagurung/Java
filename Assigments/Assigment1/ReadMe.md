Reflection in Java



	Reflection is the ability of a program to analyze itself. The java.lang.reflect package provides the ability to obtain the information about the fields,constructors,methods, and modifiers of a class.Normally such information is needed to build software tools that enable us to do work with Java Beans components. The tools use reflection to determine dynamically the characteristics of a component.

	Java reflection is useful because it supports dynamic retrieval of information about classes and data structures by name, and allows for their manipulation wityhin an executing Java program.This feature is extremely powerful and has no equivalent in other convectional languages such as C,C++,Fortan,or pascal.
	Advantages of Reflection
	Extensibility features
	Debugging & Testing tools



	Drawbacks of Reflection
	Reflection is a powerful tool to inspect the code.It helps in debugging .Its can be used to modify the runtime behavior of the application running in JVM. But it should not be used often, because it is comes with some disadvantages.
	Performance Overhead
	Security Restrictions
	Exposure of Internals


	Program::
	package person;

public class PersonClass{
  String name;
  Integer age;

  public PersonClass(){
    this.name = "Jwolan";
    this.age = 25;
  }

  public String getName(){
    return name;
  }

  public Integer getAge(){
    return age;
  }
}

	
