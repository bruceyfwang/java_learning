package com.beyondh.four;

public class  SingletonEnum{
    enum  Singleton{
        INSTANCE;

        private Order order;
        private Singleton(){
            order = new Order();
            order.setOrderId("123456");
            order.setRoomCount(1);
        }
        public Order getOrder(){
            return order;
        }
    }
}