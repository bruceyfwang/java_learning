package com.beyondh.four.builderMode;


public class HttpRequest {
    protected String method;
    protected String header;
    protected String body;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void sendHttpMessage(){
        System.out.println("http method：" + method);
        System.out.println("http header：" + header);
        System.out.println("http body ：" +  body);
    }
}
