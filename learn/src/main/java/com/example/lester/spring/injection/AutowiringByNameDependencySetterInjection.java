package com.example.lester.spring.injection;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author lester
 * @since 2021/12/5 18:32
 * setter自动注入
 **/
public class AutowiringByNameDependencySetterInjection {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        String resourcePath = "classpath:/META-INF/autowiring-dependency-setter-injection.xml";
        xmlBeanDefinitionReader.loadBeanDefinitions(resourcePath);
        User user = beanFactory.getBean(User.class);
        System.out.println(user);

    }
}
