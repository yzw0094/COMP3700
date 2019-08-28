package Assignment2;

public class Finder {
 public static Integer findMax(int[] intArray) {
     if (intArray == null || intArray.length == 0) {
         return null;
     }
     int mx = intArray[0];
     for (int a = 0; a < intArray.length; a++) {
      if (mx < intArray[a]) {
          mx = intArray[a];
      }
     }
     return mx;
 }

 public static Integer findMin(int[] intArray) {
     if (intArray == null || intArray.length ==0) {
         return null;
     }
      int mn = intArray[0];
     for (int b = 0; b < intArray.length; b++) {
         if (mn > intArray[b])
             mn = intArray[b];
     }
     return mn;
     }
}

