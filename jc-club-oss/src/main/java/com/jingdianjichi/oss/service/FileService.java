package com.jingdianjichi.oss.service;

import com.jingdianjichi.oss.adapter.StorageAdapter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileService {

    private final StorageAdapter storageAdapter;

    public FileService(StorageAdapter storageAdapter){
        this.storageAdapter = storageAdapter;
    }

    public List<String> getAllBucket(){
        return storageAdapter.getAllBucket();
    }
}
