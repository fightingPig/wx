package com.zs.dao;

import java.util.List;

import com.zs.entity.BaseFamily;

public interface BaseFamilyMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseFamily record);

    int insertSelective(BaseFamily record);

    BaseFamily selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseFamily record);

    int updateByPrimaryKey(BaseFamily record);

    List<BaseFamily> selectFamilyByOrderId(String orderId);

    List<BaseFamily> selectAll();
}
