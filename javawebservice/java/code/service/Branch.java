
package service;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity @Table(name="branch")
public class Branch {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	int number;
	
	String name;
	double area;
	
	transient int staff;
}