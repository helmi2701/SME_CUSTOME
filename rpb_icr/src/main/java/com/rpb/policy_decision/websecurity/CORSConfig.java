package com.rpb.policy_decision.websecurity;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.DispatcherServlet;

/**------------------------------------------------------------------------------------------------------
* 							NEWGEN SOFTWARE TECHNOLOGIES LIMITED
*Group                                                           : PES
*Project/Product                                                 : Rockland Trust Bank 
*Application                                                     : OAO
*Module                                                          : api
*File Name                                                       : CORSConfig.java
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
public class CORSConfig {

	@Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("PATCH");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
	
	@Bean(name = DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME)
	public DispatcherServlet dispatcherServlet() {
	    DispatcherServlet dispatcherServlet = new DispatcherServlet();
	    dispatcherServlet.setDispatchOptionsRequest(true);
	    return dispatcherServlet;
	}
}
