# spring-study

configuration metadata 告诉spring容器如何实例化、配置、组装对象。

xml的元数据配置方式，在顶级标签<beans/>下配置<bean>
而注解的方式，在@Configuration下配置@Bean

掌握bean的定义。共有以下几个属性。
* Class  
* Name  
* Scope
* Constructor arguments
* Properties
* Autowiring mode
* Lazy initialization mode
* Initialization method
* Destruction method