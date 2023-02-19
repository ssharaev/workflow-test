package ru.ssharaev;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {App.class, H2TestProfileJPAConfig.class})
@ActiveProfiles("test")
class AppTest {

    @Test
    void contextLoads() {
    }

    @Test
    void simpleTest() {
        assertThat("1").isEqualTo("1");

    }

    @Test
    void simpleTest2() {
        assertThat("1").isEqualTo("1");

    }

    @Test
    void simpleTest3() {
        assertThat("1").isEqualTo("1");

    }

}
