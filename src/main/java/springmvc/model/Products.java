package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String Name;
	private String Discription;
	private long Price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDiscription() {
		return Discription;
	}

	public void setDiscription(String discription) {
		Discription = discription;
	}

	public long getPrice() {
		return Price;
	}

	public void setPrice(long price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", Name=" + Name + ", Discription=" + Discription + ", Price=" + Price + "]";
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int id, String name, String discription, long price) {
		super();
		this.id = id;
		Name = name;
		Discription = discription;
		Price = price;
	}

}
