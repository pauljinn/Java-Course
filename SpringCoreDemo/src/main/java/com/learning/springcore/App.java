package com.learning.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        BeanFactory bf = new XmlBeanFactory(new FileSystemResource("configuration.xml"));
        BeanFactory bf = new ClassPathXmlApplicationContext("configuration.xml");
        Coder coder = (Coder) bf.getBean("coder");
        coder.code();
        System.out.println(coder);
        
        
    }
}
