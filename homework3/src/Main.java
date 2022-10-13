import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.Concrete.Hibernate.HibernateCategoryDao;
import dataAccess.Concrete.Hibernate.HibernateCourseDao;
import dataAccess.Concrete.Hibernate.HibernateInstructorDao;
import dataAccess.Concrete.Jdbc.JdbcCategoryDao;
import dataAccess.Concrete.Jdbc.JdbcCourseDao;
import dataAccess.Concrete.Jdbc.JdbcInstructorDao;
import entities.concrete.Category;
import entities.concrete.Course;
import entities.concrete.Instructor;


public class Main {
    public static void main(String[] args) throws Exception {

        //CATEGORY (Kategori ismi tekrar edemez)
        Logger[] loggers = {new DatabaseLogger()};
        Category category1 = new Category(1, "Java");
        Category category2 = new Category(2, "C#");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        CategoryManager categoryManager2 = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);

        System.out.println("----");

        categoryManager2.add(category2);

        System.out.println("----");

        // COURSE: (Kurs ismi tekrar edemez + Kurs fiyatı 0'dan az olamaz.)
        Course course1 = new Course(1, "Spring Boot", "Java", "Engin Demiroğ", 50);
        Course course2 = new Course(2, ".NET Core 5 WEB API", "C#", "Engin Demiroğ", 75);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
        CourseManager courseManager2 = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);
        courseManager.update(course1);
        System.out.println("----");

        courseManager2.add(course2);

        System.out.println("----");

        //INSTRUCTOR:
        Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
        Instructor instructor2 = new Instructor(2, "Alper", "Tunga");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        InstructorManager instructorManager2 = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor1);

        System.out.println("----");

        instructorManager2.add(instructor2);


    }
}