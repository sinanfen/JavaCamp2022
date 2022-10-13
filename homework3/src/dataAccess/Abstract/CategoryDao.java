package dataAccess.Abstract;


import entities.concrete.Category;

public interface CategoryDao {
    void add(Category category);

    void update(Category category);

    void delete(int id);

    Category getCategoryById(int id);
}
