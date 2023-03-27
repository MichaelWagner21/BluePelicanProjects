class Main {
    public static void main(String[] args){
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";

        System.out.print("\033[H\033[2J");

        System.out.println(s1+">>>"+s1.substring(2,7));
        System.out.println(s2+">>>"+s2.substring(2,7));
        System.out.println(s3+">>>"+s3.substring(2,9));

    }
}