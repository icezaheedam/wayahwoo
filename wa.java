import java.util.*;
public class wa {
    public static void main(String[] args) {
     Scanner ta=new Scanner(System.in);
     int i=0;
     for (i=0;i<5;i++){
     System.out.println("ใส่ราคารถ");
     int sa=ta.nextInt();
     System.out.println("ราคาดาวน์");
     int aa=ta.nextInt();
     System.out.println("จำนวนเดือน");
     int ha=sa*aa/100;
     int da=sa-ha;
     int na=ta.nextInt();
     int wa=da/na;
     System.out.println("ดอกเบี้ย");
     int ma=ta.nextInt();
     int oa=wa*ma/100;
     System.out.println("ราคารถ"+sa);
     System.out.println("เงินดาวน์"+ha);
     System.out.println("ไฟแนนซ์"+da);
     System.out.println("จำนวนเดือน"+na);
     System.out.println("ดอกเบี้ย"+ma);
     System.out.println(oa+wa);
     }
    }
}
