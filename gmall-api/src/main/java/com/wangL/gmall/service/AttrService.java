package com.wangL.gmall.service;



import com.wangL.gmall.bean.PmsBaseAttrInfo;

import java.util.List;


public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
}
