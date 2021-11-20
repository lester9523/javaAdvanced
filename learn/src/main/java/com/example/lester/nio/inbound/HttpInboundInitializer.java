package com.example.lester.nio.inbound;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.channel.socket.SocketChannel;
import java.util.List;

/**
 * @author lester
 * @since 2021/11/17 17:38
 **/
public class HttpInboundInitializer extends ChannelInitializer<SocketChannel> {

    private List<String> proxyServer;

    public HttpInboundInitializer(List<String> proxyServer) {
        this.proxyServer = proxyServer;
    }


    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline p = socketChannel.pipeline();
//		if (sslCtx != null) {
//			p.addLast(sslCtx.newHandler(ch.alloc()));
//		}
        p.addLast(new HttpServerCodec());
        //p.addLast(new HttpServerExpectContinueHandler());
        p.addLast(new HttpObjectAggregator(1024 * 1024));
        p.addLast(new HttpInboundHandler(this.proxyServer));

        proxyBizFilter(p);
    }

    private void proxyBizFilter(ChannelPipeline p) {

    }
}
