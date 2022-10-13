package dataAccess.Concrete.Jdbc;

import dataAccess.Abstract.CourseDao;
import entities.concrete.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Course added with JDBC.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Course updated with JDBC.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Course deleted.");
    }

    @Override
    public Course getCourseById(int id) {
        return null;
    }
}
