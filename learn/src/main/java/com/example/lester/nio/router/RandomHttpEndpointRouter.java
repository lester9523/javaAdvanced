package com.example.lester.nio.router;

import java.util.List;
import java.util.Random;

/**
 * @author lester
 * @since 2021/11/17 18:03
 **/
public class RandomHttpEndpointRouter implements HttpEndpointRouter{
    @Override
    public String route(List<String> urls) {
        int size = urls.size();
        Random random = new Random(System.currentTimeMillis());
        return urls.get(random.nextInt(size));
    }
}
