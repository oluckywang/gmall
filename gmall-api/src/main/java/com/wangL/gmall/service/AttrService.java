package com.wangL.gmall.service;



import com.wangL.gmall.bean.PmsBaseAttrInfo;
import com.wangL.gmall.bean.PmsBaseAttrValue;
import com.wangL.gmall.bean.PmsBaseSaleAttr;

import java.util.List;


public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
