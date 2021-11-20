package com.example.lester.nio.filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

/**
 * @author lester
 * @since 2021/11/17 17:16
 **/
public interface HttpRequestFilter {
    void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx);
}
