package com.codegym.dao.category;

import com.codegym.model.Category;
import com.codegym.model.Story;

import java.util.List;

public interface ICategoryDAO {
    List<Category> findAll();

    Story findStoryById(int id);
}
