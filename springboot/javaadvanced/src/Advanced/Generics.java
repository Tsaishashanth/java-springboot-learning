package Advanced;

public class Generics<T, U, V> {

    //in simple generics means using<> and symobls which can define in the reference types

    //Generics = A concept where you can write a class, interface , or method
    //           that is compatible with different data types

    T item;
    U item1;
    V item2;

    public void setItem (T item) {
        this.item = item;
    }
    public T getitem () {                               //methods
        return this.item;
    }
     public Generics (U item1, V item2) {              //constructors
        this.item1 = item1;
        this.item2 = item2;

    }

    public static void main(String[] args) {

        Generics<String, String, String> box = new Generics<>("apple", "salad");

        box.setItem("banana");
        System.out.println(box.getitem());

    }
}
