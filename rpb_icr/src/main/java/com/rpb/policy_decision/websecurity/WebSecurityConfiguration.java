package com.rpb.policy_decision.websecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**------------------------------------------------------------------------------------------------------
* 							NEWGEN SOFTWARE TECHNOLOGIES LIMITED
*Group                                                           : PES
*Project/Product                                                 : Rockland Trust Bank 
*Application                                                     : OAO
*Module                                                          : api
*File Name                                                       : WebSecurityConfiguration.java
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
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.headers().contentTypeOptions().and().xssProtection().and().cacheControl().and()
				.httpStrictTransportSecurity().and().frameOptions();
		http.csrf().disable();

	}
}
