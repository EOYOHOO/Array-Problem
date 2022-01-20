public class math_Max {
    public int MAX(int x,int[] a){
        if(x == 0) {
            return 0;//数组为空
        }
        if(x == 1) {
            return a[x - 1];//数组中只有一个元素
        }
        return (a[x-1] > MAX(x-1,a)?a[x-1]:MAX(x-1,a));//递归
    }
}
