package JavaBasic;

/*This is my Java Code
 * www.github.com/jashangunike
 * jashangunike@gmail.com
 * Author-Jashandeep Singh */


public class finalkeyword {
    public static void main(String[] args) {

        final int speed = 60; //final values cannot change

        final int i = 40;
              //i=20; here this value not updated
              //i=30; here this value not final updated
        System.out.println(i);
        System.out.println(speed);
    }
}
