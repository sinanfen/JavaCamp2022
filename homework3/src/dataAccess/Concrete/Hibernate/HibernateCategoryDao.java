package dataAccess.Concrete.Hibernate;

import dataAccess.Abstract.CategoryDao;
import entities.concrete.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Category added with hibernate.");
    }

    @Override
    public void update(Category category) {
        System.out.println("Category updated with hibernate.");
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
