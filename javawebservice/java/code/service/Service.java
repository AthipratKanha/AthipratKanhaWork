package service;
import javax.persistence.Persistence;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class Service {
	@RequestMapping("/test-insert-branch")
	String test1() {
		Branch b = new Branch();
		b.name = "Bang Yai";
		b.area = 120.0;
		b.staff = 15;
		try {			
			var factory = Persistence.createEntityManagerFactory("main");
			var manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(b);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) { 
			return e.toString();
		}
		return "OK";
	}
	
	@RequestMapping("/service/check")
	ServiceCheck m1() {
		Runtime r = Runtime.getRuntime();
		double t  = r.totalMemory();
		double f  = r.freeMemory();
		double u  = t - f;
		double p  = u / t * 100;
		return new ServiceCheck(p);
        }
}
