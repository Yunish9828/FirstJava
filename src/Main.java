public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is " + sum);

        float radius = 5f;
        float pi = 3.14f;
        float area = pi * radius * radius;
        System.out.println("The area of the circle is " + area);

        int principle = 1230000;
        int time = 4;
        int rate = 8;
        int Simple_Interest = (principle * time * rate)/100;
        System.out.println("The Simple Interest is " + Simple_Interest);

        int num = 23;
        if(num % 2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}

