package JavaBasic;

public class StaticArray {
    public static void main(String[] args) {


        //1.int
        int i[]= new int[4];
        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;

        System.out.println(i[0]);
        System.out.println(i[0]+i[3]);
        System.out.println(i.length); // length of array

        for (int k=0;k<i.length;k++) // print all the value of array
        {
            System.out.println(i[k]);
        }

        //2.double
        double d[] = new double[2];
        d[0]=12.33;
        d[1]=15.45;

        System.out.println(d[0]+d[1]);

        System.out.println(d.length);

        // 3. char
        char c[] = new char[2];
        c[0]= 'a';
        c[1]= 'b';


        //4. boolean
        boolean b[] = new boolean[2];

        //5.STRING
        String s[] = new String[2];
        s[0] = "Jashan";
        s[1] = "deep";
        System.out.println(s[0]+s[1]);

    }
}
