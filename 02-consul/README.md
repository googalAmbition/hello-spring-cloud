# 1、console server 单机搭建

```docker
docker pull consul:1.11.10
```

```docker
docker run -itd \
    -p 8500:8500  \
    -e CONSUL_BIND_INTERFACE='eth0' \
    --name=consul \
    consul:1.11.10 \
    agent -server -bootstrap -ui -client='0.0.0.0'
```

- agent: 表示启动 agent 进程
- server: 表示 consul 为 server 模式
- client: 表示 consul 为 client 模式
- bootstrap: 表示这个节点是 Server-Leader
- ui: 启动 Web UI, 默认端口 8500
- node: 指定节点名称, 集群中节点名称唯一
- client: 绑定客户端接口地址, 0.0.0.0 表示所有地址都可以访问
- name 给这个容器起个名字