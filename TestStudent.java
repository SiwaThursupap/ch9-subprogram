public class TestStudent {
    public static void main(String[] args) {
        student s1 = new student(68, "Siwa", 3.72);
        student s2 = new student(69, "Manee", 2.5);
        student s3 = new student(45, "Aalale", 1.0);
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        IO.println(s1.getInfo());
        //s1.gender = true;

        String productName = new String("Macbook Neo");
        IO.println(productName);

    }
}
