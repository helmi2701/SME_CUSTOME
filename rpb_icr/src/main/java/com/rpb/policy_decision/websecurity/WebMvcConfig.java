package com.rpb.policy_decision.websecurity;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;


/**------------------------------------------------------------------------------------------------------
* 							NEWGEN SOFTWARE TECHNOLOGIES LIMITED
*Group                                                           : PES
*Project/Product                                                 : Rockland Trust Bank 
*Application                                                     : OAO
*Module                                                          : api
*File Name                                                       : WebMvcConfig.java
*Author                                                          : shreya 
*Date (DD/MM/YYYY)                                         		 : Sep 15,2018
*Description                                                     : Online Account Opening
*-------------------------------------------------------------------------------------------------------
*CHANGE HISTORY
*-------------------------------------------------------------------------------------------------------
*Problem No/CR No   Change Date   Changed By    Change Description
*
*/

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
	
	@Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.propertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE);
        builder.serializationInclusion(JsonInclude.Include.NON_NULL);
//        builder.modulesToInstall(StringSanitizerModule.class);
        converters.add(new MappingJackson2HttpMessageConverter(builder.build()));
    }

}
