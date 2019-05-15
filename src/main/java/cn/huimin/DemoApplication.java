
package cn.huimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.slf4j.*;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class DemoApplication{
 protected static Logger log=LoggerFactory.getLogger(DemoApplication.class);

 public static void main(String[] args){
  SpringApplicationBuilder builder=new SpringApplicationBuilder(DemoApplication.class);
  ConfigurableApplicationContext context=builder.run(args);
  log.info("--started");
 }
}