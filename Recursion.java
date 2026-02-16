public class Recursion{

//DECREASING ORDER
public static void printDec(int n){
        if(n==1){
        System.out.println(n);
        return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    
//INCREASING ORDER
public static void printIncrease(int n){
        if(n==1){
        System.out.println(n);
        return;
    }
  
                printIncrease(n-1);
                System.out.print(n+" ");
    }
   
// FACTORIAL OF NUMBER
public static int facto(int n){
    if(n == 0){
        return 1;
    }
    int fact=facto(n-1);
    int fn = n * facto(n-1);
    return fn;
   }
   
//sum of first n natural numbers
public static int naturalSum(int n){
    if(n==1){
        return 1;
    }

    int Sum1 = naturalSum(n-1);
    int Sn = n + Sum1;
    return Sn;

}


//Nth fibonacci number
public static int fibonacciNum(int n){
    if(n==0 || n == 1){
        return n;
    }
    int fnm1=fibonacciNum(n-1);
    int fnm2=fibonacciNum(n-2);
    int fn=fnm1 + fnm2;
    return fn;
}

//checking array is sorted or not
public static boolean arraySorted(int number[],int i){
   if(i == number.length-1){
    return true;
   }
   
   
    if(number[i]> number[i+1]){
    return false;
   }

 return  arraySorted(number ,i+1);
}

//find the first occurence of an element in an array
public static int firstOccurence(int numbers[], int key, int i){
    if(i == numbers.length){
        return -1;
    }
    if(numbers [i] == key){
        return i;
    }
    return firstOccurence(numbers,key,i+1);
}

//last occurence of an element in array
public static int lastOccurence(int numbers[], int key, int i){
    if(i == numbers.length){
        return -1;
    }   
    int isFound = lastOccurence(numbers,key , i+1);
    if(isFound == -1 && numbers[i] == key){
        return i;
    }
    return isFound;
}

//printing x to the power n
public static int power(int x, int n){
    if(n == 0){
        return 1;
    }
    int xnm1 = power(x,n-1)
    int xn = x* xnm1;
    return xn;
    return x * power(x,n-1);
}

//optimized x to the power n
public static int optimizedPower(int a, int n){
    if(n == 0){
        return 1;
    }
    int halfpower = optimizedPower(a, n/2);
    int halfPowerSq = halfpower * halfpower;
if(n % 2 != 0){
    halfPowerSq = a * halfPowerSq;
}
return halfPowerSq;
}

//Tiling problem
public static int tilling(int n){//2 x n(floor size)
    if(n == 0 || n == 1){
        return 1;
    }
    //vertical choice
   int fnm1 = tilling(n-1);

   //horizontal
   int fnm2 = tilling(n-2);

   int toWays = fnm1 + fnm2;
   return toWays;

}

//Remove Duplicates in a string in small characters
 public static void removeDuplicaes(String str, int idx , StringBuilder newStr, boolean map){
    if(idx == str.length()){
        System.out.println(newStr);
        return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar-'a'] == true){
        removeDuplicares(str, idx+1, newStr, map);
    }
    else{
        map[currChar-'a'] = true;
        removeDuplicates(str,idx+1, newStr.append(currChar),map);
    }
 }
 */
 //friends pairing problem
 public static int pairing(int n){
    if(n == 1 || n == 2){
        return n;
    }

    //single
    //choice

    int fnm1 = pairing(n-1);

    //pair
    int fnm2 = pairing(n-2);
    int pairWas = (n-1) * fnm2; 

    int twoWays = fnm1 + pairWas;
    return twoWays;
 }

//Binary Strings problem consecutives
public static void printBinString(int n,int lastplace, String str){


if(n == 0){
    System.out.println(str);
    return;
}
    printBinString(n-1,0,str+"0");
    {
        if(lastplace == 0){
            printBinString(n-1,1,str+"1");
        }
    }
}

//DIVIDE AND CONQUER
//MERGE SORT
public static void printArr(int arr[]){
    for(int i=0;i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
public static void mergeSort(int arr[], int si, int ei){
    if(si >= ei){
        return;
    }
    
    
    //kam
    int mid = si + (ei - si)/2;
    mergeSort(arr, si, mid);
    mergeSort(arr, mid+1, ei);
    merge(arr, si, mid, ei);
}
public static void merge(int arr[], int si, int mid, int ei){
    int temp[]= new int[ei - si+1];
    int i = si;//iterator for left part
    int j = mid+1;//iterator for right part
    int k = 0;//iterator for temp arr
    while(i <= mid && j <= ei){
        if(arr[i] < arr[j]){
            temp[k] = arr[i];
            i++;k++;
        }
        else{
            temp[k] = arr[k];
            j++;
        }
        k++;
    }
    //left part
    while(i <= mid){
        temp[k++] = arr[i++];
    }
    //right part
    while(j <= ei){
        temp[k++] = arr[j++];
    }
    for(k=0, i=si;k<temp.length;k++, i++){
        arr[i] = temp[k];
    }

}






 public static void main(String[] args){
    int arr[] ={6,3,9,5,2,8};
    mergeSort(arr,0,arr.length-1);
    printArr(arr);
    int n=5;
    printDec(n);
    printIncrease(n);
    System.out.println(facto(n));
     System.out.println(naturalSum(n));
    System.out.println(fibonacciNum(n));
    int numbers[]={1,5,5,1};
    System.out.println(arraySorted(number,0));
    System.out.println(firstOccurence(numbers,5,0));
    System.out.println(lastOccurence(numbers,n,0));
     System.out.println(power(100,2));
    System.out.println(optimizedPower(100,2));
    System.out.println(tilling(5));
    String str="madhavgaikwaddddmadhavv";
    removeDuplicates(str,0,new StringBuilder(""), new boolean[26]);
    System.out.println(pairing(3));
    printBinString(3,0, "");


    }
}