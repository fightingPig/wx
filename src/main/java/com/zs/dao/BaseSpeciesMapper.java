package com.zs.dao;

import java.util.List;

import com.zs.entity.BaseSpecies;

public interface BaseSpeciesMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseSpecies record);

    int insertSelective(BaseSpecies record);

    BaseSpecies selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseSpecies record);

    int updateByPrimaryKey(BaseSpecies record);

    List<BaseSpecies> selectByFamilyId(String familyId);

    List<BaseSpecies> selectAll();
}
