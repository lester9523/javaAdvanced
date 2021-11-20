package com.example.lester.nio.filter;

import io.netty.handler.codec.http.FullHttpResponse;

/**
 * @author lester
 * @since 2021/11/17 17:20
 **/
public class HeaderHttpResponseFilter implements HttpResponseFilter {
    @Override
    public void filter(FullHttpResponse response) {
        response.headers().set("kk", "java-1-nio");
    }
}