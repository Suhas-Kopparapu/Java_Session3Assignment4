package Session3;

import java.util.Scanner;

public class InsertAndSortArray {
	
	public int[] sort(int[] arg1,int l){
		  //Sorting the array
	     int[] arr21 = arg1;
	     int k=l;
	     for(int m4=0;m4<k;m4++){
	    	 for(int m5=0;m5<k;m5++){
	    		 if(arr21[m4]<arr21[m5]){
	    			 int temp =0;
	    			 temp = arr21[m4];
	    			 arr21[m4]=arr21[m5];
	    			 arr21[m5]=temp;
	    		 }
	    	 }
	}
	     return arr21;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
	    int[] arr1 = new int[n];
		System.out.println("Enter Elements in to array");
		for(int i=0;i<n;i++){
			Scanner sc2 = new Scanner(System.in);
			arr1[i] = sc2.nextInt();
		}
		System.out.println("The array entered is ");
		for(int m1=0;m1<n;m1++){
			System.out.println(arr1[m1]);
			
		}
		//intializing a variable for increase in size
int k1 =  arr1.length + 1;
     System.out.println("intializing the new array");
     int[] arr2 = new int[k1];
     Scanner sc3 = new Scanner(System.in);
   
     System.out.println("Enter the position where the element should be inserted");
     int l1 = sc3.nextInt();
   //copying the elements till kth position in the array
     for(int m=0;m<l1;m++){
    	 arr2[m]=arr1[m];
    	// System.out.println("The position is " +m);
     }
     //
     System.out.println("Enter the element in the" +l1  +" position");
     Scanner sc4 = new Scanner(System.in);
     arr2[l1-1] = sc4.nextInt();
     for(int m2=0;m2<l1;m2++){
    	 System.out.println(arr2[m2]);
     }
     for(int n1=l1;n1<k1;n1++){
    	 arr2[n1]=arr1[n1-1];
     }
     System.out.println("Display the new array");
     for(int m3=0;m3<k1;m3++){
    	 System.out.println(arr2[m3]);
     }
     
   InsertAndSortArray i1 = new InsertAndSortArray();
   arr2 = i1.sort(arr2, k1);
    	 //display the sorted array
    	 for(int m6=0;m6<arr2.length;m6++){
    		 System.out.println(arr2[m6]);
    	 }
     }
     
     
     
     
	}


