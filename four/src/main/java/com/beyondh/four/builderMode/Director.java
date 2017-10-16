package com.beyondh.four.builderMode;


public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void build(){
       this.builder.buildMethod();
       this.builder.buildHeader();
       this.builder.buildBody();
    }
}
