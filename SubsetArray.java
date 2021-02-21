import java.io.*;
import java.util.*;
public class SubsetArray {
    public static void main(String[]args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int limit=(int)Math.pow(2, arr.length);
        for(int i=0;i<limit;i++){
            String set="";
            int temp=i;

            for(int j=arr.length-1;j>=0;j--){
                int rem=temp%2;
                temp=temp/2;
                if(rem==0){
                    set="-\t"+set;
                }else{
                    set=arr[j]+"\t"+set;
                }
            }
            System.out.println(set);
        }
    }
}
