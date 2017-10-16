package com.beyondh.four.builderMode;


public abstract class Builder {
     protected HttpRequest httpRequest;

     public abstract void buildMethod();

     public abstract void buildHeader();

     public abstract void buildBody();

     public void sendHttpMessage(){
         httpRequest.sendHttpMessage();
     }
}







