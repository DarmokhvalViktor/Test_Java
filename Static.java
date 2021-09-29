public class Static {
    static int i = 2;
    public static void main(String[] args){
        Static s1 = new Static();
        Static s2 = new Static();
        System.out.println(s1.i == s2.i);
        i++;
        System.out.println(s1.i == s2.i);
    }
}
