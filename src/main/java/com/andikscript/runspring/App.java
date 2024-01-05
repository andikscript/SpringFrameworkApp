package com.andikscript.runspring;

import com.andikscript.runspring.controller.StudentController;
import com.andikscript.runspring.scan.ScanConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello andik!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(ScanConfig.class);

        StudentController studentController = context.getBean(StudentController.class);
        studentController.getAllStudent();
    }
}
