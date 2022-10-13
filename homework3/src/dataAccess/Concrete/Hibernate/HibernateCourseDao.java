package dataAccess.Concrete.Hibernate;

import dataAccess.Abstract.CourseDao;
import entities.concrete.Category;
import entities.concrete.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Course added with hibernate.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Course updated with hibernate.");
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
