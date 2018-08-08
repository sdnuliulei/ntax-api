package com.sdpost.ntax.api.bill.mapper;

import com.sdpost.ntax.api.bill.model.DeclarationInfo;

public interface DeclarationInfoMapper {
    int insert(DeclarationInfo record);

    int insertSelective(DeclarationInfo record);

    DeclarationInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DeclarationInfo record);

    int updateByPrimaryKey(DeclarationInfo record);
}