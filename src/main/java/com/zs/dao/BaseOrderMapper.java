package com.zs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zs.entity.BaseOrder;

@Repository
public interface BaseOrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseOrder record);

    int insertSelective(BaseOrder record);

    BaseOrder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseOrder record);

    int updateByPrimaryKey(BaseOrder record);

    List<BaseOrder> selectAll();

    BaseOrder selectOrderByClassId(String classId);
}
