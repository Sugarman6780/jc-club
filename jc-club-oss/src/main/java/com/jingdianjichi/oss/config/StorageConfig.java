package com.jingdianjichi.oss.config;

import com.jingdianjichi.oss.adapter.MinioStorageAdapter;
import com.jingdianjichi.oss.adapter.StorageAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class StorageConfig {

    @Value("${storage.service.type}")
    private String storageType;

    @Bean
    @RefreshScope
    public StorageAdapter storageAdapter(){
        if("minio".equals(storageType)){
            return new MinioStorageAdapter();
        } else{
            throw new IllegalArgumentException("未找到对应文件存储处理器");
        }
    }
}
