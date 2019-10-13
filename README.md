# 175--Spring boot + Zipkin

springboot-zipkin

Zipkin示例项目

启动步骤：
（1）Zipkin-server ；（2）springboot-zipkin0；（3）springboot-zipkin1；（4）springboot-zipkin2。

This case is based on Spring boot to implement the micro-service call chain, which uses Zipkin framework.
本案例基于Spring boot来实现微服务调用链，微服务调用链采用Zipkin框架。


zipkin-server的管理Web
http://127.0.0.1:9411/

通过调用其中一个服务springboot-zipkin0，达到服务之间的调用。该服务会调用springboot-zipkin1和springboot-zipkin2。
http://127.0.0.1:8080/service0

会自动调用
http://127.0.0.1:8081/service1
http://127.0.0.1:8082/service2