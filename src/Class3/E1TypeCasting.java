package Class3;

public class E1TypeCasting {

    public static void main(String[] args) {
        //byte->short->int->long->float->double (in order of size smalltolarge)
        long age=12985749287L;

        // byte myAge=age;

        byte num=10;
        int numTwo=num;
        System.out.println(numTwo);


        float num1=15.6f;
        int num2;
        num2=(int)num1;

        System.out.println(num2);

    }
}
