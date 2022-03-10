package com.codegym.dao.story;

import com.codegym.model.Part;
import com.codegym.model.Story;

import java.util.List;

public interface IStoryDAO {

    List<Story> selectAllStory();
    List<Story> selectByCategoryId(int categoryId);
    List<Story> selectByName(String name);

}
