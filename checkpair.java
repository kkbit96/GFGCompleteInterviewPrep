import java.util.*;
import java.io.*;
import java.lang.*;
public class checkpair {
    static boolean checkpair(int arr[], int sum){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int comp=sum-arr[i];
            if(hs.contains(comp))
            return true;
            hs.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {5, 9, 8, 13, 2, 4};
        int sum = 7;
        System.out.println(checkpair(arr,sum));
    }
}
