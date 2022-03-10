package com.codegym.dao.part;

import com.codegym.model.Part;

import java.util.List;

public interface IPartDAO {
    List<Part> seleceAllPartOfStory(int storyID);

    Part selectById(int id);


}
