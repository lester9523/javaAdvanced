package com.example.lester.spring.injection;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author lester
 * @since 2021/12/5 15:22
 * 构造器手动注入
 **/
public class XmlDependencyConstructorInjectionDemo {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        String resourcePath = "classpath:/META-INF/dependency-constructor-injection.xml";
        xmlBeanDefinitionReader.loadBeanDefinitions(resourcePath);
        User user = beanFactory.getBean(User.class);
        System.out.println(user);

    }
}
