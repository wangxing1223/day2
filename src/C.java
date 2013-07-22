/**
 * Created by Administrator on 13-7-22.
 */
public class C {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++){
            double m1 = Math.pow(i/1000,4);
            double m2= Math.pow(i%1000/100,4);
            double m3 = Math.pow(i%100/10,4);
            double m4= Math.pow(i%10,4);
            if (m1 + m2 + m3 + m4 == i)
                System.out.println(i);
        }
    }
}
