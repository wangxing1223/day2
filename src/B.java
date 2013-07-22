/**
 * Created by Administrator on 13-7-22.
 */
public class B {
    public static void main(String[] args) {
        for (int i = 0;i <= 100;i++){
            if(i <=1){
                System.out.println();
            } else{
                int k = 0;
                for (int j = 2; j <= i/2; j++){
                    if (i%j == 0){
                        k = 1;
                        break;
                    }
                }
                if(k == 0)
                    System.out.println(i);
            }
            }

    }
}
