public class math_Max {
    public int MAX(int x,int[] a){
        if(x == 0) {
            return 0;//����Ϊ��
        }
        if(x == 1) {
            return a[x - 1];//������ֻ��һ��Ԫ��
        }
        return (a[x-1] > MAX(x-1,a)?a[x-1]:MAX(x-1,a));//�ݹ�
    }
}
