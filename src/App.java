public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a = 9;
        float b = a;
        System.out.println(b);
        int z = (int) b;
        System.out.println(z);

        int max = Math.max(10, 2);
        System.out.println("max: " + max);
        int min = Math.min(10, 2);
        System.out.println("min: "+ min);
        double sqrt = Math.sqrt(64);
        System.out.println("sqrt root: " + sqrt);
        int abs = Math.abs(-5);
        System.out.println("absolute: " + abs);
        int random = (int)(Math.random() * 10);
        System.out.println("random number: " + random);
    }
}
