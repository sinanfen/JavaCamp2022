package business;

import core.logging.Logger;
import dataAccess.Abstract.InstructorDao;
import entities.concrete.Course;
import entities.concrete.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    List<String> instructors = new ArrayList<String>();

    public void add(Instructor instructor) throws Exception {

        if (instructor.getFirstName() == null) throw new Exception("Instructor has no first name");


        instructors.add(instructor.getFirstName());
        instructorDao.add(instructor);

        for (Logger logger : loggers) {
            logger.log(" Instructor Name: " + instructor.getFirstName());
        }
    }

    ;
}
