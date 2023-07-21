import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	  public static void swap(ArrayList<Integer> arr,int i,int j){

        int temp=arr.get(i);

        arr.set(i,arr.get(j));

        arr.set(j,temp);

    }

    public static void reverse(ArrayList<Integer> arr,int i,int j){

        while(i<j){

            swap(arr,i,j);

            i++;

            j--;

        }
	}
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) 
	{
		// Write your code here.
		ArrayList<Integer> arr1=new ArrayList<>();

        int index1=-1;

        int index2=-1;

        int n=arr.size();

        for(int i=n-2;i>=0;i--){

            if(arr.get(i)<arr.get(i+1)){

                index1=i;

                break;

            }

        }

        if(index1==-1){

            reverse(arr, 0, n-1);

            for(int i=0;i<arr.size();i++){

            arr1.add(arr.get(i));

        }

        return arr1;

        } else {

            for(int i=n-1;i>=0;i--){

                if(arr.get(i)>arr.get(index1)){

                    index2=i;

                    break;

                }

            }

        }

        swap(arr, index1, index2);

        reverse(arr, index1+1, n-1);

        for(int i=0;i<arr.size();i++){

            arr1.add(arr.get(i));

        }

        return arr1;

    

  
	}
}
