package com.codegym.dao.partImage;

import com.codegym.model.PartImage;

import java.util.ArrayList;
import java.util.List;

public interface IPartImageDAO {
        List<PartImage> selectAllImg(int storyId, int partId);

}
