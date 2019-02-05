package com.component.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		User user = new User(0, "John Doe", "johndoe", "John123", "john@gmail.com");

		Comment comment1 = new Comment(0,
				"laudantium enim quasi est quidem magnam voluptate ipsam eos tempora quo necessitatibus", user);
		Comment comment2 = new Comment(0,
				"est natus enim nihil est dolore omnis voluptatem numquam et omnis occaecati quod ullam at voluptatem error expedita",
				user);
		
		session.persist(comment1);
		session.persist(comment2);

		transaction.commit();
		session.close();
		System.out.println("Saved");

	}
}
