package dataAccess.Concrete.Jdbc;

import dataAccess.Abstract.InstructorDao;
import entities.concrete.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor added with JDBC.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Instructor updated with JDBC.");
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
