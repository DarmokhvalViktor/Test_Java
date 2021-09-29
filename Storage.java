public class Storage {
    static final String S = "Storage";

    public static void main(String[] args){
        Storage storage = new Storage();
        System.out.println(storage.storage(Storage.S));
        System.out.println(S);
    }
    int storage(String s) {
        return s.length() * 2;
    }
}
