public class TableOfBases {
    public static void main(String[] args){
        System.out.println("Decimal   Binary    Octal     Hex       Character");
        for (int j = 65; j<=90; j++){
            System.out.println(Integer.toString(j)+"        "+Integer.toBinaryString(j)+"   "+Integer.toOctalString(j)+"       "+Integer.toHexString(j)+"        "+((char)j));
        }
    }
}