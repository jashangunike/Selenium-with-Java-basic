package JavaBasic;

import org.apache.xpath.operations.Div;

public class FunctionsinJava {
    public static void main(String[] args) {

        FunctionsinJava obj = new FunctionsinJava();

        obj.test();

        int p = obj.PQR(); // PQR() data comes here
        System.out.println(p);

        String t = obj.XYZ(); // XYZ() data comes here
        System.out.println(t);

        int k = obj.div(30,10); // a/b
        System.out.println(k);

        int u = obj.div(40,10);
        System.out.println(u);

        String z = obj.getName("Hello World");
        System.out.println(z);


    }
     //1. No Input No Output
        public void test()
        {
            System.out.println("Test Method");
        }
        public void test(int a){
            System.out.println("Test Method");
        }
        public void test(int a,int b){
            System.out.println("Test Method");
        }
        public void test(String a, String b){
            System.out.println("Test Method");
        }
         //Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
        // It is similar to constructor overloading in Java,
       // that allows a class to have more than one constructor having different argument lists.

    //2. No input but some output
    public int PQR(){
        System.out.println("PQR Method");
        int a = 20;
        int b = 30;
        int c = 40;
        int d = a+b+c;

        return d;
    }
    public String XYZ(){
        System.out.println("XYZ Method");
        String s = "Selenium with java";

        return s;
    }

    //3. some input some output
    public int div(int a,int b){
        System.out.println("Div Method");
        int c =a/b;

        return c;
    }
    public String getName(String name){
        System.out.println("get name");

        return name;
    }
}
