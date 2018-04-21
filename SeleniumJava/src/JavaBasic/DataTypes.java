package JavaBasic;

/*This is my first Java Code
* www.github.com/jashangunike
* Author-Jashandeep Singh */

import java.sql.SQLOutput;

public class DataTypes {

    public static void main(String[] args) {
        /*Data Type : int, Double, Char, Boolean, */

        /*First datatypes int*/

        int i=10; // initial value of i is 10
           i=20; // here 20 is updated value of i
           i=30; // here 30 is final updated value of i
        int j=30;
        int k=40;
        System.out.println(i); // here final updated values comes of i i.e. 30
        System.out.println(j);
        System.out.println(k);

        /* Second datatype double*/

        double d1 = 23.44;
        double d2 = -7.45;
        double d3 = 1000;

        System.out.println("Double value of d1 " + d1);
        System.out.println("Double value of d1 " + d2);
        System.out.println("Double value of d1 " + d3);

        /* Third datatype char*/

        char c1 = 'a';
        char c2 = 'b';
        char c3 = 'c';

        System.out.println("Test "+ c1);
        System.out.println("Test "+ c2);
        System.out.println("Test "+ c3);

        /* 4th Datatype String */

        String s1 = "Jashan";
        String s2 = "Canada wala gyani";
        String s3 = "10.33";

        System.out.println("My Name is " + s1);
        System.out.println("My Name is " + s2);
        System.out.println("My Name is " + s3);

        /* 5th datatype boolean */
        boolean b1 = true;
        boolean b2 = false;

    }

}
