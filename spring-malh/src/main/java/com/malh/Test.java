package com.malh;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;


@Controller
@ComponentScan("com.malh")
public class Test {
	private static final Log logger = LogFactory.getLog(Test.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(MALHDao.class);
		annotationConfigApplicationContext.refresh();
		MALHDao malhDao = annotationConfigApplicationContext.getBean(MALHDao.class);
		malhDao.hello();
	}
}
