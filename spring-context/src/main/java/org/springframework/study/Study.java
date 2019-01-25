package org.springframework.study;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhangwei
 * @date: 18:42/2018-12-30
 */
public class Study {

	@Test
	public void classPathXmlApplicationContext(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Bean bean = context.getBean("bean", Bean.class);

		System.out.println(bean.getName());
	}

	@Test
	public void annotationConfigApplicationContext(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.springframework.study");

		Bean bean = context.getBean("bean", Bean.class);

		System.out.println(bean.getName());
	}
}
