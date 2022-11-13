package com.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bean.Player;

public class test {

	public static void main(String[] args) {
		
			
			Resource r=new ClassPathResource("com/resorces/c.xml");
			
			BeanFactory b=new XmlBeanFactory(r);
			
		    Player p=(Player) b.getBean("bean"); 
		    
		    System.out.println(p.toString());
			
			System.out.println("done");
			

	}

}
