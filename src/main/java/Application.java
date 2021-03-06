import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CustomerService customerService = new CustomerServiceImpl();
		
		/**
		 * We are using the interface CustomerService and not the CustomerServiceImpl class , therefore
		 * it does things behind the scenes.
		 * 
		 * We are also loading the applicationContext.xml at the root of the application by specifying the ClassPath for the same.
		 */
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = applicationContext.getBean("customerService",CustomerService.class);
		System.out.println(customerService);
		/**
		 * The below and above code have different instance names of CustomerService but
		 * they have been specified as singleton scope in applicationContext.xml so
		 * they will both return the same object address.
		 */
		CustomerService customerService1 = applicationContext.getBean("customerService",CustomerService.class);
		System.out.println(customerService1);
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
