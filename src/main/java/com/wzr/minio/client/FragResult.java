package com.wzr.minio.client;

import lombok.Data;

import java.util.Set;

/**
 * 分片上传的结果对象
 * @author wzr
 * @date 2023-08-07 20:05
 */
@Data
public class FragResult {

    /**
     * 上传任务是否已完成
     */
    private boolean allCompleted;

    /**
     * 剩下的需要上传的索引
     */
    private Set<Integer> remainIndex;

    /**
     * 附加说明信息
     */
    private String message;
    
    public FragResult(){
        
    }

    public FragResult(boolean completed, Set<Integer> remainIndex) {
        this.allCompleted = completed;
        this.remainIndex = remainIndex;
    }
    
    public FragResult(boolean completed, Set<Integer> remainIndex, String message) {
        this.allCompleted = completed;
        this.remainIndex = remainIndex;
        this.message = message;
    }
}
