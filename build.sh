#!/bin/sh
# 通过maven构建jar包
mvn clean package
# docker打包，因演示机为arm芯片，特在docker build加上了 paltform参数
docker buildx build -t gyyx/config-map:1.0 --platform=linux/amd64 .
# 推送镜像到 docker 仓库
docker push gyyx/config-map:1.0
# 创建 k8s pod
kubectl apply -f k8s-script.yaml