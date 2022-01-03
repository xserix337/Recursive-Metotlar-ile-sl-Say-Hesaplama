import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();

        int[] dizi = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(dizi);

        System.out.println(Arrays.toString(dizi));
        int i;
        for (i=0; i < dizi.length; i++) {
            if(dizi[i] > num)
                break;
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + dizi[i-1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+ dizi[i]);


    }
}
