import java.util.Scanner;

public class createArray {
    public int[] CREATEARRAR(int n){
        Scanner input=new Scanner(System.in);
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("�������"+(i+1)+"��ֵΪ");
            a[i]=input.nextInt();
        }
        return a;
    }
}
