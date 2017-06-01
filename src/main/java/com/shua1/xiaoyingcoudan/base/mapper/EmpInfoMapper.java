package com.shua1.xiaoyingcoudan.base.mapper;

import com.shua1.xiaoyingcoudan.base.model.EmpInfo;

public interface EmpInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmpInfo record);

    int insertSelective(EmpInfo record);

    EmpInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmpInfo record);

    int updateByPrimaryKey(EmpInfo record);
}