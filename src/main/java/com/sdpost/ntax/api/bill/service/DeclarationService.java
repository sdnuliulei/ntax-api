package com.sdpost.ntax.api.bill.service;

import com.sdpost.ntax.api.bill.mapper.DeclarationInfoMapper;
import com.sdpost.ntax.api.bill.model.DeclarationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class DeclarationService {
    @Autowired
    private DeclarationInfoMapper declarationInfoMapper;

    public DeclarationInfo Gets(String pk) throws  Exception{
        DeclarationInfo declarationInfo=declarationInfoMapper.selectByPrimaryKey(pk);
        return declarationInfo;
    }
}
