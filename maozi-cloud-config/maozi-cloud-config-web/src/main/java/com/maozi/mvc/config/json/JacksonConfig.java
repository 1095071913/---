package com.maozi.mvc.config.json;

import cn.hutool.core.util.ClassUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maozi.utils.MapperUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Configuration
public class JacksonConfig {

	@Bean
	public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {

		ObjectMapper objectMapper = builder.createXmlMapper(false).build();

		MapperUtils.setObjectMapperConfig(objectMapper);
		
		return objectMapper;
		
	}

	@Bean
    public MappingJackson2HttpMessageConverter httpMessageConverter(ObjectMapper objectMapper) {
		
        ClassUtil.scanPackage("com.maozi").stream().forEach(item -> {
        	
        	if(item.isEnum()) {
        		objectMapper.configOverride(item).setFormat(JsonFormat.Value.forShape(JsonFormat.Shape.OBJECT));
        	}
        	
        });
        
        return new MappingJackson2HttpMessageConverter(objectMapper);
        
    }

}
