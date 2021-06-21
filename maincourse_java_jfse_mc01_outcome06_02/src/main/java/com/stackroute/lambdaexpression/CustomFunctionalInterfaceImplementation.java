package com.stackroute.lambdaexpression;

/* Complete the class as per the requirements given in PROBLEM.md */
public class CustomFunctionalInterfaceImplementation {
    MyFunction<Integer> cubeOfNumber = (Integer num1) ->{return num1*num1*num1;};
    MyFunction<String> changedCase = (String str) ->
    {
        String changeCase = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
                changeCase =changeCase+ ch;

            } else if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
                changeCase =changeCase+ ch;


            }

        }
        return changeCase;
    };

    public static void main(String args[]) {
        CustomFunctionalInterfaceImplementation myFunction = new CustomFunctionalInterfaceImplementation();
        System.out.println(myFunction.cubeOfNumber.doJob(5));
        System.out.println(myFunction.changedCase.doJob("tharun"));
    }
}
