import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double number;
        Scanner input=new Scanner(System.in);
        System.out.println("���������������");
        int n=input.nextInt();
        createArray CreateArray = new createArray();
        int[] data=CreateArray.CREATEARRAR(n);
        math_Max Max = new math_Max();
        number=Max.MAX(n,data);
        System.out.println("�����е��������Ϊ"+number);
        math_Sum Sum = new math_Sum();
        number=Sum.SUM(n,data);
        System.out.println("�����е�����֮��Ϊ"+number);
        number=number/n;
        System.out.println("�����е���������ƽ��ֵΪ"+number);
    }
}
