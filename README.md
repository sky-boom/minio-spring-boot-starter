# minio-spring-boot-starter

该组件封装了Minio基本的上传文件的方法，但仍可能存在大量的Bug，后续可能会持续优化。

对于该组件在项目中的应用，可参考项目：[https://github.com/sky-boom/rendisk](https://github.com/sky-boom/rendisk)

该组件的创建初衷是为了将Minio操作从原项目中抽离出来，以实现功能解耦。

## 组件使用方法

**（1）引入组件**

方式1：通过jitpack.io来引入到项目

在`pom.xml`文件中添加如下内容：

```xml

<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.sky-boom</groupId>
        <artifactId>minio-spring-boot-starter</artifactId>
        <version>1.0.0</version>
    </dependency>
</dependencies>

```

方式2：直接下载本项目

下载本项目后，通过`mvn`命令打包成`jar`，然后引入到项目中即可。

**（2）配置yml文件**

在 `application.yml` 中添加如下配置：

```yml
minio-util:
  url: http://192.168.xx.133:9000 #换成自己的minio服务端地址
  access-key: xxx    # 认证用户名
  secret-key: xxx    # 认证密码
```

**（3）注解注入使用**

```java
public class Service {
    @Autowired
    private MinioUtils minioUtils;
    ...
}
```

如需使用原生的Minio API，可直接注入MinioClient

```java
public class Service {
    @Autowired
    private MinioClient minioClient;
    ...
}
```

