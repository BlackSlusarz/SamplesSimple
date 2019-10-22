public class BreakCont {
    public static void main (String[] args){
        int [] numbers = {1,5,4,2,3,1,5,4};
        int n = 0;
        for (int i =0; i<numbers.length; i++){
            System.out.println("number " + numbers[i]);
            if (numbers[i]%2==0){
                break;
            }
            System.out.println("nie bylo parzystej liczby");
        }
    }
}
