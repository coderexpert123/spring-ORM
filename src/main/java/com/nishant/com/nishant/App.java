package com.nishant.com.nishant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nishant.com.nishant.dao.StudentDao;
import com.nishant.com.nishant.entiies.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/nishant/com/nishant/config.xml");
    	StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    	Student student=new Student(11,"Nishant","Hyd");
    	
    	studentDao.insertStudent(student);
    	System.out.println("Data added!");
    
    }
}
