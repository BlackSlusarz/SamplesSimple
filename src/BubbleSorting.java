public class BubbleSorting {
    public static void main(String [] args){
        int [] array = {1,12,3,10,5,6,7};

        for (int i=0; i<array.length; i++){
            for (int j=1; j <(array.length-i); j++){
                if (array[j-1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int element : array){
            System.out.println("value = " + element);
        }
    }
}
