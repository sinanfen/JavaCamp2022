package business;

import core.logging.Logger;
import dataAccess.Abstract.CourseDao;
import entities.concrete.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    List<String> courseNames = new ArrayList<String>();

    public void add(Course course) throws Exception {

        for (String courseName : courseNames) {
            if (courseName == course.getName()) {
                throw new Exception("A course by this name already exists.");
            }
        }

        if (course.getPrice() < 0) {
            throw new Exception("Course fee must be 0 or more.");
        }

        courseNames.add(course.getName());
        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.log(" Course Name: " + course.getName() + " - Category Name: " + course.getCategory());
        }
    };

    public void update(Course course)throws Exception {
        courseDao.update(course);

        for (Logger logger : loggers) {
            logger.log(" Updated Course Name: " + course.getName() );
        }
    }



}
