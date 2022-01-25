package luebbers.net.gitdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("It runs!");
        System.out.println("Neues Feature");
    }
}
