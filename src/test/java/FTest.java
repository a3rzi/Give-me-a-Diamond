import org.junit.jupiter.api.Test;

public class FTest {
    @Test
    void test1() {
        // Custom integer input received from user
        int n = 5;

        // Printing value before applying absolute function
        System.out.println(
                "Without applying Math.abs() method : " + n);

        // Applying absolute math function and
        // storing it in integer variable
        int value = n/2;

        // Printing value after applying absolute function
        System.out.println(
                "With applying Math.abs() method : " + value);
    }

    @Test
    void test2() {
        int a =5;
        int b =0;
        System.out.println(a-2*b);
    }
}
