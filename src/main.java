import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double number;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入数组个数：");
        int n=input.nextInt();
        createArray CreateArray = new createArray();
        int[] data=CreateArray.CREATEARRAR(n);
        math_Max Max = new math_Max();
        number=Max.MAX(n,data);
        System.out.println("数组中的最大整数为"+number);
        math_Sum Sum = new math_Sum();
        number=Sum.SUM(n,data);
        System.out.println("数组中的整数之和为"+number);
        number=number/n;
        System.out.println("数组中的所有整数平均值为"+number);
    }
}
