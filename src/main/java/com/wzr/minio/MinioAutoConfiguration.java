package com.wzr.minio;

import com.wzr.minio.client.MinioUtils;
import com.wzr.minio.config.MinioProperties;
import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzr
 * @date 2023-04-08 10:59
 */
@Configuration
@ConditionalOnClass({MinioUtils.class})
@EnableConfigurationProperties(MinioProperties.class)
public class MinioAutoConfiguration {
    
    @Autowired
    private MinioProperties minioProperties;
    
    /** 供Utils类使用 */
    @Bean("minioUtils")
    public MinioUtils minioUtils() {
        MinioClient client = MinioClient.builder()
                .endpoint(minioProperties.getUrl())
                .credentials(minioProperties.getAccessKey(), minioProperties.getSecretKey())
                .build();
        return new MinioUtils(client);
    }
    
}
