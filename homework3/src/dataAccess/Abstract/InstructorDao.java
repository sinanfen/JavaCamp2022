package dataAccess.Abstract;

import entities.concrete.Instructor;

public interface InstructorDao {
    void add(Instructor instructor);

    void update(Instructor instructor);

    void delete(int id);

    Instructor getInstructorById(int id);
}
