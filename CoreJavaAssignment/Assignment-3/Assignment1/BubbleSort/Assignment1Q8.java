package BubbleSort;

public class Assignment1Q8 {
    public static void main(String[] args){
        int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);//sorting array elements using bubble sort  
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

      }   
    
}
