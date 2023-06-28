package com.hibernate.onetonemapping.to1mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		// Configure hibernate.cfg.xml

		configuration.configure("hibernate.cfg.xml");

		// create service registry
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		// build session factory
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Employee1 e = new Employee1("444", "Vasant", "18000", "Male", "25");
		Address a = new Address("100", "Mysore", e);

		e.setAddress(a);
		session.persist(e);
		session.getTransaction().commit();
		session.close();
	}
}
