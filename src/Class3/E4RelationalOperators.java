package Class3;

public class E4RelationalOperators {

    public static void main(String[] args) {

        System.out.println(15>10);
        System.out.println(15>20);
        //the greater and less than signs always result in a boolean
        //you can also get the same result using the boolean variable


        //performed a relational operation store them in result of variable
        boolean result=100>205;
        System.out.println(result);

        //will the same work for a String?
        String a="aladdin";
        String b="deeplai";
        //no- this will not work --> System.out.println(a>b);
        //but if we print out like this:

        System.out.println('C'>'D'); //this will work! because of the ascii table!
        // in ascii table: c=67 and b=66 so 67>66 which will make this true!

    }
}
