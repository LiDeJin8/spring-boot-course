package top.ldj.boot.config.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: lenovo
 * @Date: 2025/9/11
 * @Version: 1.0
 */
public interface OssService {
    /**
     * 上传文件
     * @param file 文件
     *
     */
    String upload(MultipartFile file);
}
