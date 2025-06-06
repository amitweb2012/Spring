package org.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springorm.config.HibernateConfig;
import org.springorm.dao.StudentDao;
import org.springorm.model.Student;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
//        Student student1 = new Student("Aaradhya Das", "Class 5");
//        int result = studentDao.save(student1);
        Student retrievedStudent = studentDao.findById(1L);
        System.out.println("Retrieved Student: " + retrievedStudent);
        List<Student> retrievedAllStudent = studentDao.findAll();
        System.out.println("Retrieved Student: " + retrievedAllStudent);
        Student retrievedDeleteStudent = studentDao.delete(3L);

    }
}
