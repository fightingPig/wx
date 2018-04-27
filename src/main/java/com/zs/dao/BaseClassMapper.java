package com.zs.dao;

import com.zs.entity.BaseClass;

public interface BaseClassMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseClass record);

    int insertSelective(BaseClass record);

    BaseClass selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseClass record);

    int updateByPrimaryKey(BaseClass record);
}