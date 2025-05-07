package com.jingdianjichi.oss.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.jingdianjichi.oss.service.FileService;
import com.jingdianjichi.oss.util.MinioUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FileController {

    @NacosValue(value = "${storage.service.type}",autoRefreshed = true)
    private String storageType;

    @Resource
    private FileService fileService;

    @RequestMapping("/testGetAllBuckets")
    public String testGetAllBuckets() throws Exception {
        List<String> allBucket = fileService.getAllBucket();
        return allBucket.get(0);
    }




}

