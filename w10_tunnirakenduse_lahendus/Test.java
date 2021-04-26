public class Test {
    public static < T > void printArray( T[] inputArray ) {
       for(T element : inputArray) {
          System.out.printf("%s ", element);
       }
       System.out.println();
    }
    public static < T > void switchArray( T[] inputArray ) {
        T firstElement = inputArray[0];
        T lastElement= inputArray[(inputArray.length)-1];
        inputArray[0] = lastElement;
        inputArray[(inputArray.length)-1] = firstElement;
        printArray(inputArray); 
     }
     public static < T extends Comparable<T>> void orderArray( T[] inputArray, int DESC ) {
         
         T temp = inputArray[0];
         for(int j = 1; j < inputArray.length; j++) {
         for(int i = 1; i < inputArray.length; i++) {
         if(DESC == 1){
           
            if(inputArray[i-1].compareTo(inputArray[i]) > 0){
                temp = inputArray[i-1];
                inputArray[i-1] = inputArray[i];
                inputArray[i] = temp;
            }
         }else{
            if(inputArray[i-1].compareTo(inputArray[i]) < 0){
                temp = inputArray[i-1];
                inputArray[i-1] = inputArray[i];
                inputArray[i] = temp;
            }
         }
        }}
        printArray(inputArray); 
     }
     public static < T > void reverseArray( T[] inputArray ) {
        
        for(int i = 0; i < (inputArray.length/2); i++) {
            T temp = inputArray[i];
            inputArray[i]= inputArray[(inputArray.length)-1-i];
            inputArray[(inputArray.length)-1-i] = temp;
        }
        printArray(inputArray); 
     }
    public static void main(String args[]) {
       Integer[] intArray = { 1,9,2,8,3,7};
       Double[] doubleArray = { 1.1, 2.2, 3.3,4.4  };
       Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
       Character[] charArray2 = { 'T','o','i','m','i','k' };
 
       System.out.println("Originaalne integerArray:");
       printArray(intArray);
       System.out.println("Esimene/Viimane vahetatud integerArray:");
       switchArray(intArray);
       System.out.println("Järjestatud väiksem ees integerArray:");
       orderArray(intArray,1);
       System.out.println("Ümberpööratud integerArray:");
       reverseArray(intArray);

       System.out.println("Originaalne doubleArray:");
       printArray(doubleArray);
       System.out.println("Esimene/Viimane vahetatud doubleArray:");
       switchArray(doubleArray);
       System.out.println("Järjestatud suurim ees integerArray:");
       orderArray(doubleArray,0);
       
       
       
       System.out.println("originaalne characterArray:");
       printArray(charArray);
       System.out.println("Esimene/Viimane vahetatud characterArray:");
       switchArray(charArray);
       System.out.println("Järjestatud väiksem ees characterArray:");
       orderArray(charArray,1);
       System.out.println("Ümberpööratud characterArray2:");
       reverseArray(charArray2);

    }
 }