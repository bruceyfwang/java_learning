package com.beyondh.four.builderMode;


public class HttpGetRequestBuilder extends Builder {

    public HttpGetRequestBuilder() {
        httpRequest = new HttpGetRequest();
    }

    @Override
    public void buildMethod() {
        httpRequest.setMethod("get");
    }

    @Override
    public void buildHeader() {
        httpRequest.setHeader("content-type:appliaction/json");
    }

    @Override
    public void buildBody() {
        httpRequest.setBody("");
    }
}
