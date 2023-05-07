package com.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {

		Session ses = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();
		//ses.save(new Product(87, "fh", 55.5));
		Product p = (Product) ses.get(Product.class, 4900);
		System.out.println(p);
		Product h=(Product) ses.merge(new Product(87, "update", 55.5));
		tx.commit();
		System.out.println(h);

	}
}
