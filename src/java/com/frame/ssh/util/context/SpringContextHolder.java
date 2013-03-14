/**
 * 
 */
package com.frame.ssh.util.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextHolder implements ApplicationContextAware {
	private static ApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringContextHolder.context = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return context;
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(String id) {
		return (T) context.getBean(id);
	}

}
