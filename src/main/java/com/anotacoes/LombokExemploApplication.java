package com.anotacoes;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.Product;

@SpringBootApplication
public class LombokExemploApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LombokExemploApplication.class, args);
		Product p1 = new Product(1L, "TV", 900.45);
		p1.setName("Television");
		// Product p2 = new Product(2L, "Notebook", 2367.16);
		System.out.println(p1);
		System.out.println(p1.getName());
		System.out.println(p1.hashCode());
		System.out.println(p1.getClass());
		System.out.println(p1.getId());

		Product p2 = Product.builder().name("Tablet").price(45.99).id(3L).build();
		System.out.println(p2);
	}
}
