package org.springframework;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author: zhangwei
 * @date: 17:31/2018-12-29
 */
public class Study {

	@Test
	public void beanFactory(){
		ClassPathResource resource = new ClassPathResource("bean.xml");

		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

		reader.loadBeanDefinitions(resource);

		System.out.println(beanFactory.getBean("bean", Bean.class).getName());
	}
}
