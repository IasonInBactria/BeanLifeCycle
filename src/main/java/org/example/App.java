package org.example;

import org.example.mapper.BookMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookMapper mapper = (BookMapper) context.getBean("bookMapper");
        mapper.save();
    }
}
