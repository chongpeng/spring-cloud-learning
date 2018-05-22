# spring-cloud-learning
spring-cloud-learning
首先启动注册中心：spring-cloud-eureka
然后启动生产者：spring-cloud-producter （可改变端口启动两个生产者服务） 用于验证 ribbon 负载均衡
 (Spring cloud有两种服务调用方式，一种是ribbon+restTemplate，另一种是feign。在这一篇文章首先讲解下基于ribbon+rest)
最后启动消费者：spring-cloud-consumer

访问服务： http://IP:PORT/consumer/1
