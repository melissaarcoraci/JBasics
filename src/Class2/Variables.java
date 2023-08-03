package Class2;

public class Variables {
    public static void main(String[] args) {
        String firstname="Melissa";
        firstname="Melissa ";
        String lastname="Arcoraci ";
        String grade="A+";
        String city="Charlottesville";
        city="Ruckersville";
        String state=" Virginia";
        String phone="555-5555";
        phone="333-3333";

        System.out.println("My name is "+firstname+lastname);
        System.out.println("I am an " +grade+ " student");
        System.out.println("I live in " +city+state);
        System.out.println("My phone number is " +phone);

        city="Dominical";
        state="Costa Rica";
        phone= "999-9999";
        String espacio=" ";

        System.out.println("My name is "+firstname+lastname);
        System.out.println("I moved to "+city+espacio+state);
        System.out.println("and changed my phone number to "+phone);



    }
}
