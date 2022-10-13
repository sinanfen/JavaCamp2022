package dataAccess.Concrete.Hibernate;

import dataAccess.Abstract.InstructorDao;
import entities.concrete.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor added with hibernate.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Instructor updated with hibernate.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Instructor deleted.");
    }

    @Override
    public Instructor getInstructorById(int id) {
        return null;
    }
}
