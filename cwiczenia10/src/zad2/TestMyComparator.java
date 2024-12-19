package zad2;

public class TestMyComparator implements MyComparator{
    @Override
    public int compare(int a, int b) {
        return MyComparator.super.compare(a, b);
    }

    public static void main(String[] args) {
        TestMyComparator testMyComparator = new TestMyComparator();
        System.out.println(testMyComparator.compare(1,7));
    }
}
