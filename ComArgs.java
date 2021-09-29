public class ComArgs {
    public static void main(String[] args){
        if (args.length == 3) {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        } else {
            throw new IllegalArgumentException("Program needs to start with three args");
        }
    }
}
