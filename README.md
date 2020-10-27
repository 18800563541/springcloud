# springcloud
思路方法：
1、导入依赖
2、编写配置文件
3、开启这个功能 @EnableXXX
4、配置类

=====================================================

监控地址：

http://localhost:7001/  eureka监控

http://localhost:9001/hystrix   hystrix监控

====================================================

创建mysql数据库：db01，db02，db03

修改hosts：C:\Windows\System32\drivers\etc\hosts

======================================================

springcloud-api	//pojo，客户端feign的service，以及客户端Hystrix的服务降级

springcloud-config-client-3355		//spring cloud config 的客户端测试

springcloud-config-dept-8001		//服务提供端使用spring cloud config配置

springcloud-config-eureka-7001		//eureka注册中心的使用spring cloud config配置

springcloud-config-server-3344		//spring cloud config 的服务端

springcloud-consumer-dept-80		//消费端，RestTemplate访问远程服务，使用ribbon做负载均衡

springcloud-consumer-dept-feign	//消费端，使用feign用面向接口的模式访问远程服务，接口service在springcloud-api中

springcloud-consumer-hystrix-dashboard	//断路器hystrix的监控服务，访问地址，http://localhost:9001/hystrix

springcloud-eureka-7001		//eureka监控集群1

springcloud-eureka-7002		//eureka监控集群2

springcloud-eureka-7003		//eureka监控集群3

springcloud-provider-dept-8001		//服务提供端1

springcloud-provider-dept-8002		//服务提供端2

springcloud-provider-dept-8003		//服务提供端3

springcloud-provider-dept-hystrix-8001	//服务提供的，整合hystrix，服务熔断，主要注解@HystrixCommand

springcloud-zuul-9527			//网关服务，重定向服务访问地址

sql					//测试数据库db01，db02，db03
