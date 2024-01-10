package ru.ssharaev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    private static final int ARRAY_MASK = 1 << 31;
    private static final int CONST_MASK = 1 << 30;
    private static final int TYPE_MASK = ARRAY_MASK | CONST_MASK;
    public static void main(String[] args) {
        //SpringApplication.run(App.class, args);
        System.out.println(0.3 == 3.0 /10);
        System.out.println(Integer.toString(TYPE_MASK, 2));
    }
}