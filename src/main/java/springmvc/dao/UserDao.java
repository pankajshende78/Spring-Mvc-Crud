package springmvc.dao;

import java.security.PublicKey;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import springmvc.model.Products;



@Component
public class UserDao {

	
	
	@Autowired
	private HibernateTemplate hibernateTeamplate;

	@Transactional
	public int createProducts(Products products) {
		Integer id = (Integer) this.hibernateTeamplate.save(products);

		return id;
	}

	public List<Products> getProducts() {

		List<Products> products = this.hibernateTeamplate.loadAll(Products.class);
		
		return products;

	}
	
	
	@Transactional
	public void deleteProduct(int pid)
	{
		Products p=this.hibernateTeamplate.load(Products.class,pid);
		this.hibernateTeamplate.delete(p);
	}
	
	public Products getProducts(int pid)
	{
	
		return this.hibernateTeamplate.get(Products.class, pid);
	}

}
