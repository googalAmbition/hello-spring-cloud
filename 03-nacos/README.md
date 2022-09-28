
```docker
docker pull nacos/nacos-server:v2.1.1-slim
```

```docker
docker run -itd --name nacos \
    -p 8848:8848 \
    -p 9848:9848 \
    -p 9849:9849 \
    -e PREFER_HOST_MODE=hostname \
    -e MODE=standalone \
    nacos/nacos-server:v2.1.1-slim

```