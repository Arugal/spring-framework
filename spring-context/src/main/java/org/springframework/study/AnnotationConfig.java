package org.springframework.study;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhangwei
 * @date: 19:39/2018-12-30
 */
@Configuration
@ComponentScan(basePackages = "org.springframework")
public class AnnotationConfig {

	@org.springframework.context.annotation.Bean
	public Bean bean(Wrapp wrapp){
		Bean bean = new Bean();
		bean.setWrapp(wrapp);
		return bean;
	}
}
