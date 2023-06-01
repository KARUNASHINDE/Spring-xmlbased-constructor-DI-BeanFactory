package com.jsp.beanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class PenDriver {
	public static void main(String[] args) {
		
//		using BeanFactory..
		ClassPathResource classPathResource = new ClassPathResource("myspring1.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		 Pen pen= (Pen)beanFactory.getBean("myPen");
		pen.print();
		
		
////		using Application context
//		
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring");
//		Pen pen1 =(Pen) applicationContext.getBean("myPen");
//		pen1.print();
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
		
	}


