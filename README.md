Demo project for issue: https://github.com/spring-projects/spring-boot/issues/9244

Run with `./gradlew facade:bootRun`

#### Logs

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::  (v2.0.0.BUILD-SNAPSHOT)

2017-05-16 15:03:38.399  INFO 51570 --- [           main] com.example.facade.FacadeApplicationKt   : Starting FacadeApplicationKt on Dariuszs-MacBook-Pro.local with PID 51570 (/Users/dariuszbacinski/workspace/StarTrack/issue9244/facade/build/classes/main started by dariuszbacinski in /Users/dariuszbacinski/workspace/StarTrack/issue9244/facade)
2017-05-16 15:03:38.404  INFO 51570 --- [           main] com.example.facade.FacadeApplicationKt   : No active profile set, falling back to default profiles: default
2017-05-16 15:03:38.505  INFO 51570 --- [           main] .r.c.ReactiveWebServerApplicationContext : Refreshing org.springframework.boot.web.reactive.context.ReactiveWebServerApplicationContext@7a52f2a2: startup date [Tue May 16 15:03:38 CEST 2017]; root of context hierarchy
2017-05-16 15:03:38.765  WARN 51570 --- [           main] .r.c.ReactiveWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanDefinitionStoreException: Failed to parse configuration class [com.example.facade.FacadeApplication]; nested exception is java.io.FileNotFoundException: class path resource [xxx.properties] cannot be opened because it does not exist
2017-05-16 15:03:38.771 ERROR 51570 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Destroy method on bean with name 'org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory' threw an exception

java.lang.IllegalStateException: ApplicationEventMulticaster not initialized - call 'refresh' before multicasting events via the context: org.springframework.boot.web.reactive.context.ReactiveWebServerApplicationContext@7a52f2a2: startup date [Tue May 16 15:03:38 CEST 2017]; root of context hierarchy
        at org.springframework.context.support.AbstractApplicationContext.getApplicationEventMulticaster(AbstractApplicationContext.java:413) [spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.support.ApplicationListenerDetector.postProcessBeforeDestruction(ApplicationListenerDetector.java:97) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.beans.factory.support.DisposableBeanAdapter.destroy(DisposableBeanAdapter.java:233) ~[spring-beans-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.destroyBean(DefaultSingletonBeanRegistry.java:578) [spring-beans-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.destroySingleton(DefaultSingletonBeanRegistry.java:554) [spring-beans-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingleton(DefaultListableBeanFactory.java:951) [spring-beans-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.destroySingletons(DefaultSingletonBeanRegistry.java:523) [spring-beans-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingletons(DefaultListableBeanFactory.java:958) [spring-beans-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.support.AbstractApplicationContext.destroyBeans(AbstractApplicationContext.java:1032) [spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:555) [spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.boot.web.reactive.context.ReactiveWebServerApplicationContext.refresh(ReactiveWebServerApplicationContext.java:49) [spring-boot-2.0.0.BUILD-SNAPSHOT.jar:2.0.0.BUILD-SNAPSHOT]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:795) [spring-boot-2.0.0.BUILD-SNAPSHOT.jar:2.0.0.BUILD-SNAPSHOT]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) [spring-boot-2.0.0.BUILD-SNAPSHOT.jar:2.0.0.BUILD-SNAPSHOT]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:338) [spring-boot-2.0.0.BUILD-SNAPSHOT.jar:2.0.0.BUILD-SNAPSHOT]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1290) [spring-boot-2.0.0.BUILD-SNAPSHOT.jar:2.0.0.BUILD-SNAPSHOT]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1278) [spring-boot-2.0.0.BUILD-SNAPSHOT.jar:2.0.0.BUILD-SNAPSHOT]
        at com.example.facade.FacadeApplicationKt.main(FacadeApplication.kt:15) [main/:na]

2017-05-16 15:03:38.780 ERROR 51570 --- [           main] o.s.boot.SpringApplication               : Application startup failed

org.springframework.beans.factory.BeanDefinitionStoreException: Failed to parse configuration class [com.example.facade.FacadeApplication]; nested exception is java.io.FileNotFoundException: class path resource [xxx.properties] cannot be opened because it does not exist
        at org.springframework.context.annotation.ConfigurationClassParser.parse(ConfigurationClassParser.java:182) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.annotation.ConfigurationClassPostProcessor.processConfigBeanDefinitions(ConfigurationClassPostProcessor.java:308) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.annotation.ConfigurationClassPostProcessor.postProcessBeanDefinitionRegistry(ConfigurationClassPostProcessor.java:228) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanDefinitionRegistryPostProcessors(PostProcessorRegistrationDelegate.java:270) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(PostProcessorRegistrationDelegate.java:93) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:686) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:524) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.boot.web.reactive.context.ReactiveWebServerApplicationContext.refresh(ReactiveWebServerApplicationContext.java:49) ~[spring-boot-2.0.0.BUILD-SNAPSHOT.jar:2.0.0.BUILD-SNAPSHOT]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:795) [spring-boot-2.0.0.BUILD-SNAPSHOT.jar:2.0.0.BUILD-SNAPSHOT]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) [spring-boot-2.0.0.BUILD-SNAPSHOT.jar:2.0.0.BUILD-SNAPSHOT]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:338) [spring-boot-2.0.0.BUILD-SNAPSHOT.jar:2.0.0.BUILD-SNAPSHOT]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1290) [spring-boot-2.0.0.BUILD-SNAPSHOT.jar:2.0.0.BUILD-SNAPSHOT]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1278) [spring-boot-2.0.0.BUILD-SNAPSHOT.jar:2.0.0.BUILD-SNAPSHOT]
        at com.example.facade.FacadeApplicationKt.main(FacadeApplication.kt:15) [main/:na]
Caused by: java.io.FileNotFoundException: class path resource [xxx.properties] cannot be opened because it does not exist
        at org.springframework.core.io.ClassPathResource.getInputStream(ClassPathResource.java:172) ~[spring-core-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.core.io.support.EncodedResource.getInputStream(EncodedResource.java:154) ~[spring-core-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.core.io.support.PropertiesLoaderUtils.fillProperties(PropertiesLoaderUtils.java:98) ~[spring-core-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.core.io.support.PropertiesLoaderUtils.fillProperties(PropertiesLoaderUtils.java:72) ~[spring-core-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.core.io.support.PropertiesLoaderUtils.loadProperties(PropertiesLoaderUtils.java:58) ~[spring-core-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.core.io.support.ResourcePropertySource.<init>(ResourcePropertySource.java:65) ~[spring-core-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.core.io.support.DefaultPropertySourceFactory.createPropertySource(DefaultPropertySourceFactory.java:36) ~[spring-core-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.annotation.ConfigurationClassParser.processPropertySource(ConfigurationClassParser.java:449) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.annotation.ConfigurationClassParser.doProcessConfigurationClass(ConfigurationClassParser.java:272) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.annotation.ConfigurationClassParser.processConfigurationClass(ConfigurationClassParser.java:246) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.annotation.ConfigurationClassParser.parse(ConfigurationClassParser.java:199) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        at org.springframework.context.annotation.ConfigurationClassParser.parse(ConfigurationClassParser.java:168) ~[spring-context-5.0.0.RC1.jar:5.0.0.RC1]
        ... 13 common frames omitted
```

#### Fix
https://github.com/dbacinski/spring-boot-issue-9244/pull/1/files



