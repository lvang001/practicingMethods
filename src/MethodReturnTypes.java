public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println(Say());
        System.out.println(Int());
        System.out.println(IsTrue());
        
    }

    public static String Say () {
        return ("string of text");
    }

    public static int Int () {
        return (5);
    }

    public static boolean IsTrue () {
        return (true);
    }
}
