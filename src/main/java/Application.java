import model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CustomerService;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService customerService = app.getBean("customerService", CustomerService.class);
        printCustomerName(customerService.findAll());
    }

    private static void printCustomerName(List<Customer> customers) {
        customers.forEach(x-> System.out.println(x.getFirstName() + " " + x.getLastName()));
    }
}
