package JavaBasic;

public class WrapperCLASS {
    public static void main(String[] args) {

        //String to int
        String x = "100";
        System.out.println(x+20); //10020

        int y = Integer.parseInt(x);
        System.out.println(y+20); // 120

        //String to double
        String p = "12.33";
        System.out.println(p+20); // 12.3320

        double p1 = Double.parseDouble(p);
        System.out.println(p1+20); // 32.33

        //int to string
        int l = 20;
        System.out.println(l+20); // 40

        String j = String.valueOf(l);
        System.out.println(j+10); // 2010

        //double to string

        double g = 12.02 ;
        String h = String.valueOf(g);
        System.out.println(h+05); //12.025



    }
}
