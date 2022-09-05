import static org.junit.jupiter.api.Assertions.*;

class IsPairTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("IsPairTest.setUp");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("IsPairTest.tearDown");
    }

    @org.junit.jupiter.api.Test
    void isPair() {
        String str = "()";
        boolean isPair = IsPair.isPair(str);
        System.out.println("is pair:" + isPair);
        assertTrue(isPair);

        str = "()[]{}";
        isPair = IsPair.isPair(str);
        System.out.println("is pair:" + isPair);
        assertTrue(isPair);

        str = "(]";
        isPair = IsPair.isPair(str);
        System.out.println("is pair:" + isPair);
        assertTrue(!isPair);
    }
}