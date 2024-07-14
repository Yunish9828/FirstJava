import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your Nationality: ");
        String nationality = sc.next();
        if (age >= 18 & nationality.equals("Nepali")) {
            System.out.println("You can vote.");
        }
        else{
            System.out.println("You cannot vote");
        }

    }
}
