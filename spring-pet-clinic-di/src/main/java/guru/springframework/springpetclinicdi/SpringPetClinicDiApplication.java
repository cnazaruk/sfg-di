package guru.springframework.springpetclinicdi;

import guru.springframework.springpetclinicdi.controllers.MyController;
import guru.springframework.springpetclinicdi.examplebeans.FakeDataSource;
import guru.springframework.springpetclinicdi.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.services", "guru.springframework"})
public class SpringPetClinicDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringPetClinicDiApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUsername());
	}

}
