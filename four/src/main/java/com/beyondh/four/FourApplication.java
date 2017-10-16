package com.beyondh.four;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FourApplication {

	public static void main(String[] args) {

		Order order = SingletonEnum.Singleton.INSTANCE.getOrder();
		System.out.println(order.OrderId);

		order = SingletonDoubleCheck.getInstance().getOrder();
		System.out.println(order.OrderId);
	}
}
