package JavaBasic;

//This is my Java Code

//* www.github.com/jashangunike

//* jashangunike@gmail.com

//* Author - Jashandeep Singh

public class IncrementDecrement {
    public static void main(String[] args) {

        int i= 10; // i=10
        int j=i++; // Post Increment // here i= 11 j= 10

        System.out.println("Values of j "+ j); // 10
        System.out.println("Values of i "+ i); // 11

        int m = 2;

        int n = ++m; // pre increment

        System.out.println(m); //3
        System.out.println(n); //3

        int x = 3;
        int y = x--; // post decrement
        System.out.println(x); // 2
        System.out.println(y); // 3

        int u = 5;
        int v = --u; // pre decrement
        System.out.println(u); // 4
        System.out.println(v); // 4



    }
}
