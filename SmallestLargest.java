//Cleo!
public class SmallestLargest{
    static int largest;
    static int smallest;
    static int[] array = new int[10];
    public static void main(String[] args){
        array[0] = (int)Math.floor(Math.random()*100)+1;
        largest = array[0];
        smallest = array[0];
        for(int i = 1; i < array.length; i++){
            array[i] = (int)Math.floor(Math.random()*100)+1;
            if(array[i]>largest){largest = array[i];}
            if(array[i]<smallest){smallest = array[i];}
        }
        for(int i = 0; i < 10; i++){System.out.print(array[i] + ", ");}
        System.out.println();
        smallestValue();
        largestValue();
    }
    public static int smallestValue(){
        System.out.println(smallest);
        return smallest;
    }
    public static int largestValue(){
        System.out.println(largest);
        return largest;
    }
}