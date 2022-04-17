package manu.com.manu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import manu.com.manu.config.JavaConfig;

public class MainApplication {
    ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
}
