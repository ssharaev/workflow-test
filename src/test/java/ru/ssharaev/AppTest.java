package ru.ssharaev;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AppTest {

    @Test
    void contextLoads() {
    }

    @Test
    void simpleTest() {
        assertThat("1").isEqualTo("1");

    }

}
