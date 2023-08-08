package com.wzr.minio.config;

/**
 * @author wzr
 * @date 2023-04-07 20:36
 */
public class GlobalException extends RuntimeException{
    
    public GlobalException(){
        
    }
    
    public GlobalException(String message) {
        super("[minio-starter] ".concat( message ));
    }
}
