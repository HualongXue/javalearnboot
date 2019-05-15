package cn.huimin.learnboot.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.*;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@Configuration
@MapperScan(basePackages="cn.huimin.learnboot.dao")
public class DataConfig{
 private Logger log=LoggerFactory.getLogger(this.getClass());
 
 @Bean(name="mysql")
 @ConfigurationProperties(prefix="datasource.testdb-mysql")
 public DataSource createDS(){
     log.info("--创建数据源");
  return DataSourceBuilder.create().build();
 }
}
