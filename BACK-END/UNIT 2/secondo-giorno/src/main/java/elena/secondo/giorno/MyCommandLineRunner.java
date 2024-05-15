package elena.secondo.giorno;

import elena.secondo.giorno.bean.Menu;
import elena.secondo.giorno.bean.Order;
import elena.secondo.giorno.bean.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SecondoGiornoApplication.class);
        try {
            Menu menu = ctx.getBean("menu", Menu.class);
            menu.printMenu();

            System.out.println("Tavolo scelto:");
            Table t1 = ctx.getBean("Table-1", Table.class);
            t1.print();
            System.out.println("-------------");

            System.out.println("Ordine scelto:");
            Order order = ctx.getBean("Order-1", Order.class);
            order.print();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
