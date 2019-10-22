public class LoopANDLabel {
    public static void main (String[] args){
        breaking:  // ETYKIETA
        for (int j=0; j<10; j++){
            for (int i=0; i<j; i++){
                if (i==5) break breaking;  //ETYKIETA

            }
        }
    }
}
