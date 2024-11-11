import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysDayOne {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        kthSmallLarge(list,6,2);
//        int[] arr = {1,2,3,4,5,6,7};
//maxNMinSum(arr,7);
//        reverseArray(list,3);
        kthSmallLarge(list,6,2);
    }
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
       int left = m+1;
       int right = arr.size()-1;
       while(left <right){
           int temp = arr.get(left);
           arr.set(left,arr.get(right));
           arr.set(right,temp);
       }
    }

    public static int maxNMinSum(int[] arr,int n){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]< min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("min value is "+min);
        System.out.println("max value is "+max);

    return max+min;
    }


    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        //Write your code here

        Collections.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println("kth smallest where K ="+k +" and the element is "+arr.get(k-1));
        result.add(arr.get(k-1));
        System.out.println("kth largest where K ="+k +" and the element is "+arr.get(n-k));
        result.add(arr.get(n-k));
        return result;
    }

    public static int[] sort012(int[] arr){

       int count0 = 0;
       int count1 = 0;
       int count2 = 0;
       for(int i =0;i<arr.length;i++){
           if(arr[i] == 0){
               count0++;
           }
           if(arr[i] == 1){
               count1++;
           }
           if(arr[i] == 2){
               count2++;
           }
       }
       int index =0;
       for(int i =0;i<count0;i++){
           arr[index++] =0;
       }
        for(int i =0;i<count1;i++){
            arr[index++] =1;
        }
        for(int i =0;i<count2;i++){
            arr[index++] =2;
        }
        return arr;

    }


    public static int concatanatedArray(int[] arr, int k){
        int length = arr.length;
        int[] b = new int[k+length];
        for(int i =0;i<k;i++){
            System.arraycopy(arr,0, b, i * arr.length, arr.length);
        }
        int sum =0;
        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<b.length;i++){
            sum +=b[i];
            if(sum >maxi)maxi = sum;
            if(sum<0) sum =0;
        }
        return maxi;
    }

    
}
