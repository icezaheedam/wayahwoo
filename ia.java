import java.util.*;
public class ia {
    public static void main(String[] args) {
    Scanner sa=new Scanner(System.in);
    int da=sa.nextInt();
    int fa=sa.nextInt();
    if (fa>=1&&fa<=5) {
        int ya=da*10/100;
        System.out.println("เงินเดือน"+(da+ya));

    }
    if (fa>=6&&fa<=15) {
        int ya=da*20/100;
        System.out.println("เงินเดือน"+(da+ya));
        
    }
    if (fa>=16) {
        int ya=da*40/100;
        System.out.println("เงินเดือน"+(da+ya));
        
    }
    }
}
