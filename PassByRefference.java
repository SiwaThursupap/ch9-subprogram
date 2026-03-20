public class PassByRefference {
    public static void main() {
        Number n1 = new Number();
        n1.number = 100;
        AddOne(n1);
        IO.println(n1.number);
    }

    static void AddOne(Number n){
        n.number++;
    }

}