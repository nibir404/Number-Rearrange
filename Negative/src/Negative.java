public class Negative {
    public static void main(String[] args) {
        int a [] = {-1,-6,5,6,-3,1};
        int n = a.length;

        rearrange(a,n);
        PrintArray(a,n);


    }

    public static  void rearrange(int a[],int n){
        int temp;
        int j=0;

        for (int i=0;i<n;i++){
            if(a[i]<j){
                if(i!=j){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
    }

    public static void PrintArray(int a[],int n){
        for (int i =0; i<n ; i++){
            System.out.println(a[i]+" ");
        }
    }
}
