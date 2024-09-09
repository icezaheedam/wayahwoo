import java.util.*;/**
 * ่่้gao
 */
public class gao {

    public static void main(String[] args) {
        Scanner fa=new Scanner(System.in);
        int ra=fa.nextInt();
        int wa=fa.nextInt();
        int ta=ra*wa;
        if (ra>=8)
        {
            int ea=ta*5/100;
           System.out.println(ta-ea);
        }
   }
}