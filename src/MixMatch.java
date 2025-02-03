public class MixMatch{
    public static void main(String[] args){
        String myString = "House";
        System.out.println(myString + " <- String, this stores text. It must be wrapped in quotations.");

        char myChar = 'a';
        System.out.println(myChar + " <- Char, which  just holds a single character. Must be wrapped by single quotes.");

        short myShort = 32000;
        System.out.println(myShort + " <- Short, stores a whole number from -32,768 to 32,767.");

        int myInt = 500;
        System.out.println(myInt + " <- Integer, stores a whole number from -2,147,483,648 to 2,147,483,647");

        long myLong = 9000000000L;
        System.out.println(myLong + " <- Long, stores a whole number with greater range than int. Range is -2^63 to 2^63-1.");

        float myFloat = 3.14f;
        System.out.println(myFloat + " <- Float, stores a 32-bit floating point number with low precision.");

        double myDouble = 2.718;
        System.out.println(myDouble + " <- Double, stores a 64-bit floating point number with double precision than a float.");

        boolean myBool = true;
        System.out.println(myBool + " <- Boolean, stores either a true or false value.");
    }
}