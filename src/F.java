import javax.print.attribute.standard.QueuedJobCount;

/**
 * Created by Administrator on 13-7-22.
 */
public class F {
    public static void main(String[] args) {
        for (int a = 0;a <= 100; a++){
            for (int b = 0;b <= 50; b++){
                for (int c = 0;c <= 20; c++){
                    if (a + 2*b + 5*c == 100){
                        System.out.print(a);
                        System.out.print("    ");
                        System.out.print(b);
                        System.out.print("    ");
                        System.out.print(c);
                        System.out.println();
                        break;
                    }
                }
            }
        }
    }
}