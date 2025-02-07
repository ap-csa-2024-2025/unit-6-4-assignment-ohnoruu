import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    // replace with your code
    return 0;
  }

  public static int indexOf(double[] arr, double target)
  {
    // replace with your code
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    // replace with your code
    for (int currentI=0; currentI<arr.length(); currentI++){
      for (int i=0; i<arr.length(); i++){
          if ((arr[currentI]==(arr[i])) && (i!=currentI)){
            return true;
          } 
      }
    }
    return false;
  }

  public static String findMode(String[] arr)
  {
    int count=0;
    int max=0;
    for (int currentI=0; currentI<arr.length(); currentI++){ //count occurence of each value
      for (int i=0; i<arr.length(); i++){
        if ((i!=currentI)&&(arr[currentI]==(arr[i]))){ //same value is found but not the same index
          count++; //count for current value
        }
      }
    if (count>max){
      max=count;
    }
    }
  return max;
  }
}
