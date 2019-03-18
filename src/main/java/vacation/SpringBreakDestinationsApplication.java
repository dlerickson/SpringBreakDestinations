package vacation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vacation.beans.Destination;
import vacation.beans.Duration;
import vacation.controller.BeanConfig;
import vacation.repository.DestinationRepository;

@SpringBootApplication
public class SpringBreakDestinationsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBreakDestinationsApplication.class, args);

		// System.out.println(d.toString());
	}

	@Autowired
	DestinationRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);

		// this destination was created earlier and moved down to overriding method
		Destination d = appContext.getBean("destination", Destination.class);
		// adding the deets
		d.setCountry("Greece");
		d.setProvince("Crete");
		d.setCity("Chania");
		repo.save(d);

		// creating new spot to visit next year
		Destination italy = new Destination("Italy", "Amalfi Coast", "Positano");
		Duration italia = new Duration(3, 14);
		italy.setDuration(italia);
		repo.save(italy);

		List<Destination> myTravelSpots = repo.findAll();
		for (Destination places : myTravelSpots) {
			System.out.println(places.toString());

		}

		((AnnotationConfigApplicationContext) appContext).close();
	}
}
