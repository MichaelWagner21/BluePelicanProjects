public class AdvancedBitwise
{
    public static void main(String gg[]){
        int p = 386, q = 581, n = 0;

        final double startTime1 = System.currentTimeMillis();
            for(int j=0; j<2000000000; j++){
                for(int k = 0; k < 20; k++){
                    for(int l = 0; l < 20; l++){
                        n = ((p * 2) + q) / 2;
                    }
                }
        }
        System.out.println(n); 
        final double endTime1 = System.currentTimeMillis();


        final double startTime2 = System.currentTimeMillis();
        for(int j=0; j<2000000000; j++){
            for(int k = 0; k < 20; k++){
                for(int l = 0; l < 20; l++){
                    n = p+(q>>1);
                }
            }
            
        }
        System.out.println(n);
        final double endTime2 = System.currentTimeMillis();


        System.out.println("Loop 1: --- " + ((endTime1 - startTime1)/1000) + " seconds ---");
        System.out.println("Loop 2: --- " + ((endTime2 - startTime2)/1000) + " seconds ---");


    }
}