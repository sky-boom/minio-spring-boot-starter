package com.wzr.minio.config;


/**
 * 标记文件类型
 * 参考: https://blog.csdn.net/qq_45774645/article/details/124252813
 * 
 * @author wzr
 * @date 2023-04-06 17:17
 */
public enum ContentType {

    /** 默认类型 */
    DEFAULT("default","application/octet-stream"),
    JPG("jpg", "image/jpeg"),
    TIFF("tiff", "image/tiff"),
    GIF("gif", "image/gif"),
    JFIF("jfif", "image/jpeg"),
    PNG("png", "image/png"),
    TIF("tif", "image/tiff"),
    ICO("ico", "image/x-icon"),
    JPEG("jpeg", "image/jpeg"),
    WBMP("wbmp", "image/vnd.wap.wbmp"),
    FAX("fax", "image/fax"),
    NET("net", "image/pnetvue"),
    JPE("jpe", "image/jpeg"),
    RP("rp", "image/vnd.rn-realpix"),
    MP4("mp4", "video/mp4");

    /**
     * 文件名后缀
     */
    private final String suffix;

    /**
     * 返回前端请求头中，Content-Type具体的值
     */
    private final String value;

    public static String getContentType(String suffix){
        if(suffix == null || "".equals(suffix.trim()) ){
            return DEFAULT.getValue();
        }
        suffix = suffix.substring(suffix.lastIndexOf(".") + 1);
        for (ContentType value : ContentType.values()) {
            if(suffix.equalsIgnoreCase(value.getSuffix())){
                return value.getValue();
            }
        }
        return DEFAULT.getValue();
    }

    ContentType(String suffix, String value) {
        this.suffix = suffix;
        this.value = value;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getValue() {
        return value;
    }
}
