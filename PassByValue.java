public class PassByValue {
    public static void main(String[] args) {
        Number n1 = new Number();
        n1.number = 100;

        AddOne(n1.number); 

        System.out.println(n1.number);
    }

    static void AddOne(int number) {
        number++;
    }
}