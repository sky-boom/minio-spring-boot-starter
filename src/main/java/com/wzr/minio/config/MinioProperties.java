package com.wzr.minio.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取 Minio 相关配置文件
 * @author wzr
 * @date 2023-04-07 12:08
 */
@SuppressWarnings("ConfigurationProperties")
@ConfigurationProperties(prefix = "minio-util")
public class MinioProperties {

    /**
     * minio服务端地址
     */
    private String url;

    /**
     * minio认证用户名
     */
    private String accessKey;

    /**
     * minio认证密码
     */
    private String secretKey;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
