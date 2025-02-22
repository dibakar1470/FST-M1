package activities;

public class Activity12 {
    public static void main(String[] args) {
        Addable ad1 = (a,b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad1.add(111, 120));
    }
}

interface Addable{
    public int add(int num1, int num2);
}
