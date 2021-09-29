public class Incrementable {

    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        sf.increment(); // i + 1
        Incrementable.increment(); // i + 1
        System.out.println(StaticTest.i);
    }

    static void increment() {
        StaticTest.i++;
    }
}
class StaticTest {
    static int i = 47;
}