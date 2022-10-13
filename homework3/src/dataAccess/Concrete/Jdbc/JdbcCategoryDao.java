package dataAccess.Concrete.Jdbc;

import dataAccess.Abstract.CategoryDao;
import entities.concrete.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Category added with JDBC.");
    }

    @Override
    public void update(Category category) {
        System.out.println("Category updated with JDBC.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Category deleted.");
    }

    @Override
    public Category getCategoryById(int id) {
        return null;
    }
}
