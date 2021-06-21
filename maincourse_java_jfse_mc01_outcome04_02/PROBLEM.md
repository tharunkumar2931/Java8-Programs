## Problem Statement: Super class method computes the product of two integers and Subclass overrides the method to compute the power of two integers 

This exercise should be completed using Test Driven Development Technique

  - Write Test classes in the TDD approach 
  - Functionality of methods should be completed, such that all the test cases pass 
  - Some requirements/hints are mentioned below


    In this problem, the Super class method computes the product of two integers and Subclass overrides the method to compute the power of two integers

      - Should return product result when super type method is called using lambda expression created using method reference
      - Should return power result when sub type method is called using lambda expression created using method reference
   ```
   Class CalculatorUtility is the super class that must be implemented using TDD for the following method
     - This method returns the product of given two integers  

        + compute(): double
  
   Class NewCalculatorUtility is a subclass of CalculatorUtility that must be implemented using TDD for the following methods

     - This method creates a lambda expression which uses the compute method of the sub class NewCalculatorUtility 
        Syntax used for method reference : this::instanceMethod

        + getPowerResult(): double

     - This method creates a lambda expression which uses the compute method of the super class CalculatorUtility
        Syntax used for method reference : ClassName.super::instanceMethod  
  
        + getProductResult(): double  

     -  Overridden method to return the power of given two integers

        @Override
        + compute(): double
                return the power of given two integers

```
**Note: use BiFunction functional interface, Method reference using super keyword**  

- Write the test cases in the class `NewCalculatorUtilityTests`.    
- Minimum test cases expected: 8
- Test cases should be written for positive and negative scenarios, wherever applicable
- Test methods should follow (given...ThenShould) naming convention.
    - For example: `givenTwoIntegersWhenAddedThenShouldReturnSum`. If the method name is very long,then you can skip `when` part.
- Test coverage should be 100%
 
   
## Instructions
- Avoid printing unnecessary values other than expected output as given in the sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding  

## Code coverage 

 - Run mvn test, the JaCoCo code coverage report will be generated at target/site/jacoco/*
 - Open the target/site/jacoco/index.html file, review the code coverage report 
 
            - Green – Code is tested or covered.
            - Red – Code is not tested or covered.
            - Yellow – Code is partially tested or covered.
 - Make sure lines coverage must meet the minimum 90%

