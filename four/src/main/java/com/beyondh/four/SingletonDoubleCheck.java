package com.beyondh.four;

public class SingletonDoubleCheck {
    private static SingletonDoubleCheck instance = null;

    private Order order;
    private SingletonDoubleCheck(){
        order = new Order();
        order.setOrderId("abcdef");
        order.setRoomCount(1);
    }
    public Order getOrder(){
        return order;
    }

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
