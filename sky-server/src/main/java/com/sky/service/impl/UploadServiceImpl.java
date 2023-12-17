package com.sky.service.impl;

import cn.hutool.core.util.IdUtil;
import com.sky.service.UploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author almost
 * @date 2023/12/12 21:23
 */

@Service
public class UploadServiceImpl implements UploadService {

    @Override
    public String coversUpload(MultipartFile file, String dataPath) throws IOException {
        //通过将给定的路径名（dataPath）转换为抽象类路径来创建新的实例。
        File imageFolder = new File(dataPath);
        //获取文件后缀名
        String fileSuffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        //上传文件名生成规则-UUID前六位+文件后缀名
        String newFileName = IdUtil.simpleUUID().substring(0, 6) + fileSuffix;
        //从父抽象路径名和子路径名字符串创建新的File实例
        File newFile = new File(imageFolder, newFileName);
        //判断父路径是否存在，如果不存在则新建。
        if (!newFile.getParentFile().exists()) {
            newFile.getParentFile().mkdirs();
        }
        //把内存中File类对象信息写入磁盘
        file.transferTo(newFile);
        //返回文件路径
        return newFile.getPath();
    }
}
