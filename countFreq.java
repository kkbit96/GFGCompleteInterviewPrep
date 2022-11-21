import java.util.*;
import java.io.*;
import java.lang.*;
public class countFreq {
    static void countfreq(int[] arr , int n){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i]))
                hm.put(arr[i],hm.get(arr[i])+1);
            else hm.put(arr[i],1);    
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        countfreq(arr,n);
    }
}
