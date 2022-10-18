package comworkshop.array;

import java.util.Scanner;

public class DuplicateMax {

    public static void main(String[] args)
    {
        int[]arr =new int[5];
        //System.out.println("Enter the array length");
        int s= arr.length;
        System.out.println("Enter the elements in the array");
        Scanner sc =new Scanner(System.in);
        for (int i=0;i<s;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements in the array are:");
        for (int i=0;i<s;i++)
        {
            System.out.println(arr[i]);
        }
        DuplicateMax ob1= new DuplicateMax();
        System.out.println("The duplicate elements in the array are:");
        ob1.findDuplicate(arr,5);
        System.out.println("The maximum element in the array is:");
        ob1.maxElement(arr,5);

    }
    public static void findDuplicate(int arr[],int s)
    {
        int i,j;
        //int[]arr=new int[5];
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
    public static void maxElement(int arr[],int s)
    {
        //int[]arr=new int[5];
        int i,j,max=arr[0];
        for(i=0;i<5;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The max element in the array is:" +max);
    }
}
