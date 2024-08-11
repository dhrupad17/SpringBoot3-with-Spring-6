package com.telusko;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

//        Introduction
//        ===============================================

//        Alien obj= (Alien) context.getBean("alien");
//        obj.code();

//           Object Creation

//        ==============================================

//          Alien obj1= (Alien) context.getBean("alien1");
//          obj1.code();
//
//          Alien obj2=(Alien)context.getBean("alien1");
//          obj2.code();

//         Scopes

//        ===============================================

//        Alien obj= (Alien) context.getBean("alien1");
//        obj.age=21;
//        System.out.println(obj.age);





    }
}
