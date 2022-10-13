package business;

import core.logging.Logger;
import dataAccess.Abstract.CategoryDao;
import entities.concrete.Category;

import java.util.ArrayList;
import java.util.List;


public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }


    List<String> cateogryNames = new ArrayList<String>();

    public void add(Category category) throws Exception {
        for (String categoryName : cateogryNames) {
            if (categoryName.equals(category.getName())) {
                throw new Exception("This category already exists.");
            }
        }

        cateogryNames.add(category.getName());
        categoryDao.add(category);

        for (Logger logger : loggers) {
            logger.log( " Category Name: " + category.getName());
        }
    }


}
