package Testing;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
        private PersonTest personTest;

    private PersonTest(String name, String surname, int age) {
    }
    private List<PersonTest> people = new ArrayList<>();

    @BeforeEach
    void setUp() {
        people.add(new PersonTest("Mariam", "Gorlovanova", 18));
        people.add(new PersonTest("Oleg", "Zvonkovenko", 32));
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
    @DisplayName("Тестирование передачи параметр в другой объект")
    short compareTo (){
            Assertions.assertEquals(-1,personTest.compareTo());
        return -1;
    }
    @Test
    @DisplayName("Тестирование передачи параметр в другой объект")
    short compareToTwo (){
        Assertions.assertEquals(1, personTest.compareTo() );
        return 1;
    }
}
