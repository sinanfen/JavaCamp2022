package dataAccess.Abstract;

import entities.concrete.Course;


public interface CourseDao {
    void add(Course course);

    void update(Course course);

    void delete(int id);

    Course getCourseById(int id);
}
