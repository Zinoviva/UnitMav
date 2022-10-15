package Testing;

import org.junit.jupiter.api.*;

@DisplayName("Тестирование: PersonSurnameComporatorTest")
public class PersonSurnameComporatorTest {
    private PersonSurnameComporatorTest personSurnameComporatorTest;

    @BeforeEach
    void setUp() {
        personSurnameComporatorTest = new PersonSurnameComporatorTest();
        System.out.println("Вызываюсь до выполнения теста");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Вызываюсь после вызова теста");
    }

    @BeforeAll
    static void setUpApp() {
        System.out.println("Запускаюсь до выполнения всех тестов...");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Запускаюсь после выполнения всех тестов...");
    }

    @Test
    @DisplayName("Тестирование компоратора")
    int compare() {
        Assertions.assertEquals(1,personSurnameComporatorTest.compare());
        return 1;
    }

}
