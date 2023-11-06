package java_week_9;

import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11_CompareArrayList {

    public static void compareArray(){

        //ArrayList 1
        ArrayList<String> a1 = new ArrayList();
        a1.add("Red");
        a1.add("Green");
        a1.add("Black");
        a1.add("White");
        a1.add("pink");

        //ArrayList 2
        ArrayList<String> a2 = new ArrayList();
        a2.add("Red");
        a2.add("Green");
        a2.add("Black");
        a2.add("Pink");

        //comparison output in ArrayList<String>

        boolean areEqual = a1.equals(a2);
        if(areEqual){
            System.out.println("a1 and a2 are equal.");
        }else {
            System.out.println("a1 and a2 are not equal");
        }
    }
    //declaring main method
    public static void main(String[] args) {

        compareArray();
    }


}
