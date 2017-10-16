package com.beyondh.four.builderMode;


public class HttpPostRequestBuilder extends Builder {
    public HttpPostRequestBuilder() {
        httpRequest = new HttpPostRequest();
    }

    @Override
    public void buildMethod() {
        httpRequest.setMethod("post");
    }

    @Override
    public void buildHeader() {
        httpRequest.setHeader("content-type:appliaction/json");
    }

    @Override
    public void buildBody() {
        httpRequest.setBody("jsonbody");
    }
}
