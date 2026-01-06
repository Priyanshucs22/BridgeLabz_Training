public class throwandthrows {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
    }
    public static void methodA() throws Exception {
        System.out.println("In method A");
        methodB();
    }
    
    public static void methodB() throws Exception {
        System.out.println("In method B");
        throw new Exception("Exception thrown in method B");
    }
}