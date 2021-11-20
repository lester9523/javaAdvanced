package com.example.lester.nio.router;

import java.util.List;

/**
 * @author lester
 * @since 2021/11/17 18:01
 **/
public interface HttpEndpointRouter {
    String route(List<String> endpoints);

}
