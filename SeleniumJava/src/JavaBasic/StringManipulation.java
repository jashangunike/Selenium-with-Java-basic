package JavaBasic;

/*This is my Java Code
 * www.github.com/jashangunike
 * jashangunike@gmail.com
 * Author-Jashandeep Singh */

public class StringManipulation {
    public static void main(String[] args) {

        String s1 = "Peace Not Pieces ";
        String s2 = " We want peace in world ";

        System.out.println(s1.length()); // Total string length
        System.out.println(s1.charAt(5)); // At position 5 char is E in s1 string
        System.out.println(s1.concat(s2)); // s1+s2
        System.out.println(s1.indexOf('P')); // index number of N
        System.out.println(s1.indexOf('o',4)); // index number of o after 4th index number
        System.out.println(s2.indexOf("want")); // index of want
        System.out.println(s2.equals(s1)); // true or false
        System.out.println(s2.toUpperCase()); // s2 comes in capital letters
        System.out.println(s2.isEmpty()); // True or False

        //sub string
        System.out.println(s2.substring(0,9)); // from 0 to 9 index which letter comes

        // trim
        String s3 = "   hello system  ";
        System.out.println(s3.trim()); // trim the s3 string

        //replace
        String s4 = "hello world";
        System.out.println(s4.replace(" ","-")); // Replace space with -


    }
}
