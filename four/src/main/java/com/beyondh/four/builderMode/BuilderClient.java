package com.beyondh.four.builderMode;


public class BuilderClient {
    public static void main(String[] args) {
        Builder httpGetBuilder= new HttpGetRequestBuilder();

        Director director = new Director(httpGetBuilder);

        director.build();
        httpGetBuilder.sendHttpMessage();

        Builder httpPostRequestBuilder= new HttpPostRequestBuilder();

        director = new Director(httpPostRequestBuilder);

        director.build();
        httpPostRequestBuilder.sendHttpMessage();


    }
}
