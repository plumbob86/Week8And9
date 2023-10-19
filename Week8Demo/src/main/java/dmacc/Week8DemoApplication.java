package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

import dmacc.beans.Forest;
import dmacc.config.ForestBeanConfig;
import dmacc.repo.IForestRepo;

@SpringBootApplication
public class Week8DemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(Week8DemoApplication.class, args);
	}
	
	/*@Override
	public void run(String... args) throws Exception {
		doWork();
	}

	

	
	public void doWork() {
		System.out.println("persisting records");
		persistRecords();
		System.out.println("done");
		
		System.out.println("getting records");
		
		for(Forest f : getForests()) {
			System.out.println(f.toString());
		}
		System.out.println("done");
	}
	
	private void persistRecords() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ForestBeanConfig.class);
		Forest forest = context.getBean("forest", Forest.class);

		forest.setName("Black Forest");
		forest.setLocation("Germany");
		
		repo.save(forest);
	}
	
	private List<Forest> getForests(){
		return repo.findAll();
	}*/

}
