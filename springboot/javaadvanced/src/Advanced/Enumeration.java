package Advanced;

public enum Enumeration {

    //special kind of class that represents a fixed set of constants
    // more efficient with switches when comparing strings

    sunday(1), monday(2), tuesday(3),wednesday(4), thursday(5), friday(6), saturday(7);

    private final int daynumber;

    Enumeration(int daynumber) {
        this.daynumber= daynumber;
    }

    public int getDaynumber(){
        return this.daynumber;
    }

    public static void main(String[] args) {
        Enumeration day = Enumeration.sunday;
        //Enumeration day = Enumeration.valueOf(sunday);    //--> didnt understand this code what - valueof - justconvets value to string innormal

        System.out.println(day);
        System.out.println(day.getDaynumber());

        //enums works better with enhansed switches
        switch (day) {
            case monday,tuesday, wednesday, thursday, friday -> System.out.println("this is a week day");
            case  saturday, sunday -> System.out.println("this is a weekday");
        }
    }
}
