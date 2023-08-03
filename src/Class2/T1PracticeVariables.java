package Class2;
/*
Create a Java Program (any class with a main method) and name it Practice Variables
In your program create 8 variables to store all different types of primitive data
Print the value of each variable
 */
public class T1PracticeVariables { //pascalCase
    public static void main(String[] args) {

        byte verySmallWholeNumBox=126;
        short smallWholeNumBox=1200;
        int mostWidelyUsedWholeNumBox=1256220; //camelCase
        long largeWholeNumBox= 123456789L;

        float mediumDecimalBox= 3.14F;
        double largeDecimalBox= 12345.56789;
        char singleCharacterBox='M';
        boolean trueFalseBox=true;
        System.out.println(verySmallWholeNumBox);
        System.out.println(smallWholeNumBox);
        System.out.println(mostWidelyUsedWholeNumBox);
        System.out.println(largeWholeNumBox);

        System.out.println(mediumDecimalBox);
        System.out.println(largeDecimalBox);
        System.out.println(singleCharacterBox);
        System.out.println(trueFalseBox);
    }
}
