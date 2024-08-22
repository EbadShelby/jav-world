import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // int a = 9;
        // float b = a;
        // System.out.println(b);
        // int z = (int) b;
        // System.out.println(z);

        // int max = Math.max(10, 2);
        // System.out.println("max: " + max);
        // int min = Math.min(10, 2);
        // System.out.println("min: " + min);
        // double sqrt = Math.sqrt(64);
        // System.out.println("sqrt root: " + sqrt);
        // int abs = Math.abs(-5);
        // System.out.println("absolute: " + abs);
        // int random = (int) (Math.random() * 10);
        // System.out.println("random number: " + random);


        // String first = "joe";
        // String second = "jake";
        
        // String box;
        // box = first;
        // first = second;
        // second = box;
        // System.out.println(first);
        // System.out.println(second);

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your first name ?");
        String firstName = scanner.nextLine();

        System.out.println("What's your last name ?");
        String lastName = scanner.nextLine();

        System.out.println("sup " + firstName + " " + lastName);

        System.out.println("How about your age? how old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println(age + "? "+ "that's cool!");

        System.out.println("What's your fave food?");
        String food = scanner.nextLine();
        System.out.println("that's also one of my favorite food!, "  + food);
    }
}
