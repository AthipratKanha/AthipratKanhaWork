package service;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity @Table(name="staff")
public class Staff {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	int number;
	
	@Column(nullable=false)
	String name;
	
	@Column(unique=true, nullable=false)
	String email;
	
	double salary;
	char gender;
}
