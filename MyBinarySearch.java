// Write a binary search using recursion.

package org.aadi.test.binarySearch; 

import java.util.Arrays;

public class MyBinarySearch {

public static int myBinarySearch (int[] sortedArray, int start, int end, int key) {
if (start < end) {
int mid = start + (end - start) / 2;
if (key < sortedArray[mid]) {
return myBinarySearch(sortedArray, start, mid, key);
} 
else if (key > sortedArray[mid]) {
return myBinarySearch(sortedArray, mid+1, end , key);
} 
else {
return mid;
}
}
return -(start + 1);
}

public static void main(String[] args) {
    
int[] array = {87,37,2914,90,0,181,8020,-921,9};   //say user input of array.

Arrays.sort(array);   //let sort it first before implementing recursive Binary search
System.out.print("The sorted array is : ");
System.out.printf(Arrays.toString(array));

int arrayIndex = myBinarySearch(array,0,array.length,90);
System.out.println("\n\n Found 90 at array index : "+arrayIndex);
arrayIndex = myBinarySearch(array,0,array.length,-921);
System.out.println("\n Found -921 at array index : "+arrayIndex);
arrayIndex = myBinarySearch(array,0,array.length,8020);
System.out.println("\n Found 8020 at array index : "+arrayIndex);
arrayIndex = myBinarySearch(array,0,array.length,9);
System.out.println("\n Found 9 at array index : "+arrayIndex);
}
}
