package com.example.lester.nio.filter;

import io.netty.handler.codec.http.FullHttpResponse;

/**
 * @author lester
 * @since 2021/11/17 17:18
 **/
public interface HttpResponseFilter {
    void filter(FullHttpResponse response);
}
