import java.util.*;
public class Equil {
    static int equillibrium(int arr[],int n)
    {
        int sum=0;
        int rum=0;
//sum of all the elements
        for(int i=0;i<n;i++)
        sum=sum+arr[i];
        for(int i=0;i<n;i++)
        {
//sub each element from sum
            sum=sum-arr[i];
            if(rum==sum)
            return i;
//add each element to rum
            rum=rum+arr[i];
        }
        return-1;
    }
    public static void main(String args[]) {
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     arr[i]=scan.nextInt();
     

      System.out.println(equillibrium(arr,n));
    }
}