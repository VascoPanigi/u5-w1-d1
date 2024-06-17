package vascopanigi.u5_w1_d1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vascopanigi.u5_w1_d1.entities.menu.Menu;

@SpringBootApplication
@Slf4j
public class U5W1D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W1D1Application.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5W1D1Application.class);

        Menu menu = context.getBean(Menu.class);
        menu.printMenu();


        context.close();


    }

}
