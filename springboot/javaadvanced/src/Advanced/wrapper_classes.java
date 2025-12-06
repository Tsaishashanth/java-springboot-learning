package Advanced;

public class wrapper_classes {
    public static void main(String[] args) {
        //wrapperclasses are classes that convert primitive data types into objects
        //primitve data types - int,char,boolean,float,doule,long,byte,short
        //their wrapper classes - Interger, Character, Boolean, Float, Double, Long, Byte, Short
        //the main reason we use wrapper classes is for ArrayLIst, Hashmap like this Arraylist<Integer>, we cannot keep like this ArrayList<int>


        //we use to assign like this before for the object version of that value
//        Integer a = new Integer(123);
//        Double b = new Double(3.14);
//        Character c = new Character('a');
//        Boolean d = new Boolean(true);

        //now use like this
        Integer ab = 10; //autoboxing;
        int ac = ab; //unboxing;

        int a = 10; //primitive type
        Integer b = 10; //wrapper class object

        //wrapper classes provide usefull methods
        b.toString();

        // provides usefull methods
        Integer.parseInt("20");
        Character.isDigit('5');
        Double.parseDouble("3.14");
        Boolean.parseBoolean("true");
        char f = "pizza".charAt(0);

        //some other methods
        char letter = 'b';
        System.out.println(Character.isLetter(letter)); //prints true;
        System.out.println(Character.isUpperCase(letter)); //false since b is lowercase


        //wrapper objects can hold null values
        Integer bd = null;
        //int de = null; -> this cant be null
    }
}

