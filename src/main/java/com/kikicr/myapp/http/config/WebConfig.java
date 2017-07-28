package com.kikicr.myapp.http.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.kikicr.myapp.http.filter.CustomSiteMeshFilter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
	
	@Bean
	public FilterRegistrationBean siteMeshFilter(){
		FilterRegistrationBean filter = new FilterRegistrationBean();
		CustomSiteMeshFilter siteMeshFilter = new CustomSiteMeshFilter();
		filter.setFilter(siteMeshFilter);
		
		return filter;
	}
	
	 @Bean
	 public ViewResolver getViewResolver() {
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	        resolver.setPrefix("/WEB-INF/views/");
	        resolver.setSuffix(".jsp");
	        return resolver;
	 }
	 
	 /**
	  * multi language interceptor bean
	  * */
	 @Bean
	 public LocaleChangeInterceptor localeChangeInterceptor() {
	     LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
	     lci.setParamName("lang");
	     
	     return lci;
	 }
	
	 
	 /**
	  * interceptor register
	  * */
	 @Override
	public void addInterceptors(InterceptorRegistry registry) {
		 //multi language interceptor
		 registry.addInterceptor(localeChangeInterceptor());
		 super.addInterceptors(registry);
		
	 }
}
