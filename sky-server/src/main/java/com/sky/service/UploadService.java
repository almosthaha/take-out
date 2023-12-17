package com.sky.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author almost
 * @date 2023/12/12 21:22
 */
public interface UploadService {

    String coversUpload(MultipartFile file, String dataPath) throws IOException;
}
