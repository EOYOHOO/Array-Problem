public class math_Sum {
    public int SUM(int x,int[] a){
        if(x==0) {
            return 0;// ����Ϊ��
        }
        if(x==1) {
            return a[x - 1];// ������ֻ��һ��Ԫ��
        }
        return (a[x-1]+SUM(x-1,a));//�ݹ�
    }
}
