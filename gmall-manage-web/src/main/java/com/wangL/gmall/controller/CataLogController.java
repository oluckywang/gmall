package com.wangL.gmall.controller;


import com.wangL.gmall.bean.PmsBaseCatalog1;
import com.wangL.gmall.bean.PmsBaseCatalog2;
import com.wangL.gmall.bean.PmsBaseCatalog3;
import com.wangL.gmall.service.CatalogService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 分类表 前端控制器
 * </p>
 *
 * @author LiangHuan
 * @since 2020-04-18
 */
@RestController
//@CrossOrigin
public class CataLogController {

    @Reference
    CatalogService catalogService;

    @RequestMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> catalogs = catalogService.getCatalog1();
        return catalogs;

    }


//    @RequestMapping("/getCatalog2")
//    @ResponseBody
//    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
//        List<PmsBaseCatalog2> catalogs = catalogService.getCatalog2(catalog1Id);
//        return catalogs;
//    }
//
//    @RequestMapping("/getCatalog3")
//    @ResponseBody
//    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
//        List<PmsBaseCatalog3> catalogs = catalogService.getCatalog3(catalog2Id);
//        return catalogs;
//    }



}

